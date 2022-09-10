package Heap;

//1 index based array

public class MinHeap {
    private static int size = 0;

    private static void heapInsert(int[] arr, int val){
        size++;

        int index = size;
        arr[index] = val;

        while(index > 1){
            int parent = index/2;

            if(arr[index] < arr[parent]){
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;

                index = parent;
            }
            else{
                return;
            }
        }
    }

    private static void deleteFromMinHeap(int[] arr) {
        if(size == 0){
            System.out.println("Sorry, Nothing to delete");
            return;
        }

        arr[1] = arr[size];
        size--;

        int i = 1;
        while(i <= size){
            int leftChild = 2*i;
            int rightChild = 2*i+1;

            if(leftChild <= size && arr[leftChild] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[leftChild];
                arr[leftChild] = temp;

                i = leftChild;
            }
            else if(rightChild <= size && arr[rightChild] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[rightChild];
                arr[rightChild] = temp;

                i = rightChild;
            }
            else{
                return;
            }
        }
    }

    private static void print(int[] arr) {
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];

        heapInsert(arr, 50);
        heapInsert(arr, 31);
        heapInsert(arr, 42);
        heapInsert(arr, 23);
        heapInsert(arr, 56);
        heapInsert(arr, 59);

        print(arr);

        deleteFromMinHeap(arr);

        System.out.println();
        print(arr);

    }
}
