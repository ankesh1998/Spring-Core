package com.spring.test.springreftype;

public class Student {

	private Score scores;

	public Score getScores() {
		return scores;
	}

	public void setScores(Score scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [scores=" + scores + "]";
	}

}
