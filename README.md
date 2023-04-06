# Assignment documentation 
<br/><br/>
**Problem 1**: Here we need to find minimun from array with n elements.
<br/><br/>
**Solution**:
````java
import java.util.Scanner;
public class problem1 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give a number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum: ");
        System.out.println(findMin(arr, n));
    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else{
            return Math.min(arr[n-1], findMin(arr, n-1));
        }
    }
} 

Here the function "findMin" accepts the array "arr" and number of it's elements "n".
The "findMin" function uses recursion to find the minimum value in the array. If the length of the array is 1, 
the function simply returns the value at index 0. Otherwise, it compares the value at index "n-1" to the minimum value 
found in the rest of the array, and returns the smaller of the two.
