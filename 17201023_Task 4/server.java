package task4;

import java.io.*;
import java.net.*;
import java.util.Date;

public class server{
  public static void main(String[]args){
    try{
  while(true) {
       ServerSocket ss = new ServerSocket(7777);
       System.out.println("Server running at port = 7777");
       Socket socket = ss.accept();
       
       ServerThread serverThread = new ServerThread(socket);
       
       serverThread.start();
       
       ss.close();
     }
  
    }catch(Exception e){System.out.println(e);}
  }
}
