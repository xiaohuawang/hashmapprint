package hashmapprint;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
public class Hashmap1 {


	
	public static void main(String args[]) throws Exception
	{
		File fp=new File("c:\\a.txt");
		PrintWriter pfp= new PrintWriter(fp);
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		 map.put( 10, "ten" );
		 map.put( 9, "nine" );
		 map.put( 8, "eight" );
		 map.put( 7, "seven" );
		 map.put( 6, "six" );
		 
	     System.out.println("Would you like to try again? y/n");
	     String f="Would you like to try again? y/n";
	    
		 Scanner sc=new Scanner(System.in);
		 String a=sc.nextLine();
		 while (a.equals("y"))
		 {
		 
			 System.out.println("Enter a number");
			 int b=sc.nextInt();
			 
			 pfp.print(b);
			 
			 if(b!=10&&b!=9&&b!=8&&b!=7&&b!=6)
			 { //System.out.println("woshigou");
			System.out.print("it doesn't exist,import word ");
			Scanner ma=new Scanner(System.in);
			String c=ma.nextLine();	 
			 map.put(b,c);
			 }
			 
			 String t=map.get(b);
			 pfp.print(t);
			
			 System.out.println(map.get(b));
			 
			 
			 System.out.println("Would you like to try again? y/n");
			 Scanner mm=new Scanner(System.in);
			 a=mm.nextLine();
			 if(a.equals("n"))
				 break;
			 
		     }
		    System.out.println( "map = " + map );
		   
		   
		    
		    
		    pfp.close();
	 }
}		    
		
		
		
		
	//File fp=new File("c:\\a.txt");
	//String str="ABCDE";
	//PrintWriter pfp= new PrintWriter(fp);
	//pfp.print(str);
	//pfp.close();