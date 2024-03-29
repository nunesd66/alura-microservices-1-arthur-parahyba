package com.nunesd66.microservices.loja.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nunesd66.microservices.loja.client.FornecedorClient;
import com.nunesd66.microservices.loja.dto.CompraDTO;
import com.nunesd66.microservices.loja.dto.InfoFornecedorDTO;
import com.nunesd66.microservices.loja.dto.InfoPedidoDTO;
import com.nunesd66.microservices.loja.model.Compra;

@Service
public class CompraService {

	private static final Logger LOG = LoggerFactory.getLogger(CompraService.class);
	
	@Autowired
	private FornecedorClient fornecedorClient;
	
	public Compra realizaCompra(CompraDTO compra) {
		
		final String estado = compra.getEndereco().getEstado();
		
		LOG.info("buscando informações do fornecedor de {}", estado);
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
		
		LOG.info("realizando um pedido");		
		InfoPedidoDTO pedido = fornecedorClient.realizaPedido(compra.getItens());
		
		System.out.println(info.getEndereco());
		
		Compra compraSalva = new Compra();
		compraSalva.setPedidoId(pedido.getId());
		compraSalva.setTempoDePreparo(pedido.getTempoDePreparo());
		compraSalva.setEnderecoDestino(compra.getEndereco().toString());
		
		return compraSalva;
	}

}
