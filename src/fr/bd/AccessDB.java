package fr.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessDB {
	private Connection cnx;
	private String url, login, pwd;

	public AccessDB() throws SQLException{
		this.url = "jdbc:mysql://localhost/messenger_aston?autoReconnect=true&useSSL=false";
		this.login = "root";
		this.pwd = "root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Throwable cnf) {
			throw new SQLException("Impossible de charger le driver 'com.mysql.jdbc.Driver'");
		}
	}

	public AccessDB(String aUrl, String aLogin, String aPassword) throws SQLException{
		this.url = aUrl;
		this.login = aLogin;
		this.pwd = aPassword;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Throwable cnf) {
			throw new SQLException("Impossible de charger le driver 'com.mysql.jdbc.Driver'");
		}
	}

	public AccessDB(String aDriverName, String aUrl, String aLogin, String aPassword) throws SQLException{
		this.url = aUrl;
		this.login = aLogin;
		this.pwd = aPassword;
		
		try {
			Class.forName(aDriverName);
		} catch (Throwable cnf) {
			throw new SQLException("Impossible de charger le driver '" + aDriverName + "'");
		}
	}
	
	//Méthode d'ouverture de connexion
	public Connection open() throws SQLException {
		cnx = DriverManager.getConnection(url, login, pwd);
		System.out.println("Connecter");
		
		return cnx;
	}

	//Méthode de fermeture de connexion
	public void close() {
		try {
			cnx.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Déconnecter");
	}
}
