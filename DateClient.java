import java.net.*;
import java.io.*;
import java.util.Scanner;
public class DateClient
{
public static void main(String[] ay)
{
try{
Socket server =new Socket("127.0.0.1",6013);
String line;
System.out.print("Connected to server.....\n");
Scanner input =new Scanner(System.in);
PrintWriter pout =new PrintWriter(server.getOutputStream(),true);
InputStream in;
BufferedReader nib;
while(true){
	//send
	System.out.print("me : ");
	line=input.nextLine();
	pout.println(line);
 
       //response 
       // do{
            in = server.getInputStream();
            nib = new BufferedReader(new InputStreamReader(in));
               line=nib.readLine();
               System.out.print("server : "+line);
              
//sock.close();
	}
}
catch(IOException ioe)
{
System.err.println(ioe);
}
}
}
