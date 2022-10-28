package com.ebtihel.Nourritures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
	public class Nourriture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idNourriture;
	private String nomNourriture;
	private Double prixNourriture;
	private Date dateCreation;
	public Nourriture() {
	super();
	}
	public Nourriture(String nomNourriture, Double prixNourriture, Date dateCreation) {
	super();
	this.nomNourriture = nomNourriture;
	this.prixNourriture = prixNourriture;
	this.dateCreation = dateCreation;
	}
	public Long getIdNourriture() {
		return idNourriture;
		}
		public void setIdNourriture(Long idNourriture) {
		this.idNourriture = idNourriture;
		}
		public String getNomNourriture() {
		return nomNourriture;
		}
		public void setNomNourriture(String nomNourriture) {
		this.nomNourriture = nomNourriture;
		}
		public Double getPrixNourriture() {
		return prixNourriture;
		}
		public void setPrixNourriture(Double prixNourriture) {
		this.prixNourriture = prixNourriture;
		}
		public Date getDateCreation() {
		return dateCreation;
		}
		public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
		}
		@Override
		public String toString() {
		return "Nourriture [idNourriture=" + idNourriture + ", nomNourriture=" + nomNourriture + ", prixNourriture=" + prixNourriture
		+ ", dateCreation=" + dateCreation + "]";
		}
		}


