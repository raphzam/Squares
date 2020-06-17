import java.util.Scanner;

public class Squares {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n;

        //Prompts user for a number that is not 0
        do {
        System.out.println("Enter a number:");
        n = input.nextInt();
        } while (n == 0);

        //Graphical Printing
        System.out.println("Number          Square");
        System.out.println("-----------------------");

        //Prints squares counting up to negative numbers and counting down to negative numbers
        if (n > 0) {
            for (int i = 1; i < n + 1; i++) {
                System.out.println(i + "               " + (i * i));
            } //end of first condition
        } else {//if n < 0
            for (int i = -1; i > n - 1; i--) {
                System.out.println(i + "               " + (i * i));
            }   //end of second body
        }   //end of second condition
    }
}

