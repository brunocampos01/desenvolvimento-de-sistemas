package view;

import java.io.Serializable;

public class Funcionario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -676692929639802539L;
	private String login;
	private String senha;
	

	public Funcionario(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}
}