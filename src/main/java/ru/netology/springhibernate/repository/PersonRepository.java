package ru.netology.springhibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import ru.netology.springhibernate.entity.Person;

import java.util.List;

@Repository
@AllArgsConstructor
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Person p where p.cityOfLiving = :city order by p.cityOfLiving", Person.class).setParameter("city", city).getResultList();
    }
}
