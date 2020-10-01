public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        int index = 0;
        if (data.length == 0) {
            return -1;
        }
        if (data[index] == target) {
            return index;
        }
        return -1; // Place holder
    }
}
