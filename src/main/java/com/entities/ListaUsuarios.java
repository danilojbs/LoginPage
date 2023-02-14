package com.entities;

import java.util.ArrayList;

public class ListaUsuarios {

	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public boolean addUser(Usuario user) {
		return usuarios.add(user);
	}
	public boolean checkUsernamePassword(Usuario user) {
		for(Usuario u : usuarios) {
			if(u.getName().equalsIgnoreCase(user.getName())) {
				if(u.getPassword().equals(user.getPassword())) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean checkUsername(String username) {
		for(Usuario u : usuarios) {
			if(u.getName().equalsIgnoreCase(username)) {
					return true;
			}
		}
		return false;
	}
}
