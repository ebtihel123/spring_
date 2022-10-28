package com.ebtihel.Nourritures;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ebtihel.Nourritures.NourritureRepository;
import com.ebtihel.Nourritures.entities.Nourriture;

@SpringBootTest
class NourrituresApplicationTests {

	@Autowired
	private NourritureRepository nourritureRepository;
	@Test
	public void testCreateNourriture() {
	Nourriture prod = new Nourriture("PC lenevo",2200.500,new Date());
	nourritureRepository.save(prod);
	}
	
	@Test
	public void testFindNourriture()
	{
		Nourriture p = nourritureRepository.findById(1L).get();
		System.out.println(p);
	}
	
	@Test
	public void testUpdateNourriture()
	{
		Nourriture p = nourritureRepository.findById(1L).get();
	    p.setPrixNourriture(2000.0);
	    nourritureRepository.save(p);
	    
	    System.out.println(p);
	    
	}
	
	@Test
	public void testDeleteNourriture()
	{ 
		nourritureRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousNourritures()
	{
	List<Nourriture> prods = nourritureRepository.findAll();
	for (Nourriture p : prods)
	{
		System.out.println(p);
		
		
	}
	
	}
	
	
	

}
