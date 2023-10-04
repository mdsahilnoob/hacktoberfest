import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};//you can change the numbers in the array to sort it
        sort(arr);
        System.out.println(Arrays.toString(arr));//output is a sorted array
    }

    static void sort(int[] arr){
        int i=0;
        while(i < arr.length){
            int correct=arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i , correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
