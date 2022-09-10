package Heap;

public class MaxHeap {
    static int size = 0;

    public static void heapInsert(int val, int[] arr){
        size += 1;

        int index = size;
        arr[size] = val;

        while(index > 1){
            int parent = index/2;

            if(arr[parent] < arr[index]){
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;

                index = parent;
            }
            else{
                return;
            }
        }
    }

    public static void deleteFromHeap(int[] arr){
        if(size == 0){
            System.out.println("Nothing to delete");
            return;
        }

        arr[1] = arr[size];
        size--;

        int i=1;
        while(i <= size){
            int leftChild = 2*i;
            int rightChild = 2*i+1;

            if(leftChild <= size && arr[i] < arr[leftChild]){
                int temp = arr[i];
                arr[i] = arr[leftChild];
                arr[leftChild] = temp;

                i = leftChild;
            }
            else if(rightChild <= size && arr[i] < arr[rightChild]){
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


    public static void print(int[] arr){
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];

        heapInsert(8, arr);
        heapInsert(15, arr);
        heapInsert(3, arr);
        heapInsert(101, arr);
        heapInsert(501, arr);

        print(arr);

        deleteFromHeap(arr);
        deleteFromHeap(arr);
        deleteFromHeap(arr);

        System.out.println();
        print(arr);
    }
}
