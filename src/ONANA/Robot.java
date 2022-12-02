package ONANA;
import java.util.*;
public class Robot {
	protected String nom;
	protected int vie;
	
	public Robot (){
		this.nom =" ";
		this.vie =10;
	}
	 Robot(String nom) {
		this.nom = nom;
		this.vie =10;
	}
	public String getNom(){
		return nom;
	}
	public int getvie(){
		return vie;
	}
	public void setNom(String nom) {
		this.nom =nom;
	}
	public void setPvie(int vie) {
		this.vie =vie;
	}
	public void Affiche(){
		System.out.println("Robot: \t" +nom);
	}
	public void Fire(Robot riki){
		riki.vie -=2;
		System.out.println("le Robot "+riki.nom+" est toucher ");
	}
	public void bad(Robot rider){
		rider.vie +=0;
		System.out.println(this.getNom()+rider.nom+" a esquive la balle de  "+this.nom);
	}
	public void th(Robot rider)
	{
		System.out.println("il a recu une balle du Robot "+rider.nom);
	}
	public void isDead()
	{
		if(this.getvie() <= 0)
		{
			System.out.println(this.getNom()+" est detruit");
		}
		else
		{
			System.out.println("le Robot  "+this.getNom()+" est en vie: \t" +this.getvie()+"\n");
		}
		
	}	
	public void fire(Fight q) {
		Random random = new Random();
		if(random.nextBoolean())
		{
			int v=q.getvie()-2;
			q.setPvie(v);
			System.out.println(""+q.getNom()+" est touche par: \t" +this.nom+"\n");
		}
	}

}
