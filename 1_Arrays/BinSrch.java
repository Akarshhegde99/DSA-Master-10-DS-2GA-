public class BinSrch {

    public static int BSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 8, 9, 12 };
        int key = 12;

        System.out.println(BSearch(arr, key));
    }
}
