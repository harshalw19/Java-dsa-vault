import java.util.Scanner;

public class Main{ // public = accessible from anywhere, class = blueprint for creating objects, Main = name of the class

    public static void main(String[] args) { // public = accessible from anywhere, static = can be run without creating an object, void = does not return a value, main = name of the method, String[] args = parameter that can take command line arguments
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in); // Scanner = class that allows user input, input = name of the object, new = creates a new object, System.in = standard input stream
        String message= input.nextLine(); // nextInt() = method that reads an integer from the user
        System.out.println("You entered: " + message);
    }
}