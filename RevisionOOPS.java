package com.example.training.oop;
 class Pokemon{
	int hp;
	int speed;
	int attack;
	int defense;
	String type;
	String name;
}
public class RevisionOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Pokemon p1=new Pokemon();
 p1.name="Pikacho";
 p1.type="Electric";
 p1.attack=50;
 Pokemon p2=new Pokemon();
 p2.name="Charizard";
 p2.type="Fire";
 p2.attack=100;
 Pokemon p3=p1;//p3 is the shallow copy of p1
 p3.type="Water";
 System.out.println(p1.type);//water
	}

}
