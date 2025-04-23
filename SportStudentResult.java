interface Student
{
	int Score=30;
	void displayScore();
}
interface Sports
{
	int Score=20;
	void displaySportScore();
}
class Result implements Student,Sports
{
	public void displayScore()
	{
		System.out.println("Academic Score is:"+Student.Score);
	}
	public void displaySportScore()
	{
	System.out.println("Sport Score is:"+Sports.Score);
	}
}
	public class SportStudentResult
	{
	public static void main(String args[])
	{
	Result r=new Result();
	r.displayScore();
	r.displaySportScore();
	}
	}
	
	
	ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java SportStudentResult
Academic Score is:30
Sport Score is:20

