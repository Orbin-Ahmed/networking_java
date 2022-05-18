package task4;
import java.io.*;
import java.net.*;
import java.util.*;


public class client{
  public static void main(String[]args){
    try{
      Socket s = new Socket("localhost",7777);
     InputStreamReader input = new InputStreamReader(new DataInputStream(s.getInputStream()));
     BufferedReader reader = new BufferedReader(input);
     
     DataOutputStream output = new DataOutputStream(s.getOutputStream());
     PrintWriter writer = new PrintWriter(output, true);
     
     Scanner sc = new Scanner(System.in);
     
     while (true) {
      System.out.println("Chose Option 1 : addition, Option 2 : subtraction, Option 3 : multiplication");
      String in = sc.nextLine();
      System.out.println("Enter number a");
      int a = sc.nextInt();
      System.out.println("Enter number b");
      int b = sc.nextInt();
      if(in.equalsIgnoreCase("1")) {
       System.out.println(a+b);
      }
      else if(in.equalsIgnoreCase("2")){
       System.out.println(a-b);
      }
      else if (in.equalsIgnoreCase("3")){
       System.out.println(a*b);
      }
      else
      break;
     }  
    
 
     s.close();
     
    }catch(Exception e){System.out.println(e);}
  }
}