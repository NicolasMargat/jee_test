package fr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fr.bd.AccessDB;
import fr.entities.Conversations;

public class MessDAO extends AbstractDao<Conversations> {
	//Attribut
	AccessDB adb = null;
	Connection cnx = null;
	
	//Constructeur
	public MessDAO() {
		try {
			this.adb = new AccessDB();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public MessDAO(AccessDB db) {
		this.adb = db;
	}

	@Override
	public ResultSet get() throws SQLException {
		PreparedStatement request = null;
		ResultSet resultat = null;
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("SELECT * FROM messenger");
		resultat = request.executeQuery();
		
		this.adb.close();
		
		return resultat;
	}

	@Override
	public Conversations get(int id) throws SQLException {
		PreparedStatement request = null;
		ResultSet resultat = null;
		Conversations message = null;
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("SELECT * FROM messenger WHERE id=?");
		request.setInt(1, id);
		resultat = request.executeQuery();
		
		if(resultat.first()) {
			message = new Conversations();
			message.setMessage(resultat.getString("message"));
			message.setIdUser(resultat.getInt("user_id"));
		}
		
		this.adb.close();
		
		return message;
	}

	@Override
	public Conversations get(String val) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(String mess, int id) throws SQLException {
		PreparedStatement request = null;
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("INSERT INTO messenger (message, user_id) VALUES (?, ?);");
		request.setString(1, mess);
		request.setInt(2, id);
		request.executeUpdate();
		
		this.adb.close();
	}

	@Override
	public void create(Conversations elem) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Conversations elem) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
