import java.util.Scanner;

public class Algo_6 {

    private final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {

        String sentence ; //Initializing the sentence variable to store the input sentence.
        
        //Get the input from the user as a non-empty sentence 
        do{
            System.out.println("Enter a sentence: ");
            sentence = scanner.nextLine().trim(); 
        }while (sentence.isEmpty());

        //Split the input sentence into array of words
        String[] words = sentence.split("\\s+"); //split by whitespaces.

        //Reverse the order of words
        int leftWord = 0; 
        int rightWord = words.length - 1;

        //Swap the left and right positions of the words
        String temp = words[leftWord];
        words[leftWord] = words[rightWord];
        words[rightWord] = temp;

        leftWord++;
        rightWord--;

        //Construct the reversed sentence by joining the words.
        String reversedSentence = String.join(" ", words);

        //Print the reversed sentence 
        System.out.println("Reversed Sentence: " + reversedSentence);

    }
    
}
