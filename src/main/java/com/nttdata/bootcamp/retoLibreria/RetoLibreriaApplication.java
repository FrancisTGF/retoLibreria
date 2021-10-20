package com.nttdata.bootcamp.retoLibreria;

import com.nttdata.bootcamp.retoLibreria.builders.UsuarioBuilder;
import com.nttdata.bootcamp.retoLibreria.repository.Usuario;

public class RetoLibreriaApplication {

	public static void main(String[] args) {
		Usuario usuario = new Usuario();

		usuario = new UsuarioBuilder().build(null, null, null, null);
		
		System.out.println(usuario);
		
	}

}
