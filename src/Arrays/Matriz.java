package Arrays;

import java.util.Scanner;

public class Matriz {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);

	System.out.println("Quantos alunos?");
	int quantidadeA = ler.nextInt();
	
	System.out.println("Quantas notas por aluno?");
	int quantidadeN = ler.nextInt();
	
	double [] [] notasTurma = new double [quantidadeA] [quantidadeN];
	
	double total = 0;
	for (int a = 0; a < notasTurma.length; a++) {
		for (int n = 0; n <notasTurma.length; n++) {
			System.out.printf("Informe a nota %d do aluno %d: ", n + 1,a + 1);
			notasTurma [a] [n] = ler.nextDouble();
			total += notasTurma [a] [n];	
		}
		double media = total / (quantidadeA * quantidadeN);
		System.out.println("A média da turma é " + media);
		ler.close();
		}
	}
}
