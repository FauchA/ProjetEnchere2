package fr.eni.projetenchere.bll;

import fr.eni.javaee.module4.BusinessException;
import fr.eni.javaee.module4.bo.Avis;
import fr.eni.javaee.module4.dal.DAOFactory;

public class EnchereManager {
//CRUD 

	

    private EnchereDAO enchereDAO;
    
    
	public EnchereManager() {
		this.enchereDAO=DAOFactory.getEnchereDAO();
	}
   
    
	//créer une nouvelle enchère 
	
    	public Enchere ajouterEnchere (ArticleVendu articleVendu, Retrait retrait, Categorie categorie) throws BusinessExceptions
    	{
    		
    		
    		
    		BusinessExceptions exception = new BusinessExceptions();
    		
    		Enchere enchere = new Enchere(description, note);
    		
    		this.validerNote(avis,exception);
    		this.validerDescription(avis,exception);

    		if(!exception.hasErreurs())
    		{
    			this.avisDAO.insert(avis);
    		}
    		
    		if(exception.hasErreurs())
    		{
    			throw exception;
    		}
    		return avis;
    	}
    	
    	
    	
	//modifier une enchère avant qu'elle ne soit mise à la vente 
	
	//supprimer une enchère s'il est n'est pas encore en cours 
	
	//vendre un article 
	
	//lister les enchères en mode déconnecté 
	
	//lister les enchères en mode connecté 
	
	//faire une enchère 
	
	//remporter une vente 
	
	//afficher le détail d'une enchère 
	
	

	
	
	
	
	
	
	
	
}
