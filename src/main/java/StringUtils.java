import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Stringutils {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something: ");
        String userInput = sc.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number!");
        } else {
            System.out.println("You entered: " + userInput);
            System.out.println("Flipped: " + StringUtils.swapCase(userInput));
            System.out.println("Reversed: " + StringUtils.reverseDelimited(StringUtils.reverse(userInput), ' '));
        }

//        System.out.println("Flip it: ");


    }
}