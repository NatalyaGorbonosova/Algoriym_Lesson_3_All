public class Sort {
    public static void heapSort(int[] array){
        int n = array.length;

        for(int i = n/2 - 1; i >= 0; i--){
            heaphy(array, n, i);
        }
        for (int i = n-1; i >= 0; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] =temp;

            heaphy(array, i, 0);
        }
    }
    public static void heaphy(int[] array, int n, int rootIndex){
        int largest = rootIndex;
        int left = rootIndex*2 + 1;
        int right = rootIndex*2 +2;

        if(left < n && array[left]>array[largest])
            largest = left;
        if(right < n && array[right] > array[largest])
            largest = right;

        if(largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heaphy(array, n, largest);
        }

    }
    public static void printArray(int[] array){
        for (int i: array){
            System.out.println(i + ' ');
        }
    }
}
