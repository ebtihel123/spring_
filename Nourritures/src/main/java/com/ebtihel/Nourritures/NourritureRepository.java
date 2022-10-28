package com.ebtihel.Nourritures;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebtihel.Nourritures.entities.Nourriture;

public interface NourritureRepository extends JpaRepository<Nourriture, Long> {

}
