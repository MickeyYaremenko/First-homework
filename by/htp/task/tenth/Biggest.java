public class Biggest{
public static void main (String[] args){
	int x,y,z;
	x = (int) (Math.random()*100);
	y = (int) (Math.random()*100);
	z = (int) (Math.random()*100);
	if (x>y&&x>z){
	System.out.println("The biggest numbers is "+x);
	}
	else if (y>x&&y>z){
	System.out.println("The biggest numbers is "+y);
	}
	else {
	System.out.println("The biggest numbers is "+z);
	}

	System.out.println("Numbers are: "+"x="+x+" y="+y+" z="+z);
}
}