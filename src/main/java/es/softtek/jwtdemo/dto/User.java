package es.softtek.jwtdemo.dto;

public class User {
private String user;
private String token;
private String pwd;



public User() {
	super();
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getToken() {
	return token;
}
public void setToken(String token) {
	this.token = token;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
