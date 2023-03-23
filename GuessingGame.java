import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        declare secret number
        int secretNumber = 12;

//        prompt user to guess number
        System.out.println("There is a secret number, please guess what this is");

//        Collect user input
        int userGuess = sc.nextInt();

//        check if input is higher, lower, or equal to secret number
//        give responses depending on the above
        if (userGuess < secretNumber) {
            System.out.println("Too low!");
        }else if(userGuess > secretNumber) {
            System.out.println("Too high!");
        }else {
            System.out.println("Spot on!");
        }
    }
}
