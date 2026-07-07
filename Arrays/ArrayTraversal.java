public class ArrayTraversal {
    public static void main (String[] args){

        // QUESTION1 : PRINYT ALL THE ELEMNTS OF THE ARRAY

    // int [] arr = { 5, 9, 2, 67, 45 };
    // for (int i = 0; i < arr.length; i++){
    //     System.out.print(arr[i] + " ");
    //     }

        // QUESTION 2 : FIND THE SUM OF ALL OF THE ELEMENTS OF THE ARRAY 

        
    // int [] arr = { 5, 9, 2, 67, 45 };
    // int sum = 0 ;
    // for (int i = 0; i < arr.length; i++){
    //      sum = sum + arr[i];


    // }
    // System.out.println(sum);

    
    //  QUESTION 3 : FIND THE MAXIMUM OF ALL THE ELEMENMTS OF THE ARRAUY 

//     int [] arr = { 5, 98, 2, 67, 450 };
//     int max = arr[0];
//     for (int i = 1; i < arr.length; i++){
//         if (arr[i] > max)
//             max = arr[i];
        

// }
// System.out.println(max);


// QUESTION 4 : LINEAR SEARCH 

// int[] arr = {12, 5, 18, 7, 25, 10};
// int target = 25;
// int index = -1;

// for( int i = 0 ; i<arr.length; i++){
// if(target == arr[i]){
//     index = i ;
//     break;
// }
// }
// System.out.println(index);

// COUNT EVEN OR ODD

int [] arr = { 5, 9, 2, 67, 45 };
int  evenCount = 0 ;
int oddCount = 0 ;
for (int i = 0; i < arr.length; i++){
    if ( arr[i] % 2 == 0 ) {
      evenCount++;
        
    } else {
        oddCount++;
        
    }
    
}
System.out.println(evenCount);
System.out.println(oddCount);



}
}