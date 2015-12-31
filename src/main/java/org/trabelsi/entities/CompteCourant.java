package org.trabelsi.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {

		private double decouvet;

		public double getDecouvet() {
			return decouvet;
		}

		public void setDecouvet(double decouvet) {
			this.decouvet = decouvet;
		}

		private CompteCourant() {
			super();
			// TODO Auto-generated constructor stub
		}

		private CompteCourant(double decouvet) {
			super();
			this.decouvet = decouvet;
		}
		
		 
	
}
