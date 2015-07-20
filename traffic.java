package p3count;
import java.util.Scanner;
public class traffic {
	public static void main(String arg[]){
		System.out.println("Hi there, which road would you like to use today?\n1:Ngong Road\n2 Waiyaki Way\n3:Mombasa road\n4:Mbagathi way\n5:Jogoo Road");
	Scanner num = new Scanner(System.in);
	System.out.println("Please enter road number:");
    int x = num.nextInt();
   /* if( x > 5){
    	System.out.println("Invalid number:)");	
    }
    else{*/
    	if(x == 1){
    		System.out.println("There's traffic on Ngong' road:(, you can pass through ....");
    	}else if(x == 2){
    		System.out.println("There's no traffic on Waiyaki way , safe journey :)");
    	}else if(x ==3){
    		System.out.println("There's traffic on Mombasa Road :(, you can pass through ....");
    	}else if(x == 4){
    		System.out.println("There's no traffic on Mbagathi way , safe journey :)");
    }else if(x == 5){
		System.out.println("There's traffic on Jogoo Road :(, you can pass through ....");
       }
	}
	}

