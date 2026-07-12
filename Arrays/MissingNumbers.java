public class MissingNumbers {
    public static void main (String [] args){
        int [] nums = {3, 0, 1};
         int n = nums.length;
         int actualSum = 0 ;

         int expectedSum = n * (n+1)/2 ;
        
        
         
         for( int i = 0 ; i< nums.length ; i++){
            actualSum = actualSum + nums[i];
         }

          int missingNumber = expectedSum - actualSum ;
          System.out.println(missingNumber );
        }
}
