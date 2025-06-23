public class Special_Char{
	public static void main(String[] args){
		int space=-1,value=7;
		for(int i=1;i<=3;i++){
			space++;
			value-=2; 
			for(int j=1;j<=space;j++){
					System.out.print(" ");
			}
			for(int j=1;j<=value;j++){
				if(i==1) System.out.print("$");
				else if(i==2) System.out.print("#");
				else System.out.print("?");
			}
		System.out.println();
		}
	}
}