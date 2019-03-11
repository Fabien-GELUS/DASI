/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insalyon.b3246.dasi.vue;

import fr.insalyon.b3246.dasi.dao.JpaUtil;
import fr.insalyon.b3246.dasi.metier.modele.Client;
import fr.insalyon.b3246.dasi.metier.modele.Personne;
import fr.insalyon.b3246.dasi.metier.service.ClientService;
import fr.insalyon.b3246.dasi.metier.service.PersonneService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author bpauletto
 */
public class Main {
    
     public static void main(String[] args) {
        JpaUtil.init();
        
        Client client = new Client("Chungus Jr.","a@b.com","abc");
        
        ClientService.inscrireClient(client);

        Personne a = PersonneService.authentifier("a@b.com", "abc");
        
        System.out.println(a.getNom());
        
        JpaUtil.destroy();
     }
}
