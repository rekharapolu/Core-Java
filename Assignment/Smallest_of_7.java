public class Smallest_of_7{
	public static void main(String[] args){
		int n1=1, n2=2, n3=3, n4=4, n5=5,n6=6,n7=7;
		System.out.println(n1<n2 ? (n1<n3 ?((n1<n4 ? (n1<n5 ? (n1<n6 ? (n1<n7 ? n1:n7) : (n4<n5 ? n4:n5))) : (n3<n4 ? (n3<n5 ? n3:n5) : (n4<n5 ? n4:n5))) :
					(n2<n3 ?((n2<n4 ? (n2<n5 ? n2:n5) : (n4<n5 ? n4:n5))) : (n3<n4 ? (n3<n5 ? n3:n5) : (n4<n5 ? n4:n5))));
	}
}