package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescrisao() {
		return getDescricao();
	}

	public void setDescrisao(String descrisao) {
		this.setDescricao(descrisao);
	}

	public abstract double calcularXp();

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
