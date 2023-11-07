import java.util.Random;
import java.util.Scanner;

public class ExemploThreads extends Thread{
	private static final long TOTAL_NUMEROS = 1_000_000_000L;
	private final long numerosGerar;
	
	public ExemploThreads(long numerosGerar) {
		this.numerosGerar = numerosGerar;
		System.out.printf("Thread %d criado\n", getId());
	}

	public static void main(String args[]) {
		final int threads;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de threads a ser criada: ");
		threads = sc.nextInt();
		final long numerosPorThread = (TOTAL_NUMEROS/threads);
		System.out.println("Criando "+threads+" threads");
		for (int i = 0; i < threads; i++) {
			new ExemploThreads(numerosPorThread).start();
		}
		
	}

	@Override
	public void run(){
		//cálculo da soma de mil números random elevado a 10ª
		System.out.println("Iniciando Thread " + getId());
		final double startTime = System.currentTimeMillis();
		Random rand = new Random();
		double soma = 0;
		for(int i = 0; i < numerosGerar; i++) {
			soma += Math.pow(rand.nextDouble(), 10);
		}
		
		//retorna o número calculado por threads e o tempo de cálculo
		final double totalSecs = (System.currentTimeMillis() - startTime)/1000.0;
		System.out.println(soma);
		System.out.printf("Finalizando em %.2f segundos\n", totalSecs);
	}
}
