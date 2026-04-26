import java.util.Arrays;
import java.util.Scanner;

//normal recursion
class rec1 {
    public void func(int i,int n){
        if(i>n){
            return;
        }else{
            System.out.println("answer: " +i);
            func(i+1, n);
        }
    }  
}
//recursion using backtrack
class rec2{
    public void func(int i,int n){
        if(i==0){
            return;
        }else{
            func(i-1,n);
            System.out.println("answer from backtrack: "+i);
        }
    }
}
//parameterised Way
class rec3{
    public void fucn(int n,int sum){
        if(n<1){
            System.out.println("parameterized: "+sum);
            return;
        }else{
            fucn(n-1, sum+n);
        }
    }
}
//functional way
class rec4{
    public int func(int n){
        if(n==0){
            return 0;
        }else{
            return n+func(n-1);
        }
    }
}
//reverse an array
class rec5{
    public void func(int[] arr, int t, int r) {
        if (t >= r) {
            return;
        }else{
        // swap
        int temp = arr[t];
        arr[t] = arr[r];
        arr[r] = temp;
        func(arr, t + 1, r - 1);
        }
    }
}
//check palindrome
class rec6{
    public boolean func(String str, int i) {
        int n = str.length();
        if (i >= n / 2) 
            return true;
        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        }else{
        return func(str, i + 1);
        }
    }
}
//fibonacci
class rec7{
    public int func(int n){
        if(n<=1){
            return n;
        }else{
            return func(n-1)+func(n-2);
        }
    }
}
public class recursive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //we can use spring to handle our classes using @component and @autowired but this is only to understand dsa and how it works so not implementing spring and it will be used in projects
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        //normal recursion
        rec1 r1=new rec1();
        r1.func(1,n); 
        //backtrack
        rec2 r2=new rec2();
        r2.func(n,n);
        //parameterized
        rec3 r3=new rec3();
        r3.fucn(n, 0);
        //functional
        rec4 r4=new rec4();
        System.out.println(r4.func(n));
        //reverse of array
        int arr[]={1,2,3,4,5};
        rec5 r5=new rec5();
        r5.func(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr)); //without convertion we may get output has [I@15db9742].
        // palindrome
        System.out.println("Enter a string: ");
        String str=sc.next();
        rec6 r6=new rec6();
        if(r6.func(str, 0)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }
        //fibonacci
        rec7 r7=new rec7();
        System.out.println(r7.func(n));
        //time complexity=O(2^n) i am aware of this and using dynamic programming we can get time complexity to O(n)
    }
}
