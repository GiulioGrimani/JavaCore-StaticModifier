package com.ntt.staticexample;

public class Persona {

	private String nome;
	private String cognome;
	private Integer id;
	private static Integer staticId = 0;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		// assegna all'id della Persona un valore autogenerato e incrementale
		this.id = ++staticId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public static Integer getStaticId() {
		return staticId;
	}

	public static void setStaticId(Integer n) {
		staticId = n;
	}

	public Integer getId() {
		return id;
	}

	// Metodo static in quanto ha a che fare con variabili
	// di tipo static
	public static void tellMeCurrentClassId() {
		System.out.println("Siamo arrivati all'id " + staticId);
	}

}
