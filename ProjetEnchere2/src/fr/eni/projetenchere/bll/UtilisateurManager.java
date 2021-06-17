package fr.eni.projetenchere.bll;


import fr.eni.projetenchere.bo.Utilisateur;
import fr.eni.projetenchere.utile.BusinessExceptions;

public class UtilisateurManager {

    private Utilisateur utilisateurDAO;

    static {
        this.utilisateurDAO = DAOFactory.getUtilisateurDAO();

    }

    // on vérifie si le mail et le pseudo sont uniques

    public void ajouterUtilisateur(Utilisateur utilisateur)  {

        // si le mail ou le pseudo est déjà utilisé = erreur

        if (!utilisateurDAO.verificationDisponibilitePseudoEtMail(utilisateur.getPseudo(), utilisateur.getEmail())) {
            BusinessExceptions.ajoutErreur(CodesResultatBLL.ERREUR_PSEUDO_MAIL);
        }

        // si une exception est trouvée il n'y a pas de création de compte

        if (BusinessExceptions.erreur()) {
            throw BusinessExceptions;

        // si l'exception n'est pas relevée le compte utilisateur est créé

        } else {
            utilisateurDAO.ajouter(utilisateur);
        }

    }

    public void supprimerUtilisateur (Utilisateur utilisateur) {
        utilisateurDAO.supprimer(utilisateur);

    }

    public void modifierUtilisateur (Utilisateur utilisateur) {

        if (!utilisateurDAO.verificationDisponibilitePseudoEtMail(utilisateur.getPseudo(), utilisateur.getEmail())) {
            BusinessExceptions.addError(CodesResultatBLL.REGLE_PSEUDO_MAIL);
        }

        // si une exception est trouvée il n'y a pas de création de compte

        if (BusinessExceptions.hasErrors()) {
            throw BusinessExceptions;

        // si l'exception n'est pas relevée le compte utilisateur est créé

        } else {
            utilisateurDAO.insert(utilisateur);
        }

    }
}