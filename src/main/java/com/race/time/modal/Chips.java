package com.race.time.modal;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "chips")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Chips {
	@Id
	private String chip;
	private int pid;
	private String firstName;
	private String lastName;
	private Date birthdate;
	private String gender;
	private String race;
}
