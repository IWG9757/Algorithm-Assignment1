import java.util.Scanner;

public class Algo_7 {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence; 

        //get the input from the user as a non-empty sentence 
        do{
            System.out.println("Enter a sentence: ");
            sentence = scanner.nextLine().trim();
        }while (sentence.isBlank());

        //Split the input sentence into an array of words
        String[] words = sentence.split("\\s+"); //split by whitespaces

        //Initialize variables to store shortest and longest lengths. 
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = 0; 

        //Variables to store words woth shortest and longest lengths 
        String shortestWords ="";
        String longestWords = "";


        //Iterate through words to find the shortest and longest words
        for (String word : words){
            int length = word.length();
            
            if (length < shortestLength){
                shortestLength = length;
                shortestWords = word;
            }else if (length == shortestLength) shortestWords += ", "+ words;

            if (length > longestLength){
                longestLength = length ;
                longestWords = word;
            }else if (length == longestLength) longestWords += ", " + word;
        }

        //Print the shortest and longest words and their lengths. 
        System.out.println("Shortest word: " + shortestWords + " & Length of the shortest word: " + shortestLength);
        System.out.println("Longest word: " + longestWords + " & Length of the longest word: " + longestLength);
    }
    
}
