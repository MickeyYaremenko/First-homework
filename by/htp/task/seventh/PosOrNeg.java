import java.util.Scanner;
public class PosOrNeg{
public static void main (String[] args){
	int x;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	x = sc.nextInt();

	if (x < 0){
	System.out.println ("This number is negative");
	}

	else {
	System.out.println("This number is positive");
	}

}
}