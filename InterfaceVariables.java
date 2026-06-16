package com.example.workshop;
//A variable with capital letters is called as final variable for the constant with name
interface Father
{
	double INC=10000;//Here INC is called as final variable or symbolic or named constants
}
interface Mother 
{
	double INC=5000;
}
class Son implements Father,Mother
{
	public void totalIncome()
	{
		System.out.println("\n Total Income:"+(Father.INC+Mother.INC));
		//double INC=11200 it shows error because the final variables values cannot be changed
	}
}
 class InterfaceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Son s=new Son();
    s.totalIncome();
	}

}
