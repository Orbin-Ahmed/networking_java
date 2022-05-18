package task2;

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
       
       
       InputStreamReader input = new InputStreamReader(new DataInputStream(socket.getInputStream()));
       BufferedReader reader = new BufferedReader(input);
       
       DataOutputStream output = new DataOutputStream(socket.getOutputStream());
       PrintWriter writer = new PrintWriter(output, true);
       
       while(true) {
    	   String client_response = reader.readLine();
    	   if(client_response.equalsIgnoreCase("end game")) {
    		   writer.println("goodbye");
    		   break;
    	   }
    	   else
    		   writer.println(client_response);
       }
       
       ss.close();
     }
    }catch(Exception e){System.out.println(e);}
  }
}
