package fr.entities;

import java.util.Date;

public class User {
	//Attributs
	private int id;
	private String login, pwd, token;
	private Date lastCnx;

	//Constructeurs
	public User() {
		this.login = "";
		this.pwd = "";
	}

	public User(int vId, String vLogin, String vPwd) {
		this.id = vId;
		this.login = vLogin;
		this.pwd = vPwd;
		this.token = "";
	}

	//Accesseurs
	public int getId() {
		return this.id;
	}

	public String getLogin() {
		return this.login;
	}

	public String getPwd() {
		return this.pwd;
	}

	public String getToken() {
		return this.token;
	}

	public Date getLastCnx() {
		return this.lastCnx;
	}

	//Modificateurs
	public void setId(int vId) {
		this.id = vId;
	}
	
	public void setLogin(String vLogin) {
		this.login = vLogin;
	}

	public void setPwd(String vPwd) {
		this.pwd = vPwd;
	}

	public void setToken(String vToken) {
		this.token = vToken;
	}

	public void getLastCnx(Date vLastCnx) {
		this.lastCnx = vLastCnx;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("{");
		builder.append("Utilisateurs:{");
		builder.append("login=" + this.login + ",");
		builder.append("pwd=" + this.pwd + ",");
		builder.append("token=" + this.token + ",");
		builder.append("lastCnx=" + this.lastCnx);
		builder.append("}}");
		
		return builder.toString();
	}
}
