package com.msUsuario.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msUsuario.dto.UsuarioDto;

@RestController
@RequestMapping("api/usuarios")
public class UsuariosController {

	@PostMapping("/autenticar")
	public ResponseEntity<?> autenticarUsuario(@RequestBody UsuarioDto usuario){
		Map<String, Object> response= new HashMap<>();
		if(usuario.getUserName().equals("ADMON") && usuario.getPassword().equals("ADMON")) {
			response.put("resultado", "Autenticación exitosa");			
			return ResponseEntity.status(HttpStatus.OK).body(response);
		}else {
			response.put("resultado", "Autenticación FALLIDA");			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
		}
	}
}
