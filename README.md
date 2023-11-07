# Threads
Este é um exercício manipulando Threads.

  Este código foi projetado para mostrar como é possível usar threads em Java para realizar tarefas em paralelo.
Cada thread criada representa uma unidade independente de processamento que executa um cálculo específico, neste caso, a geração e soma de números aleatórios elevados à décima potência. 
Isso permite a distribuição do trabalho entre múltiplos núcleos de CPU, aproveitando ao máximo o potencial de paralelismo.
  O código divide a tarefa de gerar e somar um grande número de valores aleatórios em várias threads, permitindo que o usuário especifique o número de threads a serem criadas. 
A ideia é comparar o desempenho quando diferentes números de threads são usados. Ao executar o programa com um número maior de threads, ele pode explorar a capacidade do processador do usuário para processar tarefas em paralelo e determinar como o desempenho é afetado.
  O programa imprime o tempo que cada thread leva para concluir sua tarefa, o que possibilita comparar o desempenho das threads em relação ao tempo de execução. Isso ajuda a visualizar como o paralelismo afeta a eficiência da execução do programa.
