package fr.eni.projetenchere.bo;


import java.io.Serializable;

public class Categorie implements Serializable {

	private static final long serialVersionUID = 1L;

	private int noCategorie;
	private String libelle;

	// Constructor

	/**
	 * @param id
	 * @param libelle
	 */
	public Categorie(int noCategorie, String libelle) {
		this.noCategorie = noCategorie;
		this.libelle = libelle;
	}

	/**
	 * 
	 */
	public Categorie() {
	}

	/**
	 * @param libelle
	 */
	public Categorie(String libelle) {
		this.libelle = libelle;
	}

	// Getters And Setters
	/**
	 * @retourne le noCategorie
	 */
	public int getNoCategorie() {
		return noCategorie;
	}

	/**
	 * @param noCategorie the noCategorie to set
	 */
	public void setId(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	// toString

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}
}