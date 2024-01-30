package com.dsi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Lists note = new Lists();
        note.setUserName("Mirr");
        note.setListTitle("trial");
        note.setListDescription("something that will never happen!");
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        //manager.persist(note);
        List<Lists> notes = (List<Lists>) manager.createQuery("from Lists where userName='Mirr' ").getResultList();
        manager.getTransaction().commit();
        manager.close();
        for(Lists lists:notes)
        {
            System.out.println(lists.toString());
        }
    }
}
