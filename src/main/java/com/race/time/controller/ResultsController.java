package com.race.time.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.race.time.modal.Results;
import com.race.time.service.ResultsService;

@RestController
@RequestMapping("/results")
public class ResultsController {
	@Autowired
	private ResultsService resultsService;

	@GetMapping("/all")
	public ResponseEntity<List<Results>> getAllResults() {
		List<Results> results = resultsService.getAllResults();
		return ResponseEntity.status(HttpStatus.OK).body(results);
	}
}
