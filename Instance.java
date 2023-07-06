public class Instance{
	
   	int x = 10;
   	int y = 5;
	
	public static void main(String[] args){
		Instance f1 = new Instance();
		Instance f2 = new Instance();
		f1.x = f2.y+10;
		f2.y = f1.x+5;
		
		System.out.println(f2.y);
		
		
		
	}
}
	