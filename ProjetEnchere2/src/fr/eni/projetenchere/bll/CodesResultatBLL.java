package fr.eni.projetenchere.bll;

public class CodesResultatBLL {

	
	/**LES CODES D'ERREUR DE LA BLL SONT DISPONIBLES ENTRE 10000 ET 19999
	 * 
	 * Echec quand le libellé de la catégorie est vide 
	 */
	public static final int REGLE_LIBELLE_VIDE=10000;
	/**
	 * Echec lorsque la saisie de la rue est vide 
	 */
	public static final int REGLE_SAISIE_RUE =10001;
	
	/**
	 * Echec lorsque la saisie du code postal est vide 
	 */
	public static final int REGLE_SAISIE_CODE_POSTAL =10002;
	
	
	/**
	 * Echec lorsque la saisie de la ville est vide 
	 */
	public static final int REGLE_SAISIE_VILLE =10003;

}
