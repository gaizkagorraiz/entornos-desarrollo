/**
 * 
 */
package org.cuatrovientos.examen;

import java.util.Random;
import java.util.Vector;


/**
 * @author Gaizka Gorraiz
 *
 */
public class QuestionList {
	
	private Vector<Question> questions;

	/**
	 * @return the questions
	 */
	public Vector<Question> getQuestions() {
		return questions;
	}

	/**
	 * @param questions the questions to set
	 */
	public void setQuestions(Vector<Question> questions) {
		this.questions = questions;
	}
	
	/**
	 * iniciar el vector
	 */
	public QuestionList() {
		questions = new Vector<Question>();
	}

	/**
	 * añadir pregunta al cuestionario
	 * @param question
	 */
	public void addQuestion (Question question)  {
		questions.add(question);
	}

	/**
	 * eliminar pregunta del cuestionario
	 * @param question
	 */
	public void removeQuestion (Question question){
		
		questions.remove(question.getNumber());
		
	}
	/**
	 * mostrar todo el cuestionario
	 * @return result
	 */
	public String showAll() {
	String result = "";
	for (Question question: questions) {
	result = result + question.toString() + "\n";
	}
	return result;
	}
	/**
	 * muestra una pregunta aleatoria
	 * @return
	 */
	public String showQuestion() {
		Random random = new Random();
		String result = "";
		for (Question question: questions) {
		result = result + random.toString() + "\n";
		}
		return result;
		}
	
	/**
	 * comprobar una respuesta
	 * @param question
	 * @return
	 */
	public String checkAnswer(Question question) {
		questions.get(question.getNumber()) ;
	return null;
}
}
