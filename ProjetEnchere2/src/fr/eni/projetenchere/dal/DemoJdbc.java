package fr.eni.projetenchere.dal;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class DemoJdbc {

			//DEMO COMMENT EXECUTER UNE REQUETE SQL DEPUIS JAVA
			public static void main(String[] args) {

				//je déclare ma connexion en haut de la classe Main
				Connection con=null; 
				Statement stmt = null; 
				
					
				//charger le driver jdbc en mémoire 
				 //méthode recommandée par oracle 
				try {
					DriverManager.registerDriver(new SQLServerDriver());
					String url= "jdbc:sqlserver://localhost:1433;databaseName=EVAL_DB1"; 
					//String url = Settings.getProperty("url");
					
					//obtenir une connexion
					con = DriverManager.getConnection(url, "sa", "Pa$$w0rd"); 
					//con = DriverManager.getConnection(url, Settings.getProperty("user"), Settings.getProperty("password")); 
					
					
					//Créer un Statement (type, mode)
					//types de déplacement 
					//ResultSet.TYPE_FORWARD_ONLY 
					//ResultSet.TYPE_SCROLL_INSENSITIVE 
					//ResultSet.TYPE_SCROLL_SENSITIVE
					
					//Mode d'ouverture 
					//ResultSet.CONCUR_READ_ONLY (par défaut) 
					//ResultSet.CONCUR_UPDATEABLE

					
					stmt = con.createStatement(); 
					
					ResultSet rs = stmt.executeQuery("select noStagiaire, nom, prenom, email from stagiaires");
					while(rs.next()) { //retourne faux s'il n'y a pas de ligne suivante et vrai s'il y en a 
					System.out.println(rs.getString("nom") + " " + rs.getString("prenom") + " " + rs.getString ("email"));
						
					
					
					}
					
				
					
				} catch (SQLException e) {
					e.printStackTrace();
					
				}finally {
					if (stmt!=null) {
						try {
							stmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if (con!=null) {
						
						try {
							
							con.close();
						}catch (SQLException e) {
							e.printStackTrace();
							
						}
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					//} catch (SQLException e) {
					//	e.printStackTrace();
					//ci-dessous l'autre manière de charger le driver jdbc en mémoire 
					/*try {
						Class.forName(Settings.getProperty("driverjdbc"));
					} catch (ClassNotFoundException e) {
						// TODO Austo-generated catch block
						e.printStackTrace();
					}
					
					//chaine de connexion pour accéder à la base de données EVAL_DBO 
					//String url = "jdbc:sqlserver://localhost:1433;databaseName=EVAL_DBO";
					//nouvelle chaine de connexion (viable et efficace) pour accéder à la base de données EVAL_DBO
					String url = Settings.getProperty("url"); 
							
					
					//obtenir une connexion à la base de données SQLServer
					con = DriverManager.getConnection(url, Settings.getProperty("user"), Settings.getProperty("password")); 
					
					//créer un statement
					stmt = con.createStatement(); 
					
					//puis exécution d'une requête 
					ResultSet rs = stmt.executeQuery("select noStagiaire, nom, prenom, email from stagiaires");
					//pour vérifier que le ResultSet contient bien le résultat de la requête, nous faisons une boucle sur le ResultSet
					while (rs.next()) { //par defaut, le rs.next() va placer le curseur sur la premiere ligne de résultat (cest un boolean)
						//s'il n'y a pas de ligne suivante, le rs.next() retourne faux
						//s'il y a bien une ligne suivante, le rs.next() retourne vrai
						
						//pour afficher les données de notre résultat, nous appellons les méthodes get et le type de la colonne 
						System.out.println(rs.getString("nom") + " " + rs.getString("prenom") + " " + rs.getString ("email"));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					if(stmt!=null) {
						try {
							stmt.close(); 
						}catch (SQLException e) {
						e.printStackTrace();	
							
						}
						
					}
					if (con!=null) {
						try {
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					
					
				}
				*/

				//DEMO APPELER UNE PROCEDURE STOCKEE 
				//1) créer un objet CallableStatement 
				
				/*String sql = "EXEC dbo.insertStagiaire @prenom =?, @nom =?, " + "@email =?, @noStagiaire=?"; 
				CallableStatement callStmt = connection.prepareCall (sql); 
				
				//2) renseigner les valeurs des paramètres in 
				callStmt.setString(1,  "Nordine");
				callStmt.setString(2,  "nateur");c
				//3) définir les paramètres out 
				callStmt.registerOutParameter(4,  java.sql.Types.INTEGER); //la methode registerOutParameter permet de réinitiliaser ces champs
				//4) Exécuter 
				callStmt.execute(); 
				//5) Récupération des valeurs de paramètres de sortie avec la méthode getInt()
				//ex : callStmt.getInt(4)*/
				
				
				
				
			
		}

		
		
		
		
		
		
		
	}

}
