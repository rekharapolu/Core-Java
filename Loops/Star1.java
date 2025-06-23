public class Star1{
	public static void main(String[] args){


		/*for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i+j<=6){
					System.out.print("*");
				}else{
					System.out.print(" ");
				 }
			}*/
			
		int star=6;
		for(int i=1;i<=5;i++){
		star--;
		for(int j=1;j<=star;j++){
			System.out.print("*");
		}

		System.out.println();
		}
	}
}
