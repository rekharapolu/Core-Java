public class Right_Arrow{
	public static void main(String[] args){
		int star=0;
		for(int i=1;i<=7;i++){
		if(i>=3 && i<=5){
		for(int j=1;j<=4;j++){
			System.out.print("*");
		}
		}else{
		      for(int j=1;j<=4;j++){
					     System.out.print(" ");
			}
		 }
		if(i<=4){
			star++;
			}else{
			     star--;
			     }

		for(int j=1;j<=star;j++){
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
