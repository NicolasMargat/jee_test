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
	public StringBuilder get() throws SQLException {
		PreparedStatement request = null;
		ResultSet resultat = null;
		StringBuilder messages = new StringBuilder();
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("SELECT * FROM message INNER JOIN user ON message.user_id = user.id ORDER BY message.date_envoi asc;");
		resultat = request.executeQuery();

		messages.append("{\"messages\": [");
		
		while(resultat.next()) {
			messages.append("{");
			messages.append("\"message\": \"" + resultat.getString("text") + "\",");
			messages.append("\"login\": \"" + resultat.getString("login") + "\",");
			messages.append("\"date_mess\": \"" + resultat.getDate("date_envoi") + "\",");
			messages.append("\"heure_mess\": \"" + resultat.getTime("date_envoi") + "\"");
			
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
		
		return null;
	}

	@Override
	public Conversations get(String val) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(String mess, int id) throws SQLException {
		PreparedStatement request = null;
		
		this.cnx = adb.open();
		
		request = this.cnx.prepareStatement("INSERT INTO message (text, date_envoi, user_id) VALUES (?, NOW(), ?);");
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
