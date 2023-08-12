import java.util.Scanner;

public class Algo_1{

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
    loop:do{
            //get a positive number as the input 
            System.out.println("Enter a positive number: ");
            int number = scanner.nextInt();

            //check whether the input is a positive number or not.
            if(number < 0){ //zero alos considered as positive number since it is the first term of fibonacci sequence
                System.out.println("Invalid number!");
                continue loop;
            }

            int a = 0; //initializing the first term of the fibonacci sequence. 
            int b = 1; //initializing the second term of the fibonacci sequence. 
 
            //print the output
            System.out.print("Fibonacci Sequence of "+ number +" : "); 

            //do while loop for generating the fibonacci sequence 
            do{
                System.out.print(a + " ");
                b = a + b;
                a = b - a; 
            }while(a<= number);

            System.out.print("\n\n");

        }while (true);
        
    }
}