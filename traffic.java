package p3count;
import java.util.Scanner;
public class traffic {
	public static void main(String arg[]){
		System.out.println("Hey my name is autotraffic3000, and i can serve you with information about the traffic status in NBI.\nEnter 1:Roads with or without traffic\nEnter 2:specific roads");{
		Scanner ans = new Scanner(System.in);
		int jibu = ans.nextInt();
		if(jibu == 1){
			System.out.println("Enter 1 to check roads with traffic\nEnter 2 to check roads without traffic");
			Scanner tr = new Scanner(System.in);
			int w = tr.nextInt();
			if(w == 1){
				System.out.println("Roads with traffic are:\nNgong' road\nMombasa road\nJogoo road");
			}
			else if(w == 2){
				System.out.println("Roads without traffic are:\nWaiyaki way\nMbagathi way");
			}
		
		
		
		}
		else{
		
		System.out.println("Which road would you like to use?\n1:Ngong Road\n2 Waiyaki Way\n3:Mombasa road\n4:Mbagathi way\n5:Jogoo Road");
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
	}}
}