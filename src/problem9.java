public class problem9 {
    public static int calculate(int n, int k){
        if(k == 0 || n == k){
            return 1;
        }
        else if(k == 1 || k == n-1){
            return n;
        }
        else{
            return calculate(n-1, k-1) + calculate(n-1, k);
        }
    }
}