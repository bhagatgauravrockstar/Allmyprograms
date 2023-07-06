public class Abc{
	
	public static void main(String []args){
		
		for(int line=97;line<=100;line++){
			for(char a=97;a<=line;a++){
				for(int space=98;space<=line;space++){
					System.out.print(" ");
					
				}
				
				if(a<=line){
					System.out.print(a);
				}else{
					
					System.out.print(" ");
				}
				
				
			}
			    System.out.println(" ");  
	    }	
	}	 
}