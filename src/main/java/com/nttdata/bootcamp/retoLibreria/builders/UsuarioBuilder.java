package com.nttdata.bootcamp.retoLibreria.builders;

import com.nttdata.bootcamp.retoLibreria.repository.Usuario;

public class UsuarioBuilder {

	public Usuario build(String nombre, String email, String telefono, String direccion) {
		Usuario usuario = new Usuario();
		if(nombre==null) {
			usuario.setNombre("Antonio");
		}else {
			usuario.setNombre(nombre);
		
		}
		if(email==null) {
			usuario.setEmail("anonio@antonnio.com");
		}else {
			usuario.setEmail(email);
		}
		if(telefono==null) {
			usuario.setTelefono("55555545");
		}else {
			usuario.setTelefono(telefono);
		}
		
		if(direccion==null) {
			usuario.setDireccion("calle alameda");
		}else {
			usuario.setDireccion(direccion);
		}
		return usuario;
		
	}
	public Usuario build2(String nombre, String email, String telefono, String direccion) {
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setEmail(email);
		usuario.setTelefono(telefono);
		usuario.setDireccion(direccion);
		return usuario;
	}/*
	public Usuario build3(String nombre, String email, String direccion) {
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setEmail(email);
		usuario.setTelefono("half-open");
		usuario.setDireccion(direccion);
		return usuario;
	}
	public Usuario build4() {
		Usuario usuario = new Usuario();
		usuario.setNombre("disabled");
		usuario.setEmail("disabled");
		usuario.setTelefono("disabled");
		usuario.setDireccion("disabled");
		return usuario;
	}
	public Usuario build5() {
		Usuario usuario = new Usuario();
		usuario.setNombre("forzada");
		usuario.setEmail("forzada");
		usuario.setTelefono("forzada");
		usuario.setDireccion("forzada");
		return usuario;
	}*/

}
