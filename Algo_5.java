import java.util.Scanner;

public class Algo_5 {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String text ;
        
        //get a non-empty text
        do {
            System.out.println("Enter a text: ");
            text = scanner.nextLine().trim(); //Trim is used to remove leading/trailing spaces.
        }while(text.isBlank()); //continue untill non empty (even only spaces) text is provided
        
        //Convert the text string to a character array. 
        char[] charArray = text.toCharArray();

        //Invert the sequence of characters by swapping left and right elements.
        int leftElement  = 0; //Initializing the leftElement to store leftmost element. 
        int rightElement= charArray.length - 1; //Initializing the rightElement to store rightmost element.

        while(leftElement < rightElement){
            //Swap characters at left and right
            char temp = charArray[leftElement]; //Initializing temp variable as a temporary variable to store left elements
            charArray[leftElement] = charArray[rightElement];
            charArray[rightElement] = temp;

            leftElement++;
            rightElement--;
        }
        
        //Convert the characters array back to a string. 
        String reverseText = new String(charArray);

        //Print the reversed text.
        System.out.println(reverseText);

    }
    
}
