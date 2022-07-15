package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Principal_Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;

		System.out.print("QUANTOS ALUNOS E NOTAS VÃO SER REGISTRADOS: ");
		int num = sc.nextInt();

		Aluno[] vet = new Aluno[num];

		do {
			for (int i = 0; i < num; i++) {
				System.out.println();
				System.out.println("*** INFORMAÇÕES DOS ALUNOS ***");
				System.out.print("DIGITE O NOME DO ALUNO: ");
				sc.nextLine();
				String nome = sc.nextLine();
				
				System.out.println("----------------------------------------------");
				System.out.println("*** NOTAS DO SEMESTRE 1 ***");
				System.out.print("DIGITE A 1ª NOTA DO 1º SEMESTRE: ");
				double nota1_semestre_1 = sc.nextDouble();
				System.out.print("DIGITE A 2ª NOTA DO 1º SEMESTRE: ");
				double nota2_semestre_1 = sc.nextDouble();
				
				System.out.println("----------------------------------------------");
				System.out.println("*** NOTAS DO SEMESTRE 2 ***");
				System.out.print("DIGITE A 1ª NOTA DO 2º SEMESTRE: ");
				double nota1_semestre_2 = sc.nextDouble();
				System.out.print("DIGITE A 2ª NOTA DO 2º SEMESTRE: ");
				double nota2_semestre_2 = sc.nextDouble();

				vet[i] = new Aluno(nome, nota1_semestre_1, nota2_semestre_1, nota1_semestre_2, nota2_semestre_2);
			}
			
			System.out.println("--------------------------------------------------");
			System.out.println("*** MÉDIA DO 1º SEMESTRE ***");
			
			for(int i = 0; i < num; i++) {
				double mediaSemestre1 = (vet[i].getNota1_semestre_1() + vet[i].getNota2_semestre_1()) / 2;
				
				if(mediaSemestre1 >= 7.0) {
					String nome = vet[i].getNome().toUpperCase();
					System.out.printf("%s, VOCÊ ESTÁ APROVADO COM MÉDIA: %.1f%n", nome, mediaSemestre1);
				}
			}

			System.out.print("DESEJA REINICIAR O SISTEMA: ");
			resp = sc.next().charAt(0);
		} while (resp == 'S');

		sc.close();
		// SISTEMA DESENVOLVIDO POR LUIZ AUGUSTO DE ANDRADE SILVA!
	}

}
