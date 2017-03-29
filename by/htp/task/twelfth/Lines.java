import java.util.Scanner;
public class Lines{
public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the some text line");
	String str = sc.nextLine();

	while (!str.equals("stop")){
	System.out.println("Enter another line");
	str = sc.nextLine();
	}

	System.out.println("Well done!");
	
}
}