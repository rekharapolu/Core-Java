public class Pattern6{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=9; j++){
				if(i==j){
					System.out.print("*");
				}else if(i==1 && j==9){
					System.out.print("*");
				 }else if(i==2 && j==8){
					System.out.print("*");
				 }else if(i==3 && j==7){
					System.out.print("*");
				 }else if(i==4 && j==6){
					System.out.print("*");
				 }else{
					System.out.print(" ");
				 }
			}
			System.out.println();
		}


	}
}