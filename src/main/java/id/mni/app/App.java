package id.mni.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
       GenerateUniqueString generateUniqueString = new GenerateUniqueString();
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       if(x > 1) {
    	   generateUniqueString.writeCharacter(x);
       }
       scan.close();
       System.out.println( "Hello World!" );
    }
    
    
}


