public class BinaryHeap {
    int N;
    int[] a;
        //binary heap shape as array 0 - 1/2 - 3,4/5,6 - 7,8/9,10/11,12/13,14

    public BinaryHeap(int cap) {
        a = new int[cap];
        N = 0;
    }

    public int max() {
        return a[0];
    }

    public int deleteMax() {
        return 0;
    }

    public void insert(int val) {
        a[N] = val; //insert at bottom
        swim(N);
        N++;
    }

    private void swim(int i) {
        int parentIndex = parent(i);

        // while bigger than parent, swap
        while (parentIndex >= 0 && a[i] > a[parentIndex]) {
            swap(a, i, parentIndex);
            i = parentIndex;
            parentIndex = parent(parentIndex);
        }

    }

    private void swap(int[] a, int i, int i2) {
        int temp = a[i];
        a[i] = a[i2];
        a[i2] = temp;
    }

    private int parent(int i) {
        return Math.round((i + 0.5f) / 2) - 1;
    }
}
