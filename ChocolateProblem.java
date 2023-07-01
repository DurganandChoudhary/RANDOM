import java.util.Arrays;

class ChocolateProblem {

    // arr[0..n-1] represents sizes of
    // packets. m is number of students.
    // Returns minimum difference between
    // maximum and minimum values of
    // distribution.
    static int findMinDiff(int arr[], int n, int m)     // if there are no chocolates or
        // number of students is 0
        if (m == 0 || n == 0)
            return 0;


        Arrays.sort(arr);


        // more than number of packets
        if (n < m)
            return -1;


        int min_diff = Integer.MAX_VALUE;


        // such that difference between
        // last (maximum in case of
        // sorted) and first (minimum in
        // case of sorted) elements of
        // subarray is minimum.


            int diff = arr[i + m - 1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }


    public static void main(String[] args) {
        int arr[] = { 12, 4, 7, 9, 2, 23,  
        int m = 7; // Number f  ud ts 
                

        System.out.println("Minimum diff

        
                