public class problem6 {
    public static int calculatePowerOf(int a, int n){
        if(n == 0){
            return 1;
        }
        else{
            return calculatePowerOf(a, n-1) * a;
        }
    }
}
