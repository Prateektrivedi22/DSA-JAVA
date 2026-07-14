public class SingleNumber {
    public static void main(String [] args ){
        int [] nums = {4, 1, 2, 1, 2};
        for(int i = 0; i < nums.length ; i++){
        int count = 0 ;
        for(int j = 0; j < nums.length ; j++){

            if(nums[i] == nums[j]) {
                count++;
            }



        }           
        if(count == 1 ){
           System.out.println("single number = " + nums[i]);
           return;
        }

         }
         System.out.println("no single number found");


    }
}
