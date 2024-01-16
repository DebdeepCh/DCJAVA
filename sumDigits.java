public class sumDigits {
    // function definition
    public static int sumOfDigits(int num){
        //1.Base case condition
        if (num == 0){
            return 0;
        }

        // Recursive Function Call
        return (num % 10)+ sumOfDigits(num/10);
    }
    // Driver Code
    public static void main(String[]args) {
        int num = 12345;
        int result= sumOfDigits(num);
        System.out.println("sum of the digits is:" + result);
    }
    
}



