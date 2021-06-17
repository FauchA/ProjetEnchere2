package fr.eni.projetenchere.bll;


import fr.eni.projetenchere.util.BusinessExceptions;
import fr.eni.projetenchere.bo.Utilisateur;
import fr.eni.projetenchere.bll.UtilisateurManager;;


public class TestBLL {

	public static void main(String[] args) throws BusinessExceptions {
		// TODO Auto-generated method stub

		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setPseudo("sassou");
		utilisateur.setNom("maerten");
		utilisateur.setPrenom("sarah");
		utilisateur.setEmail("maerten@outlook.com");
		utilisateur.setTelephone("0612591551");
		utilisateur.setRue("132 Rue de Lausanne");
		utilisateur.setCodePostal("76000");
		utilisateur.setVille("Rouen");
		utilisateur.setMotDePasse("sarah01");
		
	UtilisateurManager userManager = new UtilisateurManager();
	userManager.ajouterUtilisateur(utilisateur);
	//UtilisateurManager("", "", "jeanmi@youhou.fr","56 rue de la bule", "56789", "Bulville", "ugfufz");
	//UtilisateurManager.encheresUtilisateur(null);
	//UtilisateurManager.achatsUtilisateur(null);
	//UtilisateurManager.ventesUtilisateur(null);
	//UtilisateurManager.selectAllUsers();
	//UtilisateurManager.selectUserById(1);

	}
	
}
	
	
	