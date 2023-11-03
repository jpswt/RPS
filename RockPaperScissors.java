import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("Are you ready? Write 'yes' if you are.");
    String response = scan.nextLine();

    if (response.equals("yes")) {
      System.out.println("Great!");
      System.out.println("rock-paper-scissors, shoot!");
      String userChoice = scan.nextLine();
      String computerChoice = computerChoice();
      String result = result(userChoice, computerChoice);
      printResult(userChoice, computerChoice, result);
    } else {
      System.err.println("OK, maybe some other time...");
    }

    scan.close();
  }

  /**
   * Function name: computerChoice - picks randomly between rock paper and scissors
   * @return a choice (String).
   *
   * Inside the function:
   *   1. Picks a random number between 0 and 2.
   *   2. if 0: returns the choice 'rock'
   *      if 1: returns the choice 'paper'
   *      if 2: returns the choice 'scissors'
   */
  public static String computerChoice() {
    double number = Math.floor(Math.random() * 3);
    if (number == 0) {
      return "rock";
    } else if (number == 1) {
      return "paper";
    } else if (number == 2) {
      return "scissors";
    } else {
      return "Error in the app";
    }
  }

  /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *   4. Otherwise, "INVALID CHOICE" and exit the program.
     *
     *
     */

  public static String result(String yourChoice, String computerChoice) {
    String result = "";

    if (yourChoice.equals(computerChoice)) {
      result = "It's a tie";
    } else if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
      result = "You win!";
    } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
      result = "You win!";
    } else if (
      yourChoice.equals("scissors") && computerChoice.equals("paper")
    ) {
      result = "You win!";
    } else if (yourChoice.equals("scissors") && computerChoice.equals("rock")) {
      result = "You lose!";
    } else if (yourChoice.equals("rock") && computerChoice.equals("paper")) {
      result = "You lose!";
    } else if (
      yourChoice.equals("paper") && computerChoice.equals("scissors")
    ) {
      result = "You lose!";
    } else {
      result = "INVALID CHOICE";
    }

    return result;
  }

  /**
   * Name: printResult - It prints everything (your choice, computer choice, result)
   * @param yourChoice (String)
   * @param computerChoice (String)
   * @param result (String)
   *
   * Inside the function:
   *
   *  1. prints everything:
   *      – prints: You chose:          <your choice>
   *      – prints: The computer chose: <computer choice>
   *      – prints: <result>
   */
  public static void printResult(
    String yourChoice,
    String computerChoice,
    String result
  ) {
    System.out.println("You chose: " + yourChoice);
    System.out.println("You computer chose: " + computerChoice);
    System.out.println(result);
  }
}
