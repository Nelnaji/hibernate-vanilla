package demoJPA;

import demoJPA.entities.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DemoJPA");
        EntityManager em = emf.createEntityManager();
        Book book = new Book("1325547875446", "comte de monte cristo","alexandre dumas", "histoire d'un marin ....");
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
    }
}

