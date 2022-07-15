package entidades;

public class Aluno {
	
	private String nome;
	private double nota1_semestre_1;
	private double nota2_semestre_1;
	private double nota1_semestre_2;
	private double nota2_semestre_2;
	
	
	public Aluno() {
	}
	
	public Aluno(String nome, double nota1_semestre_1, double nota2_semestre_1, double nota1_semestre_2, double nota2_semestre_2) {
		this.nome = nome;
		this.nota1_semestre_1 = nota1_semestre_1;
		this.nota2_semestre_1 = nota2_semestre_1;
		this.nota1_semestre_2 = nota1_semestre_2;
		this.nota2_semestre_2 = nota2_semestre_2;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1_semestre_1() {
		return nota1_semestre_1;
	}

	public void setNota1_semestre_1(double nota1_semestre_1) {
		this.nota1_semestre_1 = nota1_semestre_1;
	}

	public double getNota2_semestre_1() {
		return nota2_semestre_1;
	}

	public void setNota2_semestre_1(double nota2_semestre_1) {
		this.nota2_semestre_1 = nota2_semestre_1;
	}

	public double getNota1_semestre_2() {
		return nota1_semestre_2;
	}

	public void setNota1_semestre_2(double nota1_semestre_2) {
		this.nota1_semestre_2 = nota1_semestre_2;
	}

	public double getNota2_semestre_2() {
		return nota2_semestre_2;
	}

	public void setNota2_semestre_2(double nota2_semestre_2) {
		this.nota2_semestre_2 = nota2_semestre_2;
	}
	
	public double mediaSemestre1() {
		return (nota1_semestre_1 + nota2_semestre_1) / 2;
	}
	
	public double mediaSemestre2() {
		return (nota1_semestre_2  + nota2_semestre_2) / 2;
	}
	
	public double mediaFinal() {
		return (mediaSemestre1() + mediaSemestre2()) / 2;
	}

}
