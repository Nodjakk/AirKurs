package com.airkurs.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class FlightDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Flight flight) {
        entityManager.persist(flight);
    }

    public List<Flight> findAll() {
        return entityManager.createQuery("SELECT f FROM Flight f", Flight.class).getResultList();
    }

    public Flight findById(Long id) {
        return entityManager.find(Flight.class, id);
    }

    public void delete(Long id) {
        Flight flight = findById(id);
        if (flight != null) {
            entityManager.remove(flight);
        }
    }
}
