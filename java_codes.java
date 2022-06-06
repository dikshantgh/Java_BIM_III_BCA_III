
//To find the factorial of a number using recursive function

class Fact
{
//     static int a;
    int factorial(int n){
        if (n==0||n==1)
            return 1;
        return n * factorial(n-1);
    }
    
}

public class FactorialMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fact f1 = new Fact();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
                    
        int n = sc.nextInt();
        System.out.printf("The factorial of number %d is %d",n, f1.factorial(n));
        
    }
    
}
