import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 word");
        String word1 = input.nextLine();
        System.out.println("Enter another word");
        String word2 = input.nextLine();
        System.out.println("Enter a number");
        String number1 = input.nextLine();
        System.out.println("Enter another number");
        String number2 = input.nextLine();
        
        int number1add = Integer.parseInt(number1);
        int number2add = Integer.parseInt(number2);

        
        System.out.println(word1 + word2 + (number1add + number2add) + "@gmail.com");
        
        System.out.println("Enter 1 number");
        String number1a = input.nextLine();
        System.out.println("Enter another number");
        String number2a = input.nextLine();

        double number1adivide = Double.parseDouble(number1a);
        double number2adivide = Double.parseDouble(number2a);

        System.out.println("number 1 divided by number 2 is " + (number1adivide / number2adivide));

        
        System.out.println("What is the diameter of your circle?");
        String diameter = input.nextLine();

        double diameter1 = Double.parseDouble(diameter);
        
        System.out.println("your circle's area is " + ((diameter1 / 2) * (diameter1 / 2) * Math.PI));





    }

}