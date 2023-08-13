import java.util.Scanner;

public class Algo_10 {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String phoneNumber;

        //Get the input from the user until the input is not a blank.
        do{
            System.out.println("Enter a phone number (+94 XX XXX XXXX or 0XX-XXXXXXX): ");
            phoneNumber = scanner.nextLine().trim();
            
        }while(phoneNumber.isBlank());

        boolean isValid = true;
        String digitsOnly = phoneNumber.replaceAll("[^\\d]","");
        
        if (digitsOnly.length() == 10){
            if (phoneNumber.startsWith("+94")){

                //check digits for +94 format
                for (int i = 4; i <= 9; i++) {
                    if(!Character.isDigit(digitsOnly.charAt(i))){
                        isValid = false;
                        break;
                    }
                    
                }
            }else if (phoneNumber.contains("-") && phoneNumber.charAt(3)=='-'){

                //check digits for 0XX-XXXXXXX format
                for (int i = 2; i <= 9; i++) {
                    if(!Character.isDigit(digitsOnly.charAt(i))){
                        isValid = false;
                        break;
                    }   
                }
            }else isValid = false; //For invalid format
        }else isValid = false; //For invalid length

        //Print the output
        if(isValid) {
            System.out.println("Number is validated.");
        }else {
            System.out.println("Invalid phone number.");
        }
        
    }

    
}
