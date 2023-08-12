public class Algo_3 {
    public static void main(String[] args) {
        
        //Given array
        int[] nums = {10, 20, 30, 40, 50};

        //Create a new array to store the elements in the opposite sequence. 
        int[] reverseNums = new int[nums.length];

        //Populate the reverseNums array
        for (int i = 0; i < nums.length; i++) {
            reverseNums[i] = nums[nums.length - 1 - i];  
        }

        //Assign the memory location of the reverseNums array to the nums array.
        nums = reverseNums;

        //Print the nums array which has the elements in opposite sequence. 
        for(int number : nums){
            System.out.print(number + " ");
        }

        System.out.println();

    }
    
}
