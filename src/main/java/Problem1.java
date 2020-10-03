public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        if (data.length == 0) {
            return -1;
        }
        return recursiveSearch(data, 0, data.length - 1, target);
        //return index;
        //return -1; // Place holder
    }

    //helper method
    private static int recursiveSearch(int[] data, int start, int end, int target) {
        int mid = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (data[mid] == target) {
            return mid;
        // check left half
        } else if (target < data[mid]) {
            return recursiveSearch(data, start, mid - 1, target);
        } //else if (target > data[mid]) {
            // check right half
        return recursiveSearch(data, mid + 1, end, target);
    }

    // credit to https://javarevisited.blogspot.com/2017/04/recursive-binary-search-algorithm-in-java-example.html
    // for help with writing helper method
}
