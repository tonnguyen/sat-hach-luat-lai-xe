package vn.tonnguyen.sathach.bean;

import java.io.Serializable;

public class Question implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4160490554549912221L;
	
	private String questionFileName;
	private int numberOfAnswers;
	private int answer;
	private int userChoice; // which answer user has chosen. <= 0 means no answer

	public Question(String questionFileName, int numberOfAnswers, int answer) {
		this.questionFileName = questionFileName;
		this.numberOfAnswers = numberOfAnswers;
		this.answer = answer;
	}

	public String getQuestionFileName() {
		return questionFileName;
	}

	public void setQuestionFileName(String questionFileName) {
		this.questionFileName = questionFileName;
	}

	public int getNumberOfAnswers() {
		return numberOfAnswers;
	}

	public void setNumberOfAnswers(int numberOfAnswers) {
		this.numberOfAnswers = numberOfAnswers;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	/**
	 * Gets which answer user has chosen. <= 0 means no answer
	 * @return
	 */
	public int getUserChoice() {
		return userChoice;
	}

	/**
	 * Sets which answer user has chosen. <= 0 means no answer
	 * @param userChoice answer that user has chosen. <= 0 means no answer given
	 */
	public void setUserChoice(int userChoice) {
		this.userChoice = userChoice;
	}

	@Override
	public String toString() {
		return String.format("Question %s, number of answer : %d, answer: %d user choice: %d",
				getQuestionFileName(), getNumberOfAnswers(), getAnswer(), getUserChoice());
	}
	
	/**
	 * Return a copy of this
	 */
	public Question clone() {
		return new Question(questionFileName, numberOfAnswers, answer);
	}
}
