class Clock 
{
	int hour;
	int min;
	int sec;
	public Clock(int hour,int min,int sec) 
	{
			this.hour=hour;
			this.min=min;
			this.sec=sec;
	}
	public void showTime(){
			System.out.println(hour + ":" + min + ":" + sec);
	}
}