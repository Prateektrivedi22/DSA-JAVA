public class MoveZeroes {
    public static void main(String[] args){

    // QUESTION: GIVEN AN INTEGER ARRAY , MOVE ALL THE 0S TO THE END OF THE ARRAY WHILE MAINTAINING THE RELATIVE ORDER OF THE NON ZERO ELEMENTS.
    
    int [] arr = { 1, 0, 2, 0, 3, 4, 0, 5};
    int insertIndex = 0;
    int temp;
    
    for( int i = 0 ; i < arr.length; i++){
        if (arr[i] != 0){
             temp = arr[i];
        arr[i] = arr[insertIndex];
        arr[insertIndex] = temp;
            insertIndex++;

        }


    }
    for(int i = 0 ; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    }
    
}
