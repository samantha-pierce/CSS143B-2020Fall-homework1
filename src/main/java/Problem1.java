public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        // finding the middle index
        int midIndex = (data.length - 1) / 2;
        if (data.length == 0) {
            return -1;
        }
        if (data.length == 1) {
            if (data[midIndex] == target) {
                return midIndex;
            }
        }
        return -1; // Place holder
    }
}
