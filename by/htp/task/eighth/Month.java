import java.util.Scanner;
public class Month{
public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the month name starting with uppercase symbol");
	String month = sc.nextLine();

	if (month.equals("December")||month.equals("January")||month.equals("February")){
	System.out.println ("This is winter");
	}

	else if (month.equals("March")||month.equals("April")||month.equals("May")){
	System.out.println ("This is Spring");
	}
	
	else if (month.equals("June")||month.equals("July")||month.equals("August")){
	System.out.println ("This is Summer");
	}

	else if (month.equals("September")||month.equals("October")||month.equals("November")){
	System.out.println ("This is Autumn");
	}

	else{
	System.out.println ("Entered sring is incorrect");
	}
	
}
}