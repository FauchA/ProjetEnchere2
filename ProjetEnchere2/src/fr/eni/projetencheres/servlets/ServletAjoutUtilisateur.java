package fr.eni.projetencheres.servlets;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.projetencheres.BusinessException;
import fr.eni.projetencheres.bll.UtilisateurManager2;
import fr.eni.projetencheres.bo.Utilisateur;

/*import fr.eni.javaee.module4.BusinessException;
import fr.eni.javaee.module4.bll.AvisManager;
import fr.eni.javaee.module4.bo.Avis;*/

/**
 * Servlet implementation class ServletAjoutAvis
 */
@WebServlet("/ServletAjoutUtilisateur")
public class ServletAjoutUtilisateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */ //doGet, on appelle une page jsp (ici, ajoutAvis.jsp) qui va créer un formulaire 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//ci-dessous, on a fait un forward directement vers CreationDeCompte.jsp
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/creationCompte/CreationDeCompte.jsp");
		rd.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */ //doPost : l'objectif est de récupérer les paramètres envoyées dans le formulaire
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pseudo;
		String nom; 
		String prenom; 
		String email; 
		String telephone; 
		String rue;
		String codePostal;
		String ville;
		String motDePasse; 
		String confirmation; 
	
		try
		{
			pseudo = request.getParameter("pseudo");
			nom = request.getParameter("nom");
			prenom = request.getParameter("prenom");
			email = request.getParameter("email");
			telephone = request.getParameter("telephone");
			rue = request.getParameter("rue");
			codePostal = request.getParameter("codePostal");
			ville = request.getParameter("ville");
			motDePasse = request.getParameter("motDePasse");
			confirmation = request.getParameter("confirmation");

			UtilisateurManager2 utilisateurManager3 = new UtilisateurManager2();
			Utilisateur utilisateur = utilisateurManager3.ajouterUtilisateur(pseudo,nom, prenom, email, telephone, rue, codePostal, ville, motDePasse);
			request.setAttribute("utilisateur", utilisateur);
		}
		catch(NumberFormatException e)
		{
		List<Integer> listeCodesErreur=new ArrayList<>();
		listeCodesErreur.add(CodesResultatServlets.ERREUR_SAISIE_FORMULAIRE);
		request.setAttribute("listeCodesErreur",listeCodesErreur); 
		}catch (BusinessException e) {
		request.setAttribute("listeCodesErreur", e.getListeCodesErreur());
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/creationCompte/CreationDeCompte.jsp");
		rd.forward(request, response);
	}

}
}