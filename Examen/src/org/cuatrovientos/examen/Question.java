/**
 * 
 */
package org.cuatrovientos.examen;

/**
 * @author Gaizka Gorraiz
 *
 */
public class Question {
	
	private int number;
	private String wording;
	private String answer;
	
	public Question(int number, String wording, String answer) {
		super();
		this.number = number;
		this.wording = wording;
		this.answer = answer;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the wording
	 */
	public String getWording() {
		return wording;
	}

	/**
	 * @param wording the wording to set
	 */
	public void setWording(String wording) {
		this.wording = wording;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [number=" + number + ", wording=" + wording + ", answer=" + answer + "]";
	}

	
}
