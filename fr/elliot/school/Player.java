package fr.elliot.school;

public abstract class Player 
{
	public String name;
	public int healt;
	public int age;
	public double attack;
	
	public Player(String name, int healt, int age, double attack)
	{
		this.name = name;
		this.healt = healt;
		this.age = age;
		this.attack = attack;
	}
	
	public static String getName()
	{
		return name;
	}
	
	public static int getHealt()
	{
		return healt;
	}
	
	public static int getAge()
	{
		return age;
	}
	
	public static double getAttack()
	{
		return attack;
	}
	
	public static abstract playerMove(double vitesse);
}