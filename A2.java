public class A2{
	
	public static void main(String[] args){
		//find the second largest number
		
		int[] x = {23,11,45,12,19,46,15,49};
		int max = x[0];
		for(int i=0; i<x.length; i++){
			for (int j=i+1; j<x.length; j++){
				if (x[i]>max){
					max=x[i];
				}
				if(x[j]<max && x[i]>x[j]){
				System.out.println(x[i]);
				}
			}	
		}
		//System.out.println(max);
	}
}