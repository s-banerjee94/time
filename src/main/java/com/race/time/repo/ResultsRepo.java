
package com.race.time.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.race.time.modal.Results;

@Repository
public interface ResultsRepo extends JpaRepository<Results, Integer> {

}
