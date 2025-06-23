class Student 
{
	String name;
	long id;
	int marks;
	String email;
	public Student(String name,long id,int marks,String email){
			this.name=name;
			this.id=id;
			this.marks=marks;
			this.email=email;
	}
	public void display(){
			System.out.println("<--Student Details-->");
			System.out.println("Name:"+this.name);
			System.out.println("id:"+this.id);
			System.out.println("marks:"+this.marks);
			System.out.println("email:"+this.email);
	}
}
