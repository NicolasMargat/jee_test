package fr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.bd.AccessDB;
import fr.entities.User;

public class UserDAO extends AbstractDao<User>{
	//Attribut
	AccessDB adb = null;
	Connection cnx = null;
	
	//Constructeur
	public UserDAO() {
		try {
			this.adb = new AccessDB();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public UserDAO(AccessDB db) {
		this.adb = db;
	}

	@Override
	public StringBuilder get() throws SQLException {
		return null;
	}

	@Override
	public User get(int id) throws SQLException {
		return null;
	}

	@Override
	public User get(String val) throws SQLException {
		return null;
	}
	
	public User get(String login, String pwd) throws SQLException {
		PreparedStatement request = null;
		ResultSet resultat = null;
		User user = null;
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("SELECT * FROM user WHERE login=? AND pwd=?");
		request.setString(1, login);
		request.setString(2, pwd);
		resultat = request.executeQuery();
		
		if(resultat.first()) {
			user = new User();
			user.setId(resultat.getInt("id"));
			user.setLogin(resultat.getString("login"));
			user.setPwd(resultat.getString("pwd"));
		}
		
		this.adb.close();
		
		return user;
	}
	
	public int create(String login, String pwd) throws SQLException {
		PreparedStatement request = null;
		int success;
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("INSERT INTO user (login, pwd) VALUES (?, ?);");
		request.setString(1, login);
		request.setString(2, pwd);
		success=request.executeUpdate();
		
		this.adb.close();
		
		return success;
	}

	@Override
	public void create(User elem) throws SQLException {
		
	}

	@Override
	public void update(User elem) throws SQLException {
		
	}
}
