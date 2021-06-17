package fr.eni.projetenchere.bll;

import fr.eni.projetenchere.bo.Retrait;

public class RetraitManager {

	
	//Classe concernant la gestion d'un retrait suite à une vente 
	
	private Retrait retraitDAO; 

		static {
			
			retraitDAO = DAOFactory.getRetraitDAO(); 
	}
	
	public RetraitManager () {
		
	}
	
	//MISE EN PLACE DU CRUD (CREATE READ UPDATE DELETE)
	//j'ajoute une adresse de retrait uniquement si les saisies concernant la rue, le code postal et la ville 
	//ne sont pas vides ou nulles
	
	public void ajouterAdresseRetrait (Retrait retrait, BusinessException businessException) throws BusinessException  {
		
		if(retrait.getRue() == null || retrait.getRue().trim().equals("")) {
			BusinessException.ajouterErreur(CodesResultatBLL.REGLE_SAISIE_RUE);
	} 
		else if (retrait.getCodePostal() == null || retrait.getCodePostal().trim().equals("")) {
			BusinessException.ajouterErreur(CodesResultatBLL.REGLE_SAISIE_CODE_POSTAL); 
		}
				
		else if (retrait.getVille() == null || retrait.getVille().trim().equals("")) {
			BusinessException.ajouterErreur(CodesResultatBLL.REGLE_SAISIE_VILLE);
		}
		else {
			retraitDAO.insert(retrait); 
		}
		
		
		
		//je sélectionne 
		public static Retrait selectionRetraitAvecId (int id) throws BusinessException {
			return retraitDAO.getById(id);
		}
		
				
		//si tous les champs sont complétés, nous pouvons insérer une nouvelle adresse
		
				 
		//pour modifier l'adresse 
		public void updateRetrait (Retrait retrait, BusinessException businessException) throw BusinessException {
			
			//TODO : commenter cette ligne 
			if (!businessException.hasErrors()) {
				
				//si aucune exception n'est levée, je peux modifier l'adresse de mon retrait 
			retraitDAO.update(retrait); 
		}
		
	

}
