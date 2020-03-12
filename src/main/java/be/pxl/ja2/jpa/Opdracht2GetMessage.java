package be.pxl.ja2.jpa;

import be.pxl.ja2.jpa.model.Message;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

public class Opdracht2GetMessage {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("musicdb_pu");
            entityManager = entityManagerFactory.createEntityManager();
            TypedQuery<Message> findAll = entityManager.createQuery("select m from Message m", Message.class);
            List<Message> resultList = findAll.getResultList();
            for(Message message : resultList){
                System.out.println(message.getId() + " " + message.getText());
            }
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }

    }
}
