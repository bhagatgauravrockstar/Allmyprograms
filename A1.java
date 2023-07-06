public class A1{
	
	public static void main(String[] args){
		//find the count of dupicate numbers
		int[] x = {11,13,15,11,45,45,13,18,32,15};
		//int count=0;
		for(int i=0;i<x.length;i++){
			for(int j=i+1;j<x.length;j++){
			if(x[i]==x[j]){
			//	count=count+1;
		System.out.println(x[i]);
			}
			}
		}
		
	}
}