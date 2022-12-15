package com.one2many.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Answer {
	@Id
	@GeneratedValue
	private int answerId;
	private String answername;
	private String postedBy;

	public int getId() {
		return answerId;
	}

	public void setId(int id) {
		this.answerId = id;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}

	public String getPostedBy() {
		return postedBy;
	}

	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}

}
