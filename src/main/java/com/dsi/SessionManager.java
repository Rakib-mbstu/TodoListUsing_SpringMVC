package com.dsi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SessionManager {
    public static EntityManager createSession()
    {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }
}
