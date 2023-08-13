import java.util.Scanner;

public class Algo_9 {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String word;

        //Get input from the user until a valid single word is provided. 
        do{
            System.out.println("Enter a single word: ");
            word = scanner.nextLine().toLowerCase().trim();

            if (word.contains(" ")){
                System.out.println("Invalid Input.\n");
            }
        }while(word.contains(" ") || word.isEmpty());

        boolean isPalindrome = true;

        int leftLetter = 0;
        int rightLetter = word.length() -1;

        //Compare the letters and characters from both ends towards the center. 
        while (leftLetter < rightLetter){
            if(word.charAt(leftLetter) != word.charAt(rightLetter)){
                isPalindrome = false;
                break;
            }
            leftLetter++;
            rightLetter--;
        }
        
        //Print whether the word is a palindrome or not.
        if (isPalindrome) System.out.println(word +" is a palindrome.");
        else System.out.println(word + " is not a palindrome.");
        
    }
    
}
