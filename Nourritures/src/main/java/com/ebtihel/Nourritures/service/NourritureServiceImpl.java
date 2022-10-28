package com.ebtihel.Nourritures.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ebtihel.Nourritures.NourritureRepository;
import com.ebtihel.Nourritures.entities.Nourriture;


@Service
public class NourritureServiceImpl implements NourritureService {

	@Autowired 
	NourritureRepository nourritureRepository;
	
	
	@Override
	public Nourriture saveNourriture(Nourriture p) {
		return nourritureRepository.save(p);
	}

	@Override
	public Nourriture updateNourriture(Nourriture p) {
		return nourritureRepository.save(p);
	}

	@Override
	public void deleteNourriture(Nourriture p) {
		nourritureRepository.delete(p);
	}

	@Override
	public void deleteNourritureById(Long id) {
		nourritureRepository.deleteById(id);
	}

	@Override
	public Nourriture getNourriture(Long id) {
		return nourritureRepository.findById(id).get();
	}

	@Override
	public List<Nourriture> getAllNourritures() {
		
		return nourritureRepository.findAll();
	}

}
