package com.race.time.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.race.time.modal.Chips;
import com.race.time.repo.ChipsRepo;

@Service
public class ChipsServiceImpl implements ChipsService{
	@Autowired
	private ChipsRepo chipsRepo;

	public List<Chips> getAllChips() {
		return chipsRepo.findAll();
	}
}
