package model;

/**
 * Classe para armazenar os atributos e m�todos do objeto Editora
 *
 * @author Diego Almeida da Silva
 * @since 18 de fev. de 2021
 */
public class Editora {

	// M�todo construtor da classe
	public Editora() {
	}
	
	//declarando os atributos
	private int codigo;
	private String nome;
	private String pais;
	
	// M�todos getters e setters para acessar os atributos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
