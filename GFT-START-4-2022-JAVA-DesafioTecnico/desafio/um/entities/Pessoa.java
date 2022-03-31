package desafio.um.entities;

import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataDeNascimento;
	private Double altura;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, Date dataDeNascimento, Double altura) {
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	
	@Override
	public String toString() {
		return String.format("Nome: %s%n", nome)
				+ String.format("Altura: %.2f%n", altura);
	}
	
	

}
