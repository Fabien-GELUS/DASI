/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.b3246.dasi.metier.modele;

import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author bpauletto
 */
@Entity
public class DemandeInterventionAnimal extends DemandeIntervention {
    private String animal;

    public DemandeInterventionAnimal(String animal, Date dateDeb, String descriptionClient) {
        super(dateDeb, descriptionClient);
        this.animal = animal;
    }

    public DemandeInterventionAnimal(String animal, String descriptionClient) {
        super(descriptionClient);
        this.animal = animal;
    }
    

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public DemandeInterventionAnimal() {
    }
    
}
