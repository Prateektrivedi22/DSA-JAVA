public class SecondLargestElement {
    public static void main(String[] args){

    //    QUESTION : GIVEN AN ARRAY INTEGER, FIND THE SECOND LARGEST ELEMENT
    
   int [] arr = { 78, 5 , 54};
   int largest = Integer.MIN_VALUE;
   int secondLargest = Integer.MIN_VALUE;
   for(int i = 0 ; i< arr.length;i++){
    if(  arr[i] > largest ){
        secondLargest = largest;
         largest = arr[i];             
         }
         else if(arr[i] < largest && arr[i] > secondLargest){
            secondLargest = arr[i];

         }

         

   }
System.out.println(secondLargest );

}
    
}
