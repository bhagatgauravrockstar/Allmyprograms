import java.util.Scanner;
public class Array1{
	
	public static void main(String[] args){
	
	int[] x = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 5 numbers");
	for(int i=0;i<5;i++){
		x[i]= sc.nextInt();
	}
	//short hand for loop or foreach loop(works only in forward direction)
	for(int element:x){
		System.out.println(element);
	}  
	
	
	}
}