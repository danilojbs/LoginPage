package com.register;

import com.entities.ListaUsuarios;
import com.entities.Usuario;

public class Register {

	private String msg = "Todos os campos devem ser preenchidos!";
	
	public Register() {
	}

	public Boolean registrar(String name, String pass1, String pass2) {
		if(isEmpty(name) || isEmpty(pass1) || isEmpty(pass2)) return false;
		
		if(!pass1.equals(pass2)) {
			setMsg("As senhas não coincidem!");
			return false;
		}
		
		Usuario usuario = new Usuario(name, pass1);
		ListaUsuarios lUsuarios = new ListaUsuarios();
		
		if(lUsuarios.checkUsername(usuario.getName())) {
			setMsg("Já existe um usuário com este nome!");
			return false;
		}
		
		if(lUsuarios.addUser(usuario)) {
			setMsg("Usuário registrado com sucesso");
			return true;
		}
		
		setMsg("Ocorreu um erro ao registrar o usuário");
		return false;
	}
	
	private boolean isEmpty(String str) {
		if(str.isEmpty()) return true;
		if(str.equals("")) return true;
		if(str.equals(null)) return true;
		return false;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}

