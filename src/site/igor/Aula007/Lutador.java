package Aula007.model;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String cat;
	private int win;
	private int lose;
	private int emp;

	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int win, int lose, int emp) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.win = win;
		this.lose = lose;
		this.emp = emp;
	}

	public void apresentar() {
		System.out.println("Lutador: " + getNome() + "\nOrigem: " + getNacionalidade() + "\n" + "Idade: " + getIdade()
				+ "\nAltura: " + getAltura() + "\nPesando: " + getPeso() + " kg" + "\nGanhou: " + getWin()
				+ "\nDerrotas: " + getLose() + "\nEmpates: " + getEmp());
	}

	public void status() {
		System.out.println("Lutador: " + this.nome + " é um peso " + this.getCat() + "\nVitórias: " + this.win
				+ "\nDerrotas: " + this.lose + "\nEmpates: " + this.emp);
	}

	public void ganharLuta() {
		this.setWin(this.getWin() + 1);
	}

	public void perderLuta() {
		this.setLose(this.getLose() + 1);
	}

	public void empatarLuta() {
		this.setEmp(this.emp + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCat();
	}

	public String getCat() {
		return cat;
	}

	public void setCat() {
		if (getPeso() < 52.2) {
			this.cat = "Inválido para Luta";
		} else if (getPeso() <= 70.3) {
			this.cat = "Categoria Leve";
		} else if (getPeso() < -83.9) {
			this.cat = "Categoria Médio";
		} else if (getPeso() <= 120.2) {
			this.cat = "Categoria Pesada";
		} else {
			this.cat = "Inválido Para a Luta";
		}

	}

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int getLose() {
		return lose;
	}

	public void setLose(int lose) {
		this.lose = lose;
	}

	public int getEmp() {
		return emp;
	}

	public void setEmp(int emp) {
		this.emp = emp;
	}

}
