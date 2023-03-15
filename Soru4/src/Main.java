public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10000];
// Rastgele dizi oluştur
        for (int x = 0; x < arr.length; x++) {
            arr[x] = (int) (Math.random() * 10000);
        }

// Quick sort'u çalıştır ve süreyi ölç
        long start = System.nanoTime();
        quickSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        System.out.println("Quick sort süresi: " + (end - start) + " nanosaniye");

// Brute force'u çalıştır ve süreyi ölç
        start = System.nanoTime();
        bruteForceSort(arr);
        end = System.nanoTime();
        System.out.println("Brute force süresi: " + (end - start) + " nanosaniye");
    }
    public static void bruteForceSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[y] < arr[x]) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int x = low - 1;
        for (int y = low; y < high; y++) {
            if (arr[y] < pivot) {
                x++;
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
        }
        int temp = arr[x + 1];
        arr[x + 1] = arr[high];
        arr[high] = temp;
        return x + 1;
    }
}
