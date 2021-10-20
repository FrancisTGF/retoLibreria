package com.nttdata.bootcamp.retoLibreria.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nttdata.bootcamp.retoLibreria.builders.UsuarioBuilder;
import com.nttdata.bootcamp.retoLibreria.repository.Usuario;

@Configuration
@ConditionalOnClass(Usuario.class)
@EnableConfigurationProperties(UsuarioProperties.class)
public class UsuarioAutoConfigure {

	private final UsuarioProperties properties;

	public UsuarioAutoConfigure(UsuarioProperties properties) {
		this.properties = properties;

	}

	@Bean
	public Usuario addUsuario() {
		Usuario usuario = new Usuario();

		usuario = new UsuarioBuilder().build(properties.getNombre(), properties.getEmail(), properties.getTelefono(),
				properties.getDireccion());

		System.out.println(usuario.toString());
		return usuario;

	}
}
