


// Program to take name and age as input from user and display in proper format

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int age;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the age:");
        age = sc.nextInt();
        
        System.out.println("My name is "+name+" and my age is "+age);
    }
}



// Program to display the mathematical table for any given number

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for table:");
        number = sc.nextInt();
        
        for(int i=1;i<=10;i++)
        {
            System.out.println(number +"X" + i + "=" + number*i);
            //System.out.printf("%d X %d = %d\n", number,i,number*i);
        }
        
    }
}




// Program to take command line arguments as input and display in proper format


public class CLA {
    public static void main(String[] args) {
        
        System.out.println("The total number of arguments passed :"+args.length+ ". The following are the arguments passed:");
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
        
    }
}





// to print your name
public class BCA {

    public static void main(String[] args) {
        System.out.println("James Gosling");
    }
    
}



// to find the sum of first n natural number
import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        
        /* The Scanner class is used to get user input, and it is found in the java.util package. 
         Here, reading the input from standard input
        */
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the nth term");
        int n = sc.nextInt(); 
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum till "+n+"th term is "+sum);
        
    }
    
}




// to print the first n prime number
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        int n = sc.nextInt();
        int initial =2;
        boolean flag;
        for(int i=1;i<=n;)
        {
            flag = true;
            for(int j=2;j<=initial/2;j++)
            {
                if(initial%j==0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                System.out.println(initial);
                i++;
            }
            initial++;
        }
        
    }
    
}



// use of parameterized constructor to initialize the objects
public class Box {
    
    int length;
    int height;
    String color;
    
    Box(int length, int height, String color)
    {
       this.length =length;
       this.height = height;
       this.color =  color;
    }
    
    void display()
    {
        System.out.println("The output is "+ color + " "+ length+ " "+height);
    }
    
   
    public static void main(String[] args) {
       Box b = new Box(12,13,"red");
       b.display();
        
    }
    
}










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




//program to create the string array of size n and take n inputs from the user and replace 'i' with '#'
import java.util.Scanner;

/**
 *
 * @author dikshant
 */

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many names you want to enter:");
        int n = sc.nextInt();
        System.out.printf("Enter %d names\n", n);
        String names[]= new String[n];
        sc.nextLine(); // to resolve the skipping problem
        for(int i=0;i<n;i++)
        {
          names[i]= sc.nextLine();
          names[i]=names[i].replace("b","#");
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}
    

 
// Write a simple program to show the use of method overloading, method overriding and super in the same program.

/**
 *
 * @author dikshant
 */

class Vehicle
{
    String color;

    Vehicle(String color) {
        this.color = color;
    }
    
    void turnOnRadio()
    {
        System.out.println("The radio is turned On inside the vehicle with color "+color);
    }
}

class Car extends Vehicle
{
    Car(String color)
    {
        super(color);  //using super to call the Vehilce class constructor
    }
    
    void turnLight()   // function overloading 
    {
        System.out.println("The light in on!!");
    }
    
    void turnLight(int brightness)    // function overloading
    {
        System.out.println("The light is turned On to brightness "+ brightness+" with color "+color );
    }
    
    @Override
    void turnOnRadio()
    {
        super.turnOnRadio();
        System.out.println("The radio is turned On inside the Car");
    }
}

public class OverloadingOverRidingSuper {
    public static void main(String[] args) {
        Car c1 = new Car("Red");
        c1.turnOnRadio();
        c1.turnLight();
        c1.turnLight(12);
    }
    
}




//program to find the fibonacci series till nth term
import java.util.Scanner;
class HelloWorld {
    
    int fibo(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }
    
    public static void main(String[] args) {
        // System.out.println("Hello, World!"); 
        
        HelloWorld h = new HelloWorld();
        System.out.println("Enter the nth term");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(h.fibo(i));
        }
    }
}




//Q. 13 [2016] [Interface]

//Calculate.java [Interface]
public interface Calculate {
    int add(int x, int y);
    int diff(int x, int y);
    
}

// CalculateDemo.java
class Calulator implements Calculate
{
    @Override
    public int add(int x, int y)
    {
        return x+y;
    }
    
    @Override
    public int diff(int x, int y)
    {
        return x-y;
    }
}
public class CalculateDemo {

    public static void main(String[] args) {
        Calulator c1 = new Calulator();
        System.out.println("The sum is "+c1.add(15,10));
        System.out.println("The difference is "+ c1.diff(15,10));
    }
    
}




// Q. ambigious invocation in Java

//Ans :  Sometimes there may be two or more possible matches for an invocation of a method, but the compiler cannot determine the most specific
// match. This is referred to as ambiguous invocation.
// The informal intuition is that one method is more specific than another if any invocation handled by the first method could be passed on to 
// the other one without a compile-time type error. 

//ambiguous method overloading
class Demo {
    
    double add(int n1,double n2)
    {
        return n1+n2;
    }
    
    double add (double n1, int n2)
    {
        return (n1+n2+10);
    }
    public static void main(String[] args) {
        Demo h1 = new Demo();
        System.out.println(h1.add(2,3));    
    }
}

//ambiguous method overloading in case of vargargs
class Demo {
    
    String add(int... s)
    {
        return "int agrs";
    }
    
    String add (boolean... z)
    {
        return "boolean args";
    }
    public static void main(String[] args) {
        Demo h1 = new Demo();
        System.out.println(h1.add());
    }
}

// Image below is the reference
https://github.com/dikshantgh/Java-I_BIM_III/blob/main/ambiguous_method.png




// Q User defined exception and built-in exception both

package exceptionlab;

import java.util.Scanner;

/**
 *
 * @author dikshant
 */

class MyException extends Exception
{

    public MyException(String msg) {
        super(msg);
    }
    
}

class Bank
{
    int TotalAmount=5000;
    int sendingAmount;
    
    Bank(int sendingAmount)
    {
        this.sendingAmount = sendingAmount;
    }
    
    void trasnfer()
    {
        try{
            if((sendingAmount<100) | (sendingAmount >TotalAmount))
                throw new MyException("sending amount is either less than 100 or greater than your total Balance");
        
        TotalAmount = TotalAmount - sendingAmount;
        System.out.println("Transfer Successful.\nYour Total balance:"+TotalAmount);
        }
        
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
        
        
    }
}
public class ExceptionLab {

    
    public static void main(String[] args) {
        System.out.println("Enter the amount to send");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        try{
            Bank b = new Bank(amount);
            Class.forName("exceptionlab.Bank");
            b.trasnfer();
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("The class name is not valid!!!");
        }
        
    }
    
}



// Q.thread printing 1 to 10 in delay of 5 seconds

    class MyNumber extends Thread
    { 
      @Override
      public void run() 
       { 
         try 
           { 
            for(int i=1;i<=10;i++)  // 50 to 100 and 100 to 200
            { 
              Thread.sleep(5000);          
              System.out.println(i); 
            } 
            } 
           catch(InterruptedException e) 
               { 
                 System.out.println("Exception..."+e); 
               } 
        } 
    } 
     

    public class JavaApplication14
    { 
      public static void main(String [] args) 
       { 
         MyNumber m1 = new MyNumber();  
         MyNumber m2 = new MyNumber();
         m1.start();
         m2.start();
       } 
    } 




import java.util.Scanner;

/**
 * @Title : Write a program to take a string as input from user,
 * if the last character is 'd' then replace all the 'd' with '?' otherwise replace 'd' with '#'
 * @author dikshant
 */
public class StringProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String sen=sc.nextLine();
        if(sen.endsWith("d"))
        {
            sen = sen.replace("d","?");
        }
        else
            sen = sen.replace("d","#");
    
        System.out.println("Output:"+sen);
    }
    
    
}

            


import java.util.Scanner;

/**
 * @Title : Write a program to take a string as input from user and check if the string length is odd , 
 * if so then find the middle character otherwise make it odd and concatenate both the odd and even sized string.
 * @author dikshant
 */
public class StringProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String sen = sc.nextLine();
        int len = sen.length();
        if(len%2!=0)
        {
            System.out.println("The string is odd so the middle character is :"+sen.charAt(len/2));
        }
        else
        {
            String temp = sen;
            sen = sen.concat("t").concat(temp);
            
            System.out.println("The string is even so the string after making it odd and concatenation is:"+sen);
        }
    }
    
    
}




import java.util.Scanner;

/**
 * @Title : Write a program to create a string array of size 10. Ask the user to input 10 animals name 
 * and find the name with the longest length and substitute that animal name in the array with its name 
 * and size.[in the given format cat:3].
 * @author dikshant
 */
public class StringProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animals[] = new String[10];
        int location=0;
        System.out.println("Enter 10 animal names");
        for(int i=0;i<10;i++)
        {
            animals[i]=sc.nextLine();
        }
        String longest_word = animals[0];
        System.out.println("The output:");
        for(int i=0;i<10;i++)
        {
            if(animals[i].length()>longest_word.length())
            {
                longest_word = animals[i];
                location = i;
            }
        }
        animals[location]=longest_word+":"+longest_word.length();
        for(String word: animals)
        {
            System.out.println(word);
        }
    }
    
    
}



/**
 *@title: thread synchronization in java using synchronized method with Runnable interface
 * @author dikshant
 */
public class Sync1 implements Runnable{

    static int total_balance=1000;
    public synchronized void withDraw(String name, int withdraw_balance)
    {
        if(total_balance>=withdraw_balance)
        {
            System.out.println(name +"has withdraw"+withdraw_balance);
            total_balance = total_balance-withdraw_balance;
            System.out.println("Remaining balance:"+total_balance);
        }
        else
        {
            System.out.println(name +"you donot have sufficient balance");
        }
    }
    
    @Override
    public void run()
    {
        
        String name = Thread.currentThread().getName();
        if(name.equals("Ram"))
            withDraw(name, 600);
        else if(name.equals("Shyam"))
            withDraw(name, 700);
        
    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
     
        Sync1 s = new Sync1();
        Thread t1 = new Thread(s);
        Thread t2  = new Thread(s);
        t1.setName("Ram");
        t2.setName("Shyam");
        t1.start();
        t2.start();
        
       
    }
    
}



// to create a new file
import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException {
        File f = new File("human.txt");
        f.createNewFile();
    }
    
}




// to create directory/ folder
import java.io.File;
import java.io.IOException;
 
public class FileMkdir {
    public static void main(String[] args) throws IOException {
        File path = new File("java12/dir");
        File path1 = new File("apple1");
        path.mkdirs();      // it creates java12/dir folder 
        path1.mkdir();      // it create apple1 folder
    }
}




// to display all the files and folder in a given directory

import java.io.File;

public class FileDir {
    public static void main(String[] args) {
        String dirname = "java";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            File[] s = f1.listFiles();
            for (File temp: s) {
                if (temp.isDirectory()) {
                    System.out.println(temp + ": is a directory");
                } else {
                    System.out.println(temp + ": is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a directory");
        }
    }
}







// to display all the files and folders from a given directory and its all sub directory
import java.io.File;

public class RecursiveFolder {
    
     static void check(File temp1)
    {
        
          File[] s = temp1.listFiles();
          for (File temp: s) {
              if (temp.isDirectory()) {
                  System.out.println(temp + ": is a directory");
                  check(temp);
                  
              } else {
                  System.out.println(temp + ": is a file");
              }
          }
    }
    
    public static void main(String[] args) {
      String dirname = "java";
      File f1 = new File(dirname);
      if (f1.isDirectory()) {
          System.out.println("Listing all directory and files of "+dirname+" folder");
          check(f1);
      } else {
          System.out.println(dirname + " is not a directory");
      }
    }
    
}



// to filter files with extension .html

import java.io.File;
import java.io.FilenameFilter;

class ExtOnly implements FilenameFilter {
	String ext;
	public ExtOnly(String ext) {
            this.ext = "." + ext;
	}
        @Override
        // Tests if a specified file should be included in a file list. 
	public boolean accept(File dir,String name) {
            
            return name.endsWith(ext);
	}
}

public class FileFilter {
    public static void main(String[] args) {
            String dirname = "java";
	     File f1 = new File(dirname);
	     FilenameFilter only = new ExtOnly("html");
             // String[] list = dir.list(new FilenameFilter()
	     String[] s = f1.list(only);
            for (String item : s) {
                System.out.println(item);
        }
	}
}




// using FileWriter to write in a file

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class CharacterStreams {
    
    public static void main(String[] args) throws IOException {
        String s;
        Scanner sc = new Scanner(System.in);
        FileWriter writer = new FileWriter("hsm100.txt", true);
        System.out.println("Enter the string you want to write in the file:");   
 
        try{
            s=sc.nextLine();
            writer .write(s);
            System.out.println("File Successfully written");
        }
        
        catch(IOException ex)
        {
            System.out.println("An exception has occured"+ ex);
        }
        finally{
            writer.flush();
            writer.close();
        }

        }
       
    }
   




// to read from a file using FileReader

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderReadingOnly {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       String file_name = "hsm100.txt";
       FileReader reader = new FileReader(file_name);
       int ch; 
       try{
            while((ch = reader.read())!=-1)
            {
                System.out.print((char)ch);
            }
        }
        catch(IOException ex)
        {
            System.out.println("An exceptiion has occured "+ ex);
        }
        
        finally
        {
            reader.close();
        }
                   
    }
    
    
}


// to write and read using BufferedWriter and BufferedReader with FileReader and FileWriter

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UsingBuffered {
    public static void main(String[] args) throws IOException {
        String file_name = "info.txt";
        Scanner sc = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter( new FileWriter(file_name));
        String content;
        System.out.println("Enter the string:");
        try
        {
            content = sc.nextLine();
            writer.write(content);
        }
        catch(IOException ex)
        {
            System.out.println("Exception has occured "+ ex);
        }
        finally
        {
            writer.flush();
            writer.close();
        }
        
        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        int ch;
        try{
            while((ch=reader.read())!=-1)
            {
                System.out.print((char)ch);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            reader.close();
        }
    }
}




// to write and read students information in a file
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class UsingBuffered{
    public static void main(String[] args) throws IOException {
        String file_name = "info.txt";
        Scanner sc = new Scanner(System.in);
        BufferedWriter writer = new BufferedWriter( new FileWriter(file_name));
        String name;
        int age;
        System.out.println("Enter the student detail:");
        
        try
        {
            for(int i=0;i<=2;i++){
            System.out.println("Enter the name and age");
            name = sc.nextLine();
            age=sc.nextInt();
            writer.write(name+"\t"+age+"\n");
            sc.nextLine();
            }
        }
        catch(Exception ex)
        {
            System.out.println("Exception has occured "+ ex);
            ex.printStackTrace();
        }
        finally
        {
            writer.flush();
            writer.close();
        }
        
        BufferedReader reader = new BufferedReader(new FileReader(file_name));
        int ch;
        try{
            while((ch=reader.read())!=-1)
            {
                System.out.print((char)ch);
            }
        }
        catch(IOException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            reader.close();
        }
    }

	



	// to count the total word in a file and also count "this" word in the file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WoedCount {
    public static void main(String[] args) throws IOException 
   {
      File f1=new File("input.txt"); //Creation of File Descriptor for input file
      String[] words=null;    //Intialize the word Array
      int wc=0;     //Intialize word count to zero
      int count=0;
      FileReader fr = new FileReader(f1);    //Creation of File Reader object
      BufferedReader br = new BufferedReader(fr);    //Creation of BufferedReader object
      String s;
      while((s=br.readLine())!=null)    //Reading Content from the file
      {
         words=s.split(" ");   //Split the word using space
         wc=wc+words.length;   //increase the word count for each word
         for(String temp : words)
         {
             if(temp.equals("this"))
                 count++;
         }
      }
      fr.close();
      System.out.println("Number of words in the file:" +wc+ "and house is "+count);    //Print the word count
   }
    
}


	
	
	

// using bytestream to write and read the file

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BytestreamzReadandWrite {
    public static void main(String[] args) throws IOException {
        
        FileOutputStream writer = new FileOutputStream("hsm1.txt");
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the age");
        age = sc.nextInt();
        String Age = Integer.toString(age);
        
        byte b_name [] = name.getBytes();
        byte b_age []= Age.getBytes();
        
        writer.write(b_name);
        writer.write(b_age);
        
        
        writer.flush();
        writer.close();
        
        FileInputStream reader = new FileInputStream("hsm1.txt");
        int ch;
        while((ch=reader.read())!=-1)
        {
            System.out.print((char)ch);
        }
        reader.close();
        
        
        
        
        
    }
    
}

        
	
	
	
	
	// serialize concept in java
// Serialization is a mechanism of converting the state of an object into a byte stream. Deserialization is the reverse process.
// In serialization, everything is taken care of by JVM and the programmer doesn’t have any control. In serialization, it is always
//possible to solve the total object to file, and it is not possible to save part of the object which may create performance problems.
// In Externalizable, everything is taken care of by the programmer and JVM doesn’t have any control. 
	
import java.io.*;

class MyClass implements Serializable {
    String s;
    int i;
    double d;
    
    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
}
    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
}
}

public class Serializezzz {
    public static void main(String[] args) {
        // Object serialization
        try ( ObjectOutputStream objOStrm =
        new ObjectOutputStream(new FileOutputStream("serial.txt")) )
        {
            MyClass object1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);
            }
            catch(IOException e) {
                System.out.println("Exception during serialization: " + e);
            }
            // Object deserialization
            try ( ObjectInputStream objIStrm =
                new ObjectInputStream(new FileInputStream("serial.txt")) )
            {
                MyClass object2 = (MyClass)objIStrm.readObject();
                System.out.println("object2: " + object2);
            }
            catch(Exception e) {
                System.out.println("Exception during deserialization: " + e);
            }
}
}


	
	
	
            

// Q. how to achieve multiple inheritance in java

//Ans : Multiple inheritance in Java can be achieved using interface. Either a class implements multiple interfaces or an interface itself extends multiple interfaces



            
            
            
            

	
	
	// 2022 question Product class
	
class Product
{
    String name;
    int qty;
    int price;
    
    Product(String name, int qty, int price)
    {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    
    String getName()
    {
       return name; 
    }
    
    int getQty()
    {
        return qty;
    }
    
    int getPrice()
    {
        return price;
    }
    
    int getTotal()
    {
        return getQty() * getPrice();
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product("pen", 10, 20);
        Product p2 = new Product("book", 200, 200);
     
     
        System.out.println("The price of p1 :"+p1.getTotal() );
        System.out.println("The price of p2 :"+ p2.getTotal());
    }
    
}

	
	
	
	
	// second largest
	
import java.util.Scanner;

public class JavaApplication42 {

    public static void main(String[] args) {
        
        int a[] = new int[5];
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integer values:");
        for(int i=0;i<5;i++)
        {
            a[i]= sc.nextInt();
        }
               
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] =a[j];
                    a[j] = temp;
                }
            }
        }
        int size = 5-2;
        System.out.println("The second largest is"+a[size]);
    }
    
}

	
	
	
	// user defined exception 2022
	
class NotEligibleException extends Exception
{

    NotEligibleException(String msg) {
        super(msg);
    }
    
}

class Person {
    
    int age;
    String name;
    
    Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    
    void check()
    {
        try{
        if(age<1 | age>100)
        {
            throw new NotEligibleException("Your age is not legal!!");
        }
        System.out.println("Your age is legal");
        }
        catch(NotEligibleException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        
        Person v = new Person(200,"ram");
        v.check();
        
        
    }
    
}
	
	
