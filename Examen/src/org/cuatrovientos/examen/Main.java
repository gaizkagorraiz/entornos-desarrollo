/**
 * 
 */
package org.cuatrovientos.examen;

import java.util.Scanner;

/**
 * @author Gaizka Gorraiz
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		QuestionList questionList = new QuestionList();
		String wording = "";
		int number = 0;
		String answer = "";
		Question questioon = null;
		
		Scanner reader = new Scanner(System.in);
		String option = "";
		
		
		
		do {
			System.out.println("-----Question list management-----");
			System.out.println("Select one option:\n");
			System.out.println("1. Add new question");
			System.out.println("2. Remove question");
			System.out.println("3. Show all question list");
			System.out.println("4. Show one question");
			System.out.println("5. Check answer");
			
			option = reader.nextLine();
			
			switch (option) {
			case "1":
				System.out.println("Please, enter text");
				wording = reader.nextLine();
				number = Integer.parseInt(reader.nextLine());
				answer = reader.nextLine();
				questionList = new QuestionList();
				questioon = new Question(number,wording,answer);
				questionList.addQuestion(questioon);
				break;
				
			case "2":
				System.out.println("Please enter a question number");
				number = Integer.parseInt(reader.nextLine());
				questionList.removeQuestion(questioon);
				break;
				
			case "3":
				System.out.println("All question list");
				System.out.println(questionList.showAll());
				break;
			
			case "4":
				System.out.println("Show a random question");
				System.out.println(questionList.showQuestion());
				
			case "5":
			System.out.println("Please enter question number");
			number = Integer.parseInt(reader.nextLine());
			for (int i = 0; i < questionList.getQuestions().size(); i++) {
				if (questionList.getQuestions().get(i).getNumber() == number ) {
					System.out.println("CORRECT:)");
				} else {
					System.out.println("INCORRECT:(");
				}
			}
				
			case "6":
				System.out.println();
				System.out.println("Bye");
			
			default:
				System.out.println();
				System.out.println("TRY AGAIN");
				break;
					
			}
		
		} while (!option.equals("6"));
}
}