package org.sid.cinema.dao;

import org.sid.cinema.entities.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Cinema,Long> {
}
