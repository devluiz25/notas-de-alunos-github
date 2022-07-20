package principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal_Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Date d1 = new Date(System.currentTimeMillis());
		char resp;
		
		do {

			
			System.out.println("LIMOEIRO, " + sdf1.format(d1));
			System.out.println();
			System.out.print("DESEJA INSERIR OUTRO ALUNO COM NOTAS: ");
			resp = sc.next().charAt(0);

		} while (resp == 'S');

		sc.close();
		// SISTEMA DESENVOLVIDO POR LUIZ AUGUSTO DE ANDRADE SILVA!
	}

}
