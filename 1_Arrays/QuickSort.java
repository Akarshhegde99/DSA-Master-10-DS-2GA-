
public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low]; // Pivot is the first element
        int i = low + 1; // Start from the next element after pivot
        int j = high; // Start from the last element

        while (i <= j) {
            // Find the element on the left that should go to the right
            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            // Find the element on the right that should go to the left
            while (arr[j] > pivot) {
                j--;
            }

            // Swap elements if needed
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in the correct position
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // Return the pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
