import java.util.*;
class employee
{
int empid;
long mobileno;
string name,address,mailid;
scanner get=new Scanner(system.in);
void getdata()
{
System.out.println("enter the employee name:");
name=get.nextline();
System.out.println("enter mail id:");
mailid=get.nextline();
System.out.println("enter the employee address:");
address=get.nextline();
System.out.println("enter the employee id:");
empid=get.nextint();
System.out.println("{enter mobile number:");
mobileno=get.nextlong();
}
void display()
{
System.out.println("employee name:"+name);
System.out.println("employee id:"+empid);
System.out.println?("mailid:"+mailid);
System.out.println("address:"+address);
System.out.println("mobile number:"+mobileno);
}
}
class programmer extends employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getprogrammer()
{
System.out.println("enter the basic pay:");
bp=get.nextDouble();
}
void calculateprog()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAYSLIP FOR PROGRAMMER**********");
System.out.println("basic pay :Rs"+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf);
System.out.println("CLUB:"+club);
System.out.println("GROSS:"+gross);
System.out.println("NET PAY:RS"+net);
}
}
class Asstprofessor extends employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getasst()
{
System.out.println("enter the basic pay:");
bp.get.nextDouble();
}
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAY SLIP FOR ASSISTANT PROFESSOR**********);
System.out.println("basic pay:Rs"+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("CLUB:"+club);
System.out.println("GROSS PAY:"+gross);
System.out.println("NET PAY:"+net);
}
}
class Associate professor extends employee
{
double salary,bp,da,hra,pf,club,net,gross;
{
System.out.println("enter the basic pay:");
bp=get.nextDouble();
}
void calculateassociate()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAY SLIP FOR ASSOCIATE PROFESSOR**********");
System.out.println("basic pay:Rs"+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf);
System.out.println("CLUB:Rs"+club);
System.out.println("GROSS PAY:"+gross);
System.out.println("NET PAY:"+net);
}
}
class professor extends employee
{
double salary,bp,da,hra,pf,club,net,gross;
void getprofessor()
{
system.out.println("enter the basic pay:");
bp=get.nextDouble();
}
void calculateprofessor()
{
da=(0.97*bp);
hra=(0.10*bp);
pf=(0.12*bp);
club=(0.1*bp);
gross=(bp+da+hra);
net=(gross-pf-club);
System.out.println("********PAY SLIP FOR PROFESSOR**********");
System.out.println("basic pay :Rs"+bp);
System.out.println("DA:Rs"+da);
System.out.println("HRA:Rs"+hra);
System.out.println("PF:Rs"+pf);
System.out.println("CLUB:Rs"+club);
System.out.println("GROSS PAY:Rs"+gross);
System.out.println("NET PAY:Rs"+net);
}
}
class salary
{
public static void main(string[]args)
{
int choice,cont;
do
{
System.out.println("payroll");
System.out.println("1.PROFESSOR\t2.ASSISTANT PROFESSOR\t3.ASSOCIATE PROFESSOR\t4.PROFESSOR\t);
scanner c=new scanner(system.in);
choice=c.nextint();
switch(choice)
{
case 1:
{
programmer p=new programmer();
p.getdata();
p.getprogrammer();
p.display();
p.calculateprog();
break;
}
case 2:
{
Asstprofessor asst=new Asstprofessor();
asst.getdata();
asst.getasst();
asst.display();
asst.calculateasst();
break;
}
case 3:
{
Associate professor asso=new Associateprofessor();
asso.getdata();
asso.getassociate();
asso.display?();
asso.calculateassociate();
break;
}
case 4;
{
professor prof=new professor();
prof.getdata();
prof.getprofessor();
prpf.display();
prof.calculateprofessor();
break;
}
System.out.println("do yopu want to continue 0 to quit and 1 to continue");
cont=c.nextint();
}while(cont==1);