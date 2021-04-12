package br.com.fiap.bean;

import javax.faces.bean.ManagedBean;

import br.com.fiap.dao.UserDAO;
import br.com.fiap.model.User;

@ManagedBean
public class UserBean {
	private User user = new User();
	
	public void save() {
		new UserDAO().save(this.user);
		System.out.println(this.user);
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
