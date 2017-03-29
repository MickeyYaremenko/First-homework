import java.util.Scanner;
public class Symbol{
public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the symbol");
	char symbol = sc.nextLine().charAt(0);

	while (symbol != 'q'){
	System.out.println("Enter another symbol");
	symbol = sc.nextLine().charAt(0);
	}

	System.out.println("Well done!");
	
}
}