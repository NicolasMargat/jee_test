package fr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbstractDao<T> {
	public AbstractDao() {
		
	}

	public abstract ResultSet get() throws SQLException;
	public abstract T get(int id) throws SQLException;
	public abstract T get(String val) throws SQLException;
	public abstract void create(T elem) throws SQLException;
	public abstract void update(T elem) throws SQLException;
}
