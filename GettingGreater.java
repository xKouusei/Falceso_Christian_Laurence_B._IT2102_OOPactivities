import java.util.Scanner;
public class GettingGreater {

    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Getting the Great Value");

        System.out.print("Enter the first Character: ");
        char firstChar=cin.next().charAt(0); 

        System.out.print("Enter the Second Character: ");
        char secondChar=cin.next().charAt(0);

        int First = (int) firstChar;
        int Second = (int) secondChar;
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("The character with greater value is: " + (char)Math.max(First, Second));
        System.out.println("-----------------------------------------------------------");
        System.out.println("Showwing the ASCII Codes");
        System.out.println(firstChar + ": " + First);
        System.out.println(secondChar+ ": " + Second);
    }
}
