package ONANA;
import java.util.*;
public class Arena {
	protected String n;
	public Arena(String so)
	{
		this.n = so;	
	}	
	public String fight(Robot b, Robot q) 
	{
		String pio=" ";
		while((b.vie !=0) && (q.vie !=0))
		{
			b.Fire(q);
			q.th(b);
			b.isDead();
			if(q.vie != 0)
			{
				q.Fire(b);
				b.th(q);
				q.isDead();
			}	
		}
		if(b.vie == 0)
		{
			b.isDead();
			pio="le robot: \t"+q.nom+"victoir du Robot "+b.nom;
		}
		if(q.vie == 0)
		{
			q.isDead();
			 pio="le robot: \t"+b.nom+" victoire du  Robot "+q.nom;
		}
		return pio;
	}
		public String fight(Robot mon, Fight kam) 
		{
			String pao=" ";		
			do	
			{
					mon.Fire(kam);
					kam.th(mon);
					kam.isDead();
				
				if(kam.vie != 0)
				{
					kam.fire(mon);
					mon.th(kam);
					mon.isDead();
				}
			}while((mon.vie !=0) && (kam.vie !=0));
			if(mon.vie == 0)
			{
				mon.isDead();
				pao="le robot: \t"+kam.nom+"a gagner le Robot "+mon.nom;
				return pao;
			}
			if(kam.vie == 0)
			{
				kam.isDead();
				 pao="le robot: \t"+mon.nom+"a gagner le Robot "+kam.nom;
				return pao;
			}
			return pao;
	}
		public String fight(Fight a, Fight b) 
		{
			String r=" ";
			do
			{
				if(a.getvie() != 0)
				{
					a.fire(b);
					b.isDead();
				}
				if(b.getvie() != 0)
				{	
						b.fire(a);
						a.isDead();	
				}
					
			}while((a.getvie() !=0) && (b.getvie() !=0));
			if(a.getvie() == 0)
			{
				 r=""+b.getNom()+"a gagner "+a.getNom();
			}
			if(b.getvie() == 0)
			{
				 r=""+a.getNom()+"a gagner "+b.getNom();	
			}
			return r;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Robot bob = new Robot("bob");
			Scanner sc = new Scanner(System.in);
			bob.Affiche();
			
			//test de combat entre D2R2 et Data
			Robot ROB1 = new Robot("");
			Robot ROB2 = new Robot("");
			Fight MAN1 = new Fight("");
			Fight MAN2 = new Fight("");
			
			Arena comb1 = new Arena("comb1");
	
			System.out.println("bienvenu sur le combat de robot de Pascal\n"
			+"*****quel combat vollez vous??*****\n"
			+"Tape 1 pour le combat Robot Vs Robot\n"
			+ "Tape 2 pour le combat Robot Vs Humain\n"
			+ "Tape 3 pour le combat Humain Vs Humain");
			int choix;
			choix = sc.nextInt();
			switch(choix)
			{
			case 1: 
				System.out.println("joueur 1 entre le nom de ton Robot");
				String n=sc.next();
				ROB1.setNom(n);
				
				System.out.println("joueur deux entre le nom de ton Robot");
				ROB2.setNom(sc.next());
				comb1.fight(ROB1, ROB2);
				break;
			case 2:
				System.out.println("joueur 1 entre le nom de ton robot");
				ROB1.setNom(sc.next());
				System.out.println("joueur 2 entre le non de ton combatant");
				MAN1.setNom(sc.next());
				comb1.fight(ROB1, MAN1);
				break;
			case 3:
				System.out.println("joueur 1 entre le non de ton combatant");
				MAN1.setNom(sc.next());
				System.out.println("joueur 2 entre le non de ton combatant");
				MAN2.setNom(sc.next());
				comb1.fight(MAN1, MAN2);
				break;
			default:
				System.out.println("Votre choix ne correspond pas aux chois proposer 1  !!!!!");
			}
		}
}

