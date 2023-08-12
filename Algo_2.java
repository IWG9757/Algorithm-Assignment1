public class Algo_2 {
    public static void main(String[] args) {
        
        //given array
        int[] nums = {-5, 2, 7, 10, 58, -7, 8, 23};

        // initializing the smallest and largest variables to store smallest and largest numbers respectively. 
        int smallest = nums[0]; 
        int largest = nums[0]; 

        //for loop is used to iterate through the given array to find the largest and smallest numbers. 
        for (int number : nums ){

            //update the smallest if a smaller number is found.
            if (number < smallest) smallest = number;

            //update the largest if a larger number is found.
            if (number > largest) largest = number;
        }

        //print the smallest and the largest number of the given array. 
        System.out.println("Smallest number: "+ smallest);
        System.out.println("Largest number: "+ largest);
    }
}
