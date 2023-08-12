public class Algo_4 {
    public static void main(String[] args) {

        //Given array
        int[] nums = {10, 20, 30, 40, 50};

        int leftElement = 0; //initializing the leftElement variable for the leftmost element
        int rightElement = nums.length - 1 ; //initializing the rightElement variable for the rightmost element
        
        //Swap elements between the leftmost element and rightmost element until they meet.
        while(leftElement < rightElement){
            int temp = nums[leftElement]; //initializing the temp variable as a temporary variable. 
            
            nums[leftElement] = nums[rightElement];
            nums[rightElement] = temp; 

            leftElement++;
            rightElement--;

        }

        //Print the nums array with the elements in opposite sequence.
        for(int number : nums){
            System.out.print(number + " ");
        }

        System.out.println();
        
    }
    
}
