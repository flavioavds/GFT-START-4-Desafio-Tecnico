package desafio.um.entities;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Pessoa {
	private String nome;
	private Date dataDeNascimento;
	private Double altura;
	private Date calcular;
	
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

	public Date getCalcular() {
		return calcular;
	}

	public void setCalcular(Date calcular) {
		this.calcular = calcular;
	}

	public static int calculoIdade(LocalDate dataDeNascimento) {
	    LocalDate dataAtual = LocalDate.now();
	    Period periodo = Period.between(dataDeNascimento, dataAtual);
	    return periodo.getYears();
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s%n", nome)
				+ String.format("Altura: %.2f%n", altura);
	}
	
	

}
