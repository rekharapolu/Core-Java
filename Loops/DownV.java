public class DownV{
	public static void main(String[] args){
		int space=-3,star=4;
		for(int i=1;i<=4;i++){
		star--;
		space+=2;
		for(int j=1;j<=star;j++){
			System.out.print("*");
		}
		for(int j=1;j<=space;j++){
			System.out.print(" ");
		}
		if(i==1){
			star++;
			}
		for(int j=1;j<=star;j++){
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
