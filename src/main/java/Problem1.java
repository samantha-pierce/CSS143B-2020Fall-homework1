public class Problem1 {

    // Do not change signature (function name, parameters)
    public static int binarySearch(int[] data, int target) {
        // Add your solution
        if (data.length == 0) {
            return -1;
        }
        return recursiveSearch(data, 0, data.length - 1, target);
    }

    // helper method
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
        }
        // check right half
        return recursiveSearch(data, mid + 1, end, target);
    }
}

// for smaller arrays, I think that recursion and iteration both perform at similar speeds, but for
// larger arrays, iteration will perform faster. With recursion, the recursive function calls back itself,
// and more memory is used as the function adds itself to a memory stack, but iteration does not require as
// much memory space, and that's why I believe that with larger arrays, iteration is faster.

// credit to https://javarevisited.blogspot.com/2017/04/recursive-binary-search-algorithm-in-java-example.html
// for help with implementing helper method