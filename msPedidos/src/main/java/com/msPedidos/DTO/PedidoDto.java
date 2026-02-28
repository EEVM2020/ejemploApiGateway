package com.msPedidos.DTO;

public class PedidoDto {

	private Long id;
    private String nombreProducto;
    private int cantidadProductos;
    
	public PedidoDto(Long id, String nombreProducto, int cantidadProductos) {
		super();
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.cantidadProductos = cantidadProductos;
	}

	public Long getId() {
		return id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public int getCantidadProductos() {
		return cantidadProductos;
	}
 
  }
