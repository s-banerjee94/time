package com.race.time.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.race.time.modal.Chips;

@Repository
public interface ChipsRepo extends JpaRepository<Chips, Integer> {

}
