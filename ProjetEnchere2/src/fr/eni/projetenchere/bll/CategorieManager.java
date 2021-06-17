package fr.eni.projetenchere.bll;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import fr.eni.javaee.module4.BusinessException;
import fr.eni.javaee.module4.bll.CodesResultatBLL;
import fr.eni.projetenchere.bo.Categorie;

public class CategorieManager {

	//classe concernant la gestion des catégories 
	
	private Categorie categorieDAO; 

	static {
		
		categorieDAO = DAOFactory.getCategorieDAO(); 
}

	public CategorieManager () {
	
}
	
	//j'ajoute une catégorie si aucune exception n'est levée 
	public Categorie categorieACreer (Categorie categorie) throws BusinessException {
		
	BusinessException exception = new BusinessException();
		
		Categorie categorie = new Categorie (noCategorie, libelle);
		
		this.validerCategorie(categorie,exception);
		

		if(!exception.hasErreurs())
		{
			this.categorieDAO.insert(categorie);
		}
		
		if(exception.hasErreurs())
		{
			throw exception;
		}
		return categorie;
	}
	
	
		
	//je valide la catégorie si le libelle de la categorie n'est pas vide
	//si le libellé est vide, je relève une erreur 
	private static void validerCategorie(Categorie categorie, BusinessException businessException)
	{
		if(categorie.getLibelle().isEmpty()) 
		{
			businessException.ajouterErreur(CodesResultatBLL.REGLE_LIBELLE_VIDE);
		}
	}
	
	

	public static Categorie selectionnerCategorieAvecId(int noCategorie) throws BusinessException
	{
		return categorieDAO.getByNoCategorie(noCategorie);
	}

	public static List<Categorie> selectionnerToutesCategories() throws BusinessException
	{
		return categorieDAO.getAll();
	
	
	
	//je modifie une catégorie
	private void modifierCategorie (Categorie categorie) throws BusinessException {
		this.validerCategorie(categorie.getLibelle(), businessException);
		//si aucune exception n'est relevée, je modifie tel numéro de catégorie
		if (!businessException.hasErreurs)
			categorieDAO.update(categorie.getNoCategorie()); 
		
	}
	
	
	//suppression d'une des catégories 
	
	private void supprimerCategorie (Categorie categorie) throws BusinessException {
		this.validerCategorie(categorie.getLibelle(), businessException);
		//si aucune exception n'est relevée, je supprime tel numéro de catégorie
		if (!businessException.hasErreurs)
			categorieDAO.delete(categorie.getNoCategorie()); 
		
	}
	
	
	
	
	
	}
	
	
	
