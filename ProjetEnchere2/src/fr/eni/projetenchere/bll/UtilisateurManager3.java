package fr.eni.projetenchere.bll;

import fr.eni.javaee.module4.bll.CodesResultatBLL;
import fr.eni.javaee.module4.bo.Avis;
import fr.eni.projetencheres.BusinessException;
import fr.eni.projetencheres.bo.Utilisateur;
import fr.eni.projetencheres.dal.DAOFactory;
import fr.eni.projetencheres.dal.UtilisateurDAO;

/**
 * Cette classe permet d'effectuer les traitements attendus sur la classe Utilisateur
 */
public class UtilisateurManager3 {
	
	private UtilisateurDAO utilisateurDAO;
	
	/**
	 * Le constructeur permet d'initialiser la variable membre avisDAO pour 
	 * permettre une communication avec la base de données. 
	 */
	public UtilisateurManager3() {
		this.utilisateurDAO=DAOFactory.getUtilisateurDAO();
	}
	/**
	 * @param description
	 * @param note
	 * @return un objet Avis en cas de succcès
	 * @throws BusinessException 
	 */
	public Utilisateur ajouterUtilisateur(String pseudo, String nom ,String prenom, String email, String telephone, String rue, String codePostal, String ville, String motDePasse) throws BusinessException
	{
		BusinessException exception = new BusinessException();
		
		Utilisateur utilisateur = new Utilisateur(pseudo, nom ,prenom, email, telephone, rue, codePostal, ville, motDePasse);
		
		this.validerPseudo(utilisateur ,exception);
		this.validerNom(utilisateur ,exception);
		this.validerPrenom(utilisateur ,exception);
		this.validerEmail(utilisateur ,exception);
		this.validerTelephone(utilisateur ,exception);
		this.validerRue(utilisateur ,exception);
		this.validerCodePostal(utilisateur ,exception);
		this.validerVille(utilisateur ,exception);
		this.validerMotDePasse(utilisateur ,exception);
		


		if(!exception.hasErreurs())
		{
			this.utilisateurDAO.inserer(utilisateur);
		}
		
		if(exception.hasErreurs())
		{
			throw exception;
		}
		return utilisateur;
		
		
		
		
		
	}
	private void validerMotDePasse(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerVille(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerCodePostal(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerRue(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerTelephone(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerEmail(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerPrenom(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerNom(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}
	private void validerPseudo(Utilisateur utilisateur, BusinessException exception) {
		// TODO Auto-generated method stub
		
	}

	
	private void validerNote(Avis avis, BusinessException businessException)
	{
		if(utilisateur.getPseudo()<1 || utilisateur.getPseudo()>5)
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_AVIS_NOTE_ERREUR);
		}
	}
}


	
	
