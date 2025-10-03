package practicequestions.arrayquestions.two;

public class Sorting {
    public static void main(String[] args) {
        int [] arr = {5,1,3,4,2};

        System.out.print("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
           for(int j = i + 1; j < arr.length; j++){
               int temp = 0;
               if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
            System.out.print(arr[i] + " ");
        }
    }
}
