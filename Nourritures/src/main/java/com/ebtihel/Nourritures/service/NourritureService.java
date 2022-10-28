package com.ebtihel.Nourritures.service;

import java.util.List;

import com.ebtihel.Nourritures.entities.Nourriture;

public interface NourritureService {
	
	Nourriture saveNourriture(Nourriture p);
	Nourriture updateNourriture(Nourriture p);
	void deleteNourriture(Nourriture p);
	void deleteNourritureById(Long id);
	Nourriture getNourriture(Long id);
	List<Nourriture> getAllNourritures();

}
