package com.msPedidos.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msPedidos.DTO.PedidoDto;

@RestController
@RequestMapping("api/pedidos")
public class PedidosController {

	@GetMapping("listarPedidosUsiario/{idUsuario}")
	public ResponseEntity<?> listarPedidorUsuario(@PathVariable String idUsuario ){
		
		PedidoDto pedido= new PedidoDto(1L,"Jabones",2);
		List<PedidoDto>pedidos=new ArrayList<>();
		pedidos.add(pedido);
		pedido= new PedidoDto(2L,"Sillas",23);
		pedidos.add(pedido);
		pedido= new PedidoDto(3L,"Camas",32);
		pedidos.add(pedido);
		pedido= new PedidoDto(4L,"Colchón",2);
		pedidos.add(pedido);
		Map<String, Object> response= new HashMap<>();
		response.put("pedidos", pedidos);
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}
}
