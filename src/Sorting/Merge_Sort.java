package Sorting;

public class Merge_Sort {

    public static void merge(int[] arr, int s, int e){
        int  mid = (s+e)/2;

        int len1 = mid-s+1;
        int len2 = e-mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

         //copy values
         int k = s;
         for(int i=0;i<len1;i++){
             first[i] = arr[k++];
         }

         k = mid+1;
         for(int i=0;i<len2;i++) {
             second[i] = arr[k++];
         }

         //merge
         int i=0, j=0;
         k = s;
         while(i < len1 && j < len2){
             if(first[i] < second[j]){
                 arr[k++] = first[i++];
             }
             else{
                 arr[k++] = second[j++];
             }
         }

         while(i < len1){
             arr[k++] = first[i++];
         }

         while(j < len2){
             arr[k++] = second[j++];
         }
    }

    public static void mergeSort(int[] arr, int s, int e){
        if(s >= e){
            return;
        }

        int mid = (s+e)/2;

        //left part sort
        mergeSort(arr, s, mid);

        //right part sort
        mergeSort(arr, mid+1, e);

        merge(arr, s, e);
    }

    public static void main(String[] args) {
        int arr[] = {6,5,12,10,9,1};

        mergeSort(arr, 0, arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
