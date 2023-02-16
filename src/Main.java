import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String question = "Who is Shepard's best friend in the galaxy?";
        String choiceOne = "Wrex";
        String choiceTwo = "Tali";
        String choiceThree = "Garrus";

        String correctAnswer = choiceThree;

        //Write a print statement asking the question
        System.out.println(question);
        //Write a print statement giving the answer choices
        System.out.println("Choose one of the following: " + choiceOne + ", " + choiceTwo + ", " + choiceThree+ ".");
        //Have the user input an answer
        Scanner input = new Scanner(System.in);
        //Retrieve the user's input
        String answer = input.nextLine();

        //If the user's input matches the correct answer
        //then the user is correct and we want to print out a congrats message to the user
        //If the user's input does not match the correct answer
        //then the user is incorrect and we want to print out an error message to the user

        if (correctAnswer.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
