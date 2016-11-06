package fr.entities;

import java.util.Date;

public class Conversations {
	//Attributs
	private String message;
	private Date dateMessage;
	private int idUser;
	
	//Constructeurs
	public Conversations() {
		this.message = "";
		this.dateMessage = new Date();
		this.idUser = 0;
	}

	public Conversations(String message, Date dateMessage, int idUser) {
		this.message = message;
		this.dateMessage = dateMessage;
		this.idUser = idUser;
	}

	//Accesseurs
	public String getMessage() {
		return message;
	}

	public Date getDateMessage() {
		return dateMessage;
	}

	public int getIdUser() {
		return idUser;
	}

	//Modificateurs
	public void setMessage(String message) {
		this.message = message;
	}

	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
}
