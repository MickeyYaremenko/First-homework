import java.util.Scanner;
public class DiagSum{
public static void main (String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter array length");
	int val = sc.nextInt();
	int [][] arr = new int [val][val];
	
	for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
		System.out.println("Enter array element");
		arr[i][j] = sc.nextInt();
                
            }
            System.out.println();
        }

	for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	
	int sum = 0;

	for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
		if (i==j){
		sum = sum+arr[i][j];
                }
            }
            
        }
	System.out.println(sum);
	
}
}