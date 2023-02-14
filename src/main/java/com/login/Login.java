package com.login;

import com.entities.Usuario;
import com.entities.ListaUsuarios;

public class Login {
	
	private String msg = "Todos os campos devem ser preenchidos!";
	private Usuario usuario;
	
	public Login(Usuario usuario) {
		this.setUsuario(usuario);
	}

	public Boolean connect() {
		if(isEmpty(usuario.getName()) || isEmpty(usuario.getPassword())) return false;
		
		ListaUsuarios lUsuarios = new ListaUsuarios();
		
		if(lUsuarios.checkUsernamePassword(usuario)) {
			setMsg("Logado com sucesso!");
			return true;
		}
		setMsg("Usuário não encontrado");
		return false;
	}
	
	private boolean isEmpty(String str) {
		if(str.isEmpty()) return true;
		if(str.equals("")) return true;
		if(str.equals(null)) return true;
		return false;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
