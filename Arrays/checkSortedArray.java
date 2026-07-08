public class checkSortedArray {
    public static void main(String[]args){
    // question : given an integer array , detyermine whether the array is sorted in ascending order or not .
int [] arr = {1,2,3,4,5,6,7,8,9,10};
boolean issorted = true;
for(int i=0; i < arr.length-1 ;i++){
    if(arr[i] > arr[i+1]){
         issorted = false ;
        break;

        
    }
}
    System.out.println(issorted );


    }
    
}
