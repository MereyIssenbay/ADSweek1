# Assignment documentation 
<br/><br/>
**Problem 1**: Return minimun from array with n elements.
<br/><br/>
**Solution**:
```java
public class problem1 {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        else{
            return Math.min(arr[n-1], findMin(arr, n-1));
        }
    }
} 
```

Here the function "findMin" accepts the array "arr" and number of it's elements "n".
The "findMin" function uses recursion to find the minimum value in the array. If the length of the array is 1, 
the function simply returns the value at index 0. Otherwise, it compares the value at index "n-1" to the minimum value 
found in the rest of the array, and returns the smaller of the two.




**Problem 2**: Return average value of array
<br/><br/>
**Solution**:
```java
public class problem2 {
    public static float findAvg(int[] arr, int n) {
        float avg = 0;
        for(int i = 0; i < n;i++){
            avg = avg + arr[i];
        }
        return avg/n;
    }
}
```

Here the function "findAvg" accepts the array "arr" and number of it's elements "n".
The "findAvg" function calculates the average value of the array by first initializing a variable called "avg" to 0, 
and then using a for loop to iterate over the elements of the array and add them to the "avg" variable. Finally,
the function returns the value of "avg" divided by "n".




**Problem 3**: Check a number for a prime
<br/><br/>
**Solution**:
```java
public class problem3 {
    public static boolean findIsPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
```


Here the function "findIsPrime" accepts the integer value "n" wich represents the number that we need to check.
The "findIsPrime" function uses a for loop to iterate over all integers between 2 and the square root of "n". If "n" is divisible by any integer in this range, the function returns false. Otherwise, the function returns true.




**Problem 4**: Return factorial of number
<br/><br/>
**Solution**:
```java
public class problem4 {
    public static int findFactorial(int n){
        if(n == 0){
            return 1;
        }
        else{
            return n * findFactorial(n-1);
        }
    }
}
```


Here the function "findFactorial" accepts the integer value "n" wich represents the number wich factorial we need to calculate.
If "n" is 0, the function returns 1. Otherwise, the function returns the product of "n" and the factorial of "n-1" calculated recursively by calling the "findFactorial" function with argument "n-1".




**Problem 5**: Return the number on n-th term of fibonacci sequence
<br/><br/>
**Solution**:
```java
public class problem5 {
    public static int findFibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return findFibonacci(n-1)+findFibonacci(n-2);
        }
    }
}
```


Here the function "findFibonacci" accepts the integer value "n" wich represents the n-th term of fibonacci sequence.
If "n" is 0, the function returns 0. If "n" is 1, the function returns 1. Otherwise, the function returns the sum of the (n-1)-th Fibonacci number and the (n-2)-th Fibonacci number calculated recursively by calling the "findFibonacci" function with argument "n-1" and "n-2", respectively.




**Problem 6**: Return number a in power of n
<br/><br/>
**Solution**:
```java
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
```


Here the function "calculatePowerOf" accepts the integer value "a" and integer value "n" which represents base and power respectively.
If n is 0, the function returns 1. Otherwise, the function calls itself with a and n-1 as arguments and multiplies the result with a. 
This process is repeated recursively until n becomes 0, and the final result is returned.




**Problem 7**: Return number a in power of n
<br/><br/>
**Solution**:
```java
import java.util.Scanner;
public class problem7 {
    public static void reverse(int n, Scanner sc) {
        if (n <= 0) {
            return;
        }
        String element = sc.next();
        reverse(n - 1, sc);
        System.out.print(element + " ");
    }
}
```


Here the function "reverse" accepts the integer value "n" and Scanner object "sc" which represents base and power respectively.
The function works by using recursion to call itself repeatedly, decrementing "n" with each recursive call until it reaches zero. 
On each recursive call, it reads an integer from the input using the Scanner object "sc", then prints the integer followed by a space.
Since the recursive calls are made before the integers are printed, the output will be in reverse order.




**Problem 8**: Check is given string full of digits
<br/><br/>
**Solution**:
```java
public class problem8 {
    public static boolean isFullDigit(String s){
        if(s.isEmpty()){
            return true;
        } else{
            boolean check = (s.charAt(s.length()-1) >= 48 && s.charAt(s.length()-1) <= 57);
            boolean rest = isFullDigit(s.substring(0,s.length()-1));

            return check && rest;
        }
    }
}
```


Here the function "isFullDigit" accepts the String value "s" and recursively checks if the last character in the string is a digit using ASCII codes and whether the rest of the string is also composed of digits. If both conditions are true, then it returns true, else it returns false. The recursion is used to check each character in the string one by one, starting from the end.




**Problem 9**: Return binomial coefficient of "n" and "k"
<br/><br/>
**Solution**:
```java
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
```


Here the function "calculate" accepts the integer values "n" and "k".The recursive algorithm works by breaking down the problem into smaller sub-problems, which are then solved recursively until they reach the base case. The base case is when either k or (n-k) equals 0 or n, in which case the result is 1. The recursive step involves calculating the sum of the binomial coefficients of the previous row in Pascal's triangle, which corresponds to calculating C(n-1,k-1) and C(n-1,k) and adding them together.





**Problem 10**: Return GCD of "n" and "k"
<br/><br/>
**Solution**:
```java
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
```


Here the function "findGCD" accepts the integer values "n" and "k".The "findGCD" method uses the Euclidean algorithm to recursively find the GCD. The algorithm states that the GCD of two integers "n" and "k" is equal to the GCD of "k" and the remainder of "n/k". The method first checks if "k" is zero, which means that "n" is the GCD of the two numbers. If "k" is not zero, the method calls itself with the arguments "k" and "n%k".
