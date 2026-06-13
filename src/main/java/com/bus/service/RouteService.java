package com.bus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bus.exception.ResourceNotFoundException;
import com.bus.model.Route;
import com.bus.repository.RouteRepository;

@Service
public class RouteService {
	private final RouteRepository repo;

	public RouteService(RouteRepository repo) {
		this.repo = repo;
	}

	public List<Route> listAll() {
		return repo.findAll();
	}

	
	public  void save(Route route) {
		 repo.save(route);
	}
	public Route get(Long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Route not found"));
	}


	public void delete(Long id) {
		repo.deleteById(id);
	}
}