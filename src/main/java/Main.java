public class Main {
    public static void main(String[] args){

        // linear search = Iterate through a collection one element at a time

        //                 runtime complexity: O(n)

        //                 Disadventages:
        //                 Slow for large data sets

        //                 Advantages:
        //                 Fast for searches small to medium data sets
        //                 Does not need to be sorted
        //                 Useful for data structures that do not have random access (Linked Lists)

        int[] array = {0, 3, 1, 6, 4, 2, 9, 7, 8, 5};
        int index = linearSearch(array, 11);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found.");
        }


    }
    private static int linearSearch(int[] array, int value){

        for (int i=0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
