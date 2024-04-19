package com.race.time.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.race.time.modal.Chips;
import com.race.time.service.ChipsService;

@RestController
@RequestMapping("/chips")
public class ChipsController {
	@Autowired
	private ChipsService chipsService;

	@GetMapping("/all")
	public ResponseEntity<List<Chips>> getAllChips() {
		List<Chips> chips = chipsService.getAllChips();
		return ResponseEntity.status(HttpStatus.OK).body(chips);
	}
}
