class Gun 
{
	String gN;
	int nOB;
	public Gun(String gN,int nOB) 
	{
		this.gN=gN;
		this.nOB=nOB;
	}
	public void shoot(){
		for(int i=1;i<=nOB;i++)
		{
			System.out.println("Shooted");
		}
	}
}