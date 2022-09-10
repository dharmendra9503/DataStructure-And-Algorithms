package Heap;

//Here array is 1 index based
//Build Max-heap

public class Heapify_Algorithm {

    public static void heapify(int[] arr, int size, int i) {
        int largest = i;
        int left = 2*i;
        int right = 2*i+1;

        if(left < size && arr[largest] < arr[left]){
            largest = left;
        }
        if(right < size && arr[largest] < arr[right]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;

            heapify(arr, size, largest);
        }
    }

    private static void print(int[] arr, int size) {
        for(int i=1;i<size;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {-1, 27, 54, 50, 49, 52, 101};
        int size = arr.length;

        for(int i=size/2;i>0;i--){           //If array is 0th index based then we need to start with size/2 - 1;
            heapify(arr, size, i);
        }

        print(arr, size);
    }
}
