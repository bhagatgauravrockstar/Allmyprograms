public class Prime{
	
	public static void main(String[]args){
		
		
		for(int i=1;i<=100;i++){
			int x=0;
			for(int j=2;j<=i-1;j++)
				if(i%j==0){
					x=x+1;
				}
					
		if(x==0)
			System.out.print(i+",");
		}
		
	}
}