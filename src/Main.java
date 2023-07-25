
public class Main {
    public static void main(String[] args) {
        LinkedListT<String> list = new LinkedListT<>();
        list.add("Hello");
        list.add("Hello");
        list.add("World");
        list.add("Hi");
        list.add("Hello");
        list.add("Hi");
        list.add("dfg");

        LinkedListT<Integer> list2 = new LinkedListT<>();
        list2.add(5);
        list2.add(9);
        list2.add(6);
        list2.revert();
        list2.print();

    }


//    int[] array1 =  {2, 8, 4, 3, 2, 1, 6, 8, 3, 10};
//
//    public static void heapSort(int[] array){
//        int n = array.length;
//        for(int i = n/2 - 1; i >= 0; i--){
//            heaphy(array, n, i);
//        }
//        for (int i = n-1; i >= 0; i--){
//            int temp = array[0];
//            array[0] = array[i];
//            array[i] =temp;
//            heaphy(array, i, 0);
//        }
//    }
//    public static void heaphy(int[] array, int n, int rootIndex){
//        int largest = rootIndex;
//        int left = rootIndex*2 + 1;
//        int right = rootIndex*2 +2;
//
//        if(left < n && array[left]>array[largest])
//            largest = left;
//        if(right < n && array[right] > array[largest])
//            largest = right;
//        if(largest != rootIndex){
//            int temp = array[rootIndex];
//            array[rootIndex] = array[largest];
//            array[largest] = temp;
//            heaphy(array, n, largest);
//        }
//
//    }
//    public static void printArray(int[] array){
//        for (int i: array){
//            System.out.println(i + ' ');
//        }
//    }
//





}