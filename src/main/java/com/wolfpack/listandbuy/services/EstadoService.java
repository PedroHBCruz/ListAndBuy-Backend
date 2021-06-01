package com.wolfpack.listandbuy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolfpack.listandbuy.domain.Estado;
import com.wolfpack.listandbuy.repositories.EstadoRepository;

@Service
public class EstadoService {

	@Autowired
	private EstadoRepository repo;	
	
	public List<Estado> findAll() {
		return repo.findAllByOrderByNome();
		
		
	}

}
