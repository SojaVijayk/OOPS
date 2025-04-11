import java.util.Scanner;
class Employee
{
	int Empid,Salary;
	String Name,Address;
	Employee(int eid,int sal,String name,String addr)
	{
	Empid=eid;
	Salary=sal;
	Name=name;
	Address=addr;
	}
	}
class Teacher extends Employee
{
	String department,subjects_taught;
	Teacher(int eid,int sal,String name,String addr,String dept,String sub)
	{
		super(eid,sal,name,addr);
		department=dept;
		subjects_taught=sub;
	}
	void display()
	{
		System.out.println("Employee id:"+Empid);
		System.out.println("Employee Name:"+Name);
		System.out.println("Salary:"+Salary);
		System.out.println("Address:"+Address);
		System.out.println("Department:"+department);
		System.out.println("subjects.taught:"+subjects_taught);
	}
}
class Employesuper
{
public static void main(String args[])
{
	int i,n,eid,Salary;
	String name,subj,addrs,dept;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of Employees:");
	n=sc.nextInt();
	Teacher teacher[]=new Teacher[n];
	for(i=0;i<n;i++)
	{
		System.out.println("\n Enter the Employee id:");
		eid=sc.nextInt();
		System.out.println("\n Enter the Employee name:");
		name=sc.next();
		System.out.println("\n Enter the Salary:");
		Salary=sc.nextInt();
		System.out.println("\n Enter the Address:");
		addrs=sc.next();
		System.out.println("\n Enter the Department:");
		dept=sc.next();
		System.out.println("\n Enter the subject taught:");
		subj=sc.next();
		teacher[i]=new Teacher(eid,Salary,name,addrs,dept,subj);
	}
	System.out.println("\n Details of Teachers");
	System.out.println("----------------------");
	for(i=0;i<n;i++)
	{
		teacher[i].display();
	}
}
}




ksb@ksb-H410M-H-V2:~/SOJA/sojaoops$ java Employesuper
Enter the number of Employees:
2

 Enter the Employee id:
101

 Enter the Employee name:
soja

 Enter the Salary:
20000

 Enter the Address:
manayath

 Enter the Department:
mca

 Enter the subject taught:
software

 Enter the Employee id:
102

 Enter the Employee name:
sreya

 Enter the Salary:
10000

 Enter the Address:
puthiyapa

 Enter the Department:
mba

 Enter the subject taught:
accounts

 Details of Teachers
----------------------
Employee id:101
Employee Name:soja
Salary:20000
Address:manayath
Department:mca
subjects.taught:software
Employee id:102
Employee Name:sreya
Salary:10000
Address:puthiyapa
Department:mba
subjects.taught:accounts

		

		
		
		
		
