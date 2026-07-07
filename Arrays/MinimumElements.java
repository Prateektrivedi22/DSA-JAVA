public class MinimumElements {
    public static void main(String[]args){
// QUERSTIPON : GIVEN AN INTEGWER ARRAY FIND THE MINIMUM ELEMENT .
   
int[] arr = {5, 78, 54, 23 , 944, 4, 90, 42  };
int min = arr[0];
for(int i = 1 ;i<arr.length; i++){
    if( arr[i] < min ){
        min = arr[i];
}
}
System.out.println(min);


    }
    
}
