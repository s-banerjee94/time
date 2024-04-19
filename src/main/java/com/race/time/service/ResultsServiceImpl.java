package com.race.time.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.race.time.modal.Results;
import com.race.time.repo.ResultsRepo;

@Service
public class ResultsServiceImpl implements ResultsService {
	@Autowired
	private ResultsRepo resultsRepo;
	
	public List<Results> getAllResults() {
		return resultsRepo.findAll();
	}
}
