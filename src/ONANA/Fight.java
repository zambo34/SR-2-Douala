package ONANA;
import java.util.*;
public class Fight extends Robot {	
	protected String nom;
	protected int vie;
	protected float seed;
	public  Fight() {
		this.nom =" ";
		this.vie =10;
	}
	public Fight(String nom) {
		this.nom = nom;
		this.vie =10;
	}
	public String getNom(){
		return nom;
	}
	public void setNom(String n) {
		this.nom =n;
	}
	public void Affiche(){
		System.out.println("Fighter: \t" +nom);
	}
	public void Bad(Robot axs){
		axs.vie +=0;
		System.out.println("le Robot"+this.nom+" a louper "+axs.nom);
	}
	public void Fire(Robot ri){
		ri.vie -=2;
		System.out.println("le Robot"+this.nom+" a toucher le Robot "+ri.nom);
	}
	/*public void bad (Robot bre)
	{
		bre.vie +=0;
		System.out.println("le Robot "+this.nom+"le Robot a louper le Robot "bre.nom);
	}*/
	public void th(){
		System.out.println("il a recu une balle de: "+this.getNom());
	}
	public void isDead(){
		if(this.getvie() <= 0){
			System.out.println(this.getNom()+" est mort RIP ");
		}
		else{
			System.out.println(this.getNom()+" est toujour debout :\t" +this.getvie()+" point de vie\n");
		}	
	}
	public void fire(Fight bnb) {
		Random round = new Random();
		if(round.nextBoolean()){
			int v=bnb.getvie()-2;
			bnb.setPvie(v);
			System.out.println(bnb.getNom()+" est touche par: \t" +this.getNom()+"\n");
		}
	}
	public void fire(Robot busd) {
		Random round = new Random();
		if(round.nextBoolean()){
			int v=busd.getvie()-2;
			busd.setPvie(v);
			System.out.println(""+busd.getNom()+" est touche par: \t" +this.getNom()+"\n");
		}
	}
}
