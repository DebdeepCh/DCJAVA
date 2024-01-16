import java.util.*;


public class alternateSumSeries {
    public static int alternateSumFind(int num){
        if(num==0){
            return 0;
        }
         
        if (num %2 ==0){
            return alternateSumFind(num-1)- num;

        }
        else{
            return alternateSumFind(num-1)+ num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();

        int result = alternateSumFind(num);
        System.out.println("The alternate sum series is" + result);
    }
}
