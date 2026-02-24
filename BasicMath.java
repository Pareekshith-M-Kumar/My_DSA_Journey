import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DigitExtraction{
    public void Extract(Scanner sc){
        int n,count = 0;
        System.out.println("Enter number:- ");
        n=sc.nextInt();
        while(n>0){
            int lastdigit=n%10;
            count=count+1;
            System.out.println("The digits are:- "+lastdigit);
            n=n/10;
        }
        System.out.println("The total numbers are:- "+count);
    }
}

class Revnum{
    public void reverse(Scanner sc){
        int n;
        int revNum=0;
        System.out.println("Enter number:- ");
        n=sc.nextInt();
        while(n>0){
            int lastdigit=n%10;
            revNum=(revNum*10)+lastdigit;
            n=n/10;
        }
        System.out.println("The reverse numbers are:- "+revNum);
    }
}

class PalinNum{
    public void Palindrome(Scanner sc){
         int n;
        int revNum=0;
        System.out.println("Enter number:- ");
        n=sc.nextInt();
        int dup=n;
        while(n>0){
            int lastdigit=n%10;
            revNum=(revNum*10)+lastdigit;
            n=n/10;
        }
        if(dup==revNum){
            System.out.println("True palindrome");
        }else{
            System.out.println("False palindrome");
        }
    }
}

class ArmsNum{
    public static boolean Armstrong(Scanner sc){
        System.out.println("Enter number:- ");
        int num=sc.nextInt(); //take input
        int sum=0;
        int n=num; //store original number
        int k=String.valueOf(num).length(); //count num of digits

        while(n>0){
            int lastdigit=n%10;
            sum+=Math.pow(lastdigit, k);
            n=n/10;
        }
        return sum==num; //if sum == num it is armstrong
    }
}

class Divisor{
    public List<Integer> getDivisors(Scanner sc){
        List<Integer> res=new ArrayList<>();

        System.out.println("Enter the num:- ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                res.add(i);
            }
        }
        return res;
    }
}

class CheckPrime{
    public boolean prime(Scanner sc){
        int cnt=0;
        System.out.println("Enter the num:- ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        return cnt==2;
    }
}

class GCD{
    public int findGcd(Scanner sc){
        System.out.println("Enter the n1:- ");
        int n1=sc.nextInt();
        System.out.println("Enter the n2:- ");
        int n2=sc.nextInt();

        for(int i=Math.min(n1, n2);i>0;i--){
            if(n1%i==0 && n2%i==0){
                System.out.println("GCD of "+n1+" and "+n2+" is "+i);
            }
        }
        return 1;

    }
}
public class BasicMath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to 7:- ");
        int n=sc.nextInt();

        switch (n) {
            case 1:
                DigitExtraction de=new DigitExtraction();
                de.Extract(sc);
                break;
            case 2:
                Revnum re=new Revnum();
                re.reverse(sc);
                break;
            case 3:
                PalinNum pl=new PalinNum();
                pl.Palindrome(sc);
                break;
            case 4:
                ArmsNum ar=new ArmsNum();
                if(ar.Armstrong(sc)){
                    System.out.println("It is an Armstrong number");
                }else{
                    System.out.println("It is not Armstrong number");
                }
                break;
            case 5:
                Divisor Div=new Divisor();
                List<Integer> result = Div.getDivisors(sc);
                System.out.println("Divisors are");
                for(int x:result){
                    System.out.print(x+" ");
                }
                System.out.println();
                break;
            case 6:
                CheckPrime cp=new CheckPrime();
                boolean isPrime=cp.prime(sc);
                if(isPrime){
                    System.out.println("is prime num");
                }else{
                    System.out.println("Is not prime num");
                }
                break;
            case 7:
                GCD gc=new GCD();
                gc.findGcd(sc);
                break;
            default:System.out.println("Invalid input");
                break;
        }
        sc.close();
    }
}
