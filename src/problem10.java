public class problem10 {
    public static int findGCD(int n, int k){
        if(k == 0){
            return n;
        }
        else{
            return findGCD(k, n%k);
        }
    }
}
