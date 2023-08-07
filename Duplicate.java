// Time Complexity: O(n^2)
// Space Complexity: O(1)
public class Duplicate {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 3, 4, 5};
        int n = arr.length;
        // Time Complexity: O(n^2)
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate Elements: "+arr[i]);
                }
            }
        }
    }
}
