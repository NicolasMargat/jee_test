package fr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

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
	public StringBuilder get() throws SQLException {
		PreparedStatement request = null;
		ResultSet resultat = null;
		StringBuilder messages = new StringBuilder();
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("SELECT * FROM messenger INNER JOIN user ON messenger.user_id = user.id ORDER BY messenger.id asc;");
		resultat = request.executeQuery();

		messages.append("{\"messages\": [");
		
		while(resultat.next()) {
			messages.append("{");
			messages.append("\"message\": \"" + resultat.getString("message") + "\",");
			messages.append("\"login\": \"" + resultat.getString("login") + "\"");
			messages.append("\"date_mess\": \"" + resultat.getDate("date_envoi") + "\"");
			
			if(resultat.isLast()) {
				messages.append("}");
			} else {
				messages.append("},");
			}
		}

		messages.append("]}");
		
		this.adb.close();

		
		return messages;
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
		Date today = new Date();
		
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("INSERT INTO messenger (message, date_envoi, user_id) VALUES (?, ?, ?);");
		request.setString(1, mess);
		//request.setDate(2, "2016-11-07 16:54:00");
		request.setInt(3, id);
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
