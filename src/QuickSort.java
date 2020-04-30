public class QuickSort {
    public static void sort(int[] a) {
        // at the place where the two partitions meet, sort either side recursively using the same method..
        sort(a, 0, a.length - 1);

        //todo: shuffle at beginning as ordered and nearly ordered are expensive
        //todo: use 3-part partition to effectively manage many duplicate keys
        //todo: optimize by selecting pivot closer to median (median-of-3)
    }

    private static void sort(int[] a, int low, int high) {
        if (high <= low) return;

        // partition the array into < and > an arbitrary pivot value
        int intersection = qsort(a, low, high);
        printArray(a);

        // recursively call on both sides of partition, not including pivot
        sort(a, low, intersection - 1);
        sort(a, intersection + 1, high);
    }

    private static int qsort(int[] a, int min, int max) {
        int low = min;
        int high = max+1;
        //set high as max+1 so that we can conveniently decrement on every loop when sliding.

        // take the first value on the left as the pivot
        int pivotValue = a[min];

        System.out.print("pivotVal: ");
        System.out.println(pivotValue);

        // partition the array so that all values smaller are on the left side...
        // and all values greater are on the right side
        while (low < high) {

            // slide along a pointer from the left until an element less than pivot is found
            // -- remember that the first value on the left is the pivot itself.
            while (a[++low] < pivotValue) {
                if (low == max) break;
            }

            // then slide along the right until an element greater than pivot is found
            while (a[--high] > pivotValue) {
                if (high == min) break;
            }

            // if the pointers haven't crossed over, swap the values, otherwise finish the loop.
            if (low >= high) break;
            swap(a, low, high);
        }

        //finally swap the pivot to the where the partitions are divided
        swap(a, min, high);
        return high;
    }

    private static void printArray(int[] a) {
        System.out.println("----array----");
        for (int i : a) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println();
    }

    private static void swap(int[] a, int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
