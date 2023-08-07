// Time Complexity: O(n)
// Space Complexity: O(1)
public class Missing {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 6, 5, 8, 7};
        int n = arr.length;
        // Time complexity sum_natural_nums = O(1)
        int sum_natural_nums = ((n+1) * (n+2))/2;
        int sum = 0;
        // Time complexity to get sum of current array elements = O(n)
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        int missing_num = sum_natural_nums - sum;
        System.out.println("Missing number in an array is: "+missing_num);
    }
}