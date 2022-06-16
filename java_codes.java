
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




// TO print all the prime number within a given range

import java.util.Scanner;
class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do{
        System.out.println("Enter the starting and ending rangegreater than 1:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        }while(n1<2 | n2<2);
        boolean flag;
        for(int i=n1;i<=n2;i++)
        {
            flag =true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag =false;
                    break;
                }
            }
            if(flag)
                System.out.println(i+"\t");
        }
    }
}




// Method overloading example
//Method Overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different.
//Argument list are different in:
//1. By changing the number of parameters.
//2. By changing the data type of parameters.

class Box
{
   
   void volume(int l, int b, int h)
   {
       System.out.println("The volume of rectangle is "+ (l*b*h));
   }
   void volume(int l) //method overloading
   {
       System.out.println("The volume of square is "+ (l*l*l));
   }
}
public class BoxDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box b = new Box();
        b.volume(10,5,20); 
        b.volume(5);
    }
    
}




// to take two words as an input from user and display the longest word.

import java.util.Scanner;

/**
 *
 * @author dikshant
 */
public class LongestString {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter two words:");
       String word1 = sc.next();
       String word2 = sc.next();
       
       if(word1.length() > word2.length())
       {
           System.out.println("The longest is "+ word1);
       }
       else if(word1.length() < word2.length())
       {
            System.out.println("The longest is "+ word2);
       }
       else
       {
           System.out.println("Both are of same length");
       }
    }
    
}




//Q.3 [2021]
/**
 *
 * @author dikshant
 */
class Member
{
    String name, address;
    int age, salary, phone;
    
    void setMemberDetails(String name, String address, int age, int phone, int salary)
    {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }
    void printMemberDetails()
    {
        System.out.printf("\nThe name is %s\nThe address is %s\nThe age is "
                    + "%d\nThe phone is %d\nThe salary is %d",name,address, age,phone,salary);     
    }
}

class Manager extends Member
{
    String department;
    
    void setDepartment(String department)
    {
        this.department = department;
    }
    void printDepartment()
    {
        System.out.println("\nThe department is "+ department);
    }
}

class Employee extends Member
{
    String specialization;
    void setSpecialization(String specialization)
    {
        this.specialization = specialization;
    }
    void printSpecialization()
    {
        System.out.println("\nThe specialization is "+ specialization);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Manager m1 = new Manager();
        e1.setMemberDetails("Ram", "Kathmandu", 35, 551135, 80000);
        m1.setMemberDetails("Hari", "Hetauda", 28, 551136, 90000);
        e1.printMemberDetails();
        m1.printMemberDetails();
        e1.setSpecialization("Java Programming");
        e1.printSpecialization();
        m1.setDepartment("IT");
        m1.printDepartment();
        
        
    }
    
}




