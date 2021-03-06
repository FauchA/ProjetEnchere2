package fr.eni.projetenchere.bo;

import java.io.Serializable;
import java.util.List;

public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;
	private int noUtilisateur;
	private String pseudo;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse; 
	private int credit;
    private boolean administrateur;
   /* private List<ArticleVendu> articlesVendus;
    private List<ArticleVendu> articlesAchetes;
    private List<Enchere> encheres;*/
        
    // Constructeur 
    public Utilisateur() {
		
	}
    
    public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue,
		String codePostal, String ville, String password) {
    	this(pseudo, nom,prenom,email,telephone,rue, codePostal,ville,password, 0, false);
}

	public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super();
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}

	public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone,
    		String rue, String codePostal, String ville,
    		String motDePasse, int credit, boolean administrateur,
    		List<ArticleVendu> articlesVendus,
    		List<ArticleVendu> articlesAchetes,
    		List<Enchere> encheres ) {
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
		/*this.articlesVendus = articlesVendus;
		this.articlesAchetes = articlesAchetes;
		this.encheres = encheres;*/
	}

    
	/*public Utilisateur(int id, String pseudo, String nom, String prenom, String email, String telephone,
						String rue, String codePostal, String ville,
						String password, int credit, boolean administrateur,
						List<ArticleVendu> articlesVendus,
						List<ArticleVendu> articlesAchetes,
						List<Enchere> encheres) {
		this(pseudo, nom, prenom, email, telephone, rue, codePostal, ville, password, credit, administrateur, articlesVendus, articlesAchetes, encheres );
		this.id = id;
		
	}*/
	

	

	public Utilisateur(int noUtilisateur, String pseudo, String nom, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, boolean administrateur) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = administrateur;
	}


	

	//public Retrait getLieuRetraitParDefaut()
	{
		//return new Retrait(this.rue, this.codePostal, this.ville);
	}
	
	// Getters & Setters
	public int getNoUtilisateur() {
		return noUtilisateur;
	}
	
	public void setId(int noUtilisateur) {
		this.noUtilisateur = noUtilisateur;
	}
	
	public String getPseudo() {
		return pseudo;
	}
	
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}
	
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String getMotDePasse() {
		return motDePasse;
	}
	
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public int getCredit() {
		return credit;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public boolean isAdministrateur() {
		return administrateur;
	}
	
	public void setAdministrateur(boolean administrateur) {
		this.administrateur = administrateur;
	}
    
	
    /*public List<ArticleVendu> getArticlesVendus() {
		return articlesVendus;
	}
	public void setArticlesVendus(List<ArticleVendu> articlesVendus) {
		this.articlesVendus = articlesVendus;
	}
	public List<ArticleVendu> getArticlesAchetes() {
		return articlesAchetes;
	}
	public void setArticlesAchetes(List<ArticleVendu> articlesAchetes) {
		this.articlesAchetes = articlesAchetes;
	}
	public List<Enchere> getEncheres() {
		return encheres;
	}
	public void setEncheres(List<Enchere> encheres) {
		this.encheres = encheres;
	}*/

	/**
	 * M??thode ToString 
	 */
	@Override
	public String toString() {
		return "Utilisateur [noUtilisateur=" + noUtilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom=" + prenom + ", email="
				+ email + ", telephone=" + telephone + ", rue=" + rue + ", codePostal=" + codePostal + ", ville="
				+ ville + ", motDePasse=" + motDePasse + ", credit=" + credit + ", administrateur=" + administrateur;
	}

	
}
