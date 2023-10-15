
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("\t\t----------: Welcome to Quiz Game :----------");

        String[] questions = {
            "Which planet is known as the Red Planet?\n",
            "What is the capital of France?\n",
            "What is the largest mammal on Earth?\n",
            "Which gas do plants absorb from the atmosphere?\n",
        };
        
        String[] options = {
            "1) Venus  2) Mars \n3) Jupiter  4) Saturn",
            "1) London  2) Berlin  \n3) Paris  4) Madrid",
            "1) Elephant  2) Blue whale  \n3) Giraffe  4) Rhinoceros",
            "1) Oxygen  2) Carbon dioxide  \n3) Nitrogen  4) Hydrogen",
        };

        int[] correctAnswers = {2, 3, 2, 2};

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);

            System.out.print("\nEnter the number of your answer [1-4] : ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct! You earned a point.");
                score++;
            } else {
                System.out.println("Wrong answer. The correct answer is option " + correctAnswers[i] + ".");
                break;
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Your score: " + score + " out of " + questions.length);

        scanner.close();
    }
}
