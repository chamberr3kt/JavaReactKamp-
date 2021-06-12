package com.example.kodlama.io.HRMS.Entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(callSuper = false) 
@Table(name="educations")
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="department")
	private String departmantName;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="end_date")
	private LocalDate endDate;
	
	@ManyToOne()
	@JoinColumn(name ="candidates_id")
	@JsonIgnore
	
	private Candidates candidates;
	
	
	
	public String getEndDate() {
		if (this.endDate == null)
			return "Devam ediyor";
		return this.endDate.toString();
	}
	
}
