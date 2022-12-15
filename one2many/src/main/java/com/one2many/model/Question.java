package com.one2many.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;


@Entity
public class Question {
	@Id
	@GeneratedValue(generator = "increment")
	private int questionId;
	private String qname;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "QUESTION_ANSWER", joinColumns = @JoinColumn(name = "QUESTION_ID"),inverseJoinColumns = @JoinColumn(name= "ANSWER_ID"))
//	@OrderColumn(name = "type")
	private List<Answer> answers;

	public int getId() {
		return questionId;
	}

	public void setId(int id) {
		this.questionId = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

}
