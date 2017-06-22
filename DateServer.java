import java.net.*;
import java.io.*;
import java.util.Scanner;
public class DateServer
{
public static void main(String[] ay)
{
try{
	ServerSocket sock =new ServerSocket(6013);
	boolean op=true;
	String str;
	Scanner input =new Scanner(System.in);
        System.out.print("Waiting for client.....\n");
        Socket client =sock.accept();
        System.out.print("Connected...  waiting for request..\n");
        PrintWriter pout =new PrintWriter(client.getOutputStream(),true);
	InputStream in;
        BufferedReader nib;
	while(op){
		//op=false;
                //requests
		//do{
                    in = client.getInputStream();
		    nib = new BufferedReader(new InputStreamReader(in));
		    str=nib.readLine();
	            System.out.print("server : "+str);
                   
		//client.close();
                //service
		System.out.print("me : ");
		str=input.nextLine();
		pout.println(str);
		}
   }
catch(IOException ioe)
{
System.err.println(ioe);
}
}
}
