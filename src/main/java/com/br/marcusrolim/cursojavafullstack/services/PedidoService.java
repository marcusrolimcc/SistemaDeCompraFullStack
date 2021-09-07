package com.br.marcusrolim.cursojavafullstack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.marcusrolim.cursojavafullstack.domain.Pedido;
import com.br.marcusrolim.cursojavafullstack.repositories.PedidoRepository;
import com.br.marcusrolim.cursojavafullstack.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id +  ", Tipo: " + Pedido.class.getName()));
		}
}
