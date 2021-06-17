package fr.eni.projetenchere.bll;

import fr.eni.projetenchere.bo.Utilisateur;
import fr.eni.projetenchere.util.BusinessExceptions;

public class UtilisateurManager2 {

	
	
	private Utilisateur utilisateurDAO; 

	static {
		
		this.utilisateurDAO = DAOFactory.getUtilisateurDAO(); 
}

	public UtilisateurManager (Utilisateur utilisateur, BusinessExceptions businessException) throws BusinessExceptions {
	
		if (utilisateur.getPseudo().trim().equals("") || utilisateur.getNom().trim().equals("")
				|| utilisateur.getPrenom().trim().equals("") || utilisateur.getEmail().trim().equals("")
				|| utilisateur.getRue().trim().equals("") || utilisateur.getCodePostal().trim().equals("")
				|| utilisateur.getVille().trim().equals("") || utilisateur.getPassword().trim().equals("")) {

			BusinessException.ajouterErreur(CodesResultatBLL.RESULTAT_ERREUR_AJOUT_UTILISATEUR);
			else if {
				utilisateurDAO.ajouter(utilisateur); 
				
			}
			
			public void modifierUtilisateur (Utilisateur utilisateur, BusinessExceptions businessException ) throws BusinessExceptions {
				
				
				if ( utilisateur.getNom().trim().equals("")
						|| utilisateur.getPrenom().trim().equals("") || utilisateur.getEmail().trim().equals("")
						|| utilisateur.getRue().trim().equals("") || utilisateur.getCodePostal().trim().equals("")
						|| utilisateur.getVille().trim().equals("") || utilisateur.getPassword().trim().equals("")) {
					
					businessException.ajouterErreur(CodesResultatBLL.REGLE_UTILISATEURS_COORDONNEES_ERREUR);
				}
				
				
				if (!businessException.hasErrors()) {
					
					//si aucune exception n'est levée, je peux modifier l'adresse de mon retrait 
				utilisateurDAO.modifier(utilisateur); 
			}
			
				
				public static Utilisateur selectUserById(int id) throws BusinessException {
					return utilisateurDAO.getById(id);

				}

				public static List<Utilisateur> selectAllUsers() throws BusinessException {
					return utilisateurDAO.getAll();
				}

				public static Utilisateur selectUserByPseudo(String pseudo) throws BusinessException{
					return utilisateurDAO.getByPseudo(pseudo);
				}
				
				public static List<ArticleVendu> selectArticlesVendus ()throws BusinessException{
					return utilisateurDAO.getAllArticlesVendus(utilisateur);
				}
				
				public static List<String> selectAllPseudos() throws BusinessException{
					return utilisateurDAO.getAllPseudos();
				}
				
				public static void supprimerUtilisateur(int id) throws BusinessException{
					utilisateurDAO.delete(id);
				}
			
			
			
}
	
	
	
	
