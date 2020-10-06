public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        // Sorting in ascending order
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j+1] < data[j]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }
}

// credit to https://www.geeksforgeeks.org/bubble-sort/ for how to implement bubble sort algorithm
// and https://www.youtube.com/watch?v=F13_wsHDIG4 for explanation of bubble sort algorithm
