public class Num_Char1{
	public static void main(String[] args){
		int star=0,n=1;
		for(int i=1;i<=5;i++){
			char ch='a'; 
			if(i<=3) star++;
			else star--;
			for(int j=1;j<=star;j++){
				if(i<=3)
					System.out.print(n++);
				else
					System.out.print(ch++);
			}
		System.out.println();
		}
	}
}