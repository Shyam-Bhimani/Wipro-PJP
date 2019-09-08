public class Project1 {
		static String designation;
		static int DA;
		static String getdesignation(char code) {
			switch(code) {
			case 'e': 
				 designation="Engineer";
				 DA=20000;
				 break;
			case 'c':
				 designation="Consultant";
				 DA=32000;
				 break;
			case 'k':
				 designation="Clerk";
				 DA=12000;
				 break;
			case 'r':
				 designation="Receptionist";
				 DA=15000;
				 break;
			case 'm':
				 designation="Manager";
				 DA=40000;
				 break;
			default:
				break;
			}
			return designation;
		}
		public static void main(String[] args) {
			int eid=Integer.parseInt(args[0]);
			if(eid==1001) {
				 System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
				 char dcode='e';
				 int EID=eid;
				 String Ename="Ashish";
				 String Dept="R&D";
				 int BASIC=20000;
				 int HRA=8000;
				 int IT=3000;
				 getdesignation(dcode);
				 int sal=BASIC+HRA+DA-IT;
				System.out.printf("%d\t %s\t %s\t\t %s\t %d",EID,Ename,Dept,designation,sal);
			}else if(eid==1002) {
				 System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
				 char dcode='c';
				 int EID=eid;
				 String Ename="Sushma";
				 String Dept="PM";
				 int BASIC=30000;
				 int HRA=12000;
				 int IT=9000;
				 getdesignation(dcode);
				 int sal=BASIC+HRA+DA-IT;
				System.out.printf("%d\t %s\t %s\t\t %s\t %d",EID,Ename,Dept,designation,sal);
			}else if(eid==1003) {
				 System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
				 char dcode='k';
				 int EID=eid;
				 String Ename="Rahul";
				 String Dept="Acct";
				 int BASIC=10000;
				 int HRA=8000;
				 int IT=1000;
				 getdesignation(dcode);
				 int sal=BASIC+HRA+DA-IT;
				System.out.printf("%d\t %s\t %s\t\t %s\t\t %d",EID,Ename,Dept,designation,sal);
			}else if(eid==1004) {
				 System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
				 char dcode='r';
				 int EID=eid;
				 String Ename="Chahat";
				 String Dept="Front Desk";
				 int BASIC=12000;
				 int HRA=6000;
				 int IT=2000;
				 getdesignation(dcode);
				 int sal=BASIC+HRA+DA-IT;
				System.out.printf("%d\t %s\t %s\t %s\t %d",EID,Ename,Dept,designation,sal);
			}else if(eid==1005) {
				 System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
				 char dcode='m';
				 int EID=eid;
				 String Ename="Ranjan";
				 String Dept="Engg";
				 int BASIC=50000;
				 int HRA=20000;
				 int IT=20000;
				 getdesignation(dcode);
				 int sal=BASIC+HRA+DA-IT;
				System.out.printf("%d\t %s\t %s\t\t %s\t %d",EID,Ename,Dept,designation,sal);
			}else if(eid==1006) {
				 System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
				 char dcode='e';
				 int EID=eid;
				 String Ename="Suman";
				 String Dept="Manufacturing";
				 int BASIC=23000;
				 int HRA=9000;
				 int IT=4400;
				 getdesignation(dcode);
				 int sal=BASIC+HRA+DA-IT;
				System.out.printf("%d\t %s\t %s\t\t %s\t %d",EID,Ename,Dept,designation,sal);
			}else if(eid==1007) {
				 System.out.println("EmpNo\tEmpName\tDepartment\tDesignation\tSalary");
				 char dcode='c';
				 int EID=eid;
				 String Ename="Tanmay";
				 String Dept="PM";
				 int BASIC=29000;
				 int HRA=12000;
				 int IT=10000;
				 getdesignation(dcode);
				 int sal=BASIC+HRA+DA-IT;
				System.out.printf("%d\t %s\t %s\t\t %s\t %d",EID,Ename,Dept,designation,sal);
			}
	 
		}
	

}
