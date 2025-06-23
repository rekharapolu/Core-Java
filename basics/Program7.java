public class Program7{
	public static void main(String[] args){
		int n1=1, n2=2 ,n3=3 ,n4=4 ;
		System.out.println((n1>n2)?((n1>n3)?((n1>n4)?n1:n4):((n3>n4)?n3:n4)):((n2>n3)?((n2>n4)?n2:n4):((n3>n4)?n3:n4)));
	}
}