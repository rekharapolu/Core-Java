public class Sym_Num_Tri{
	public static void main(String[] args){
		int space=3,value=-1;
		for(int i=1;i<=3;i++){
			space--;
			value+=2;
			int n=1;
			for(int j=1;j<=space;j++){
					System.out.print(" ");
			}
			for(int j=1;j<=value;j++){
				if(j<=2)  System.out.print(n++);
				else  System.out.print(n--);

			}
		System.out.println();
		}
	}
}