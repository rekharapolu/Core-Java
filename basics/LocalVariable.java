class LocalVariable {
	static public void main(String[] args) {
	int a=10;
	System.out.println('a');//a
	System.out.println("a");//a
	System.out.println(a);//10
	//a=30;-->CTE we cannot declare more than 2 or more variables
	System.out.println(a);//10
	a=20;
	System.out.println(a);//20
	a=30;
	System.out.println(a);//30
	a=40;
	System.out.println(a);//40
	a=80;
	System.out.println(a);//80
	}
}