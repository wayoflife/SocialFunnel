package com.socialfunnel.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.vaadin.data.Property.ReadOnlyException;
import com.vaadin.data.util.sqlcontainer.SQLContainer;
import com.vaadin.data.util.sqlcontainer.connection.JDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.connection.SimpleJDBCConnectionPool;
import com.vaadin.data.util.sqlcontainer.query.TableQuery;

public final class DBHelper{
	
	private static DBHelper db;
	
	public static DBHelper getInstance(){
		if(db == null) db = new DBHelper();
		return db;
	}
	
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/socialfunnel";
	private String name = "ladasi";
	private String pw = "ladasi123";

	private JDBCConnectionPool pool;
	private Connection conn;
	private Statement st;
	private ResultSet res;
	
	public DBHelper() {
		try {
			pool = new SimpleJDBCConnectionPool(driver, url, name, pw);
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, name, pw);
			st = conn.createStatement(); // muss die connection geschlossen werden?
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addNewUser(String name, String password) throws ReadOnlyException, Exception{
		TableQuery tq = new TableQuery("user", pool);
		SQLContainer container = new SQLContainer(tq);
		Object id = container.addItem();
		container.getContainerProperty(id, "name").setValue(name);
		container.getContainerProperty(id, "password").setValue(PWCrypt.getInstance().encrypt(password));
//		container.getContainerProperty(id, "password").setValue(password);
		container.getContainerProperty(id, "enabled").setValue(true);
		container.getContainerProperty(id, "accountnonexpired").setValue(true);
		container.getContainerProperty(id, "credentialsnonexpired").setValue(false);
		container.getContainerProperty(id, "locked").setValue(false);
		container.commit();
	}
	
	public String[] getUserByName(String name) throws SQLException {
		res = st.executeQuery("SELECT * FROM user WHERE name = '" + name + "'");
		res.next();
		return new String[] {res.getString("name"), res.getString("password")};
	}
	
	public boolean isMailAvailable(String mail) throws SQLException {
		res = st.executeQuery("SELECT name FROM user");
		while(res.next()) if(res.getString("name").equals(mail)) return false;
		return true;
	}
	
	public void close(){
		try {
			conn.close();
			pool.destroy();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}