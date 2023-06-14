package ok;

import ardoise.*;

import java.util.ArrayList;

public class Etoile extends Forme{
	
	private String nom;
	private Forme c1;
	private Forme c2;
	private Forme c3;
	private Forme c4;
	private ArrayList<Segment> seg;
	
	
	

	// Constructeurs \\
	
	public Etoile() {
		
	}
	
	public Etoile(String nom, Forme c1, Forme c2,Forme c3,Forme c4) {
		this.setNomForme(nom);
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.seg = new ArrayList<Segment>();
	}
	
	public Etoile(Etoile e) {
		this(e.getNomEtoile(), e.getChapeauEtoile1(), e.getChapeauEtoile2(), e.getChapeauEtoile3(), e.getChapeauEtoile4());
		this.seg = e.getSegEtoile();
	}
	
	
	// Getters \\
	
	public String getNomEtoile() {
		return this.nom;
	}
	
	public Forme getChapeauEtoile1() {
		return this.c1;
	}
	
	public Forme getChapeauEtoile2() {
		return this.c2;
	}
	
	public Forme getChapeauEtoile3() {
		return this.c3;
	}
	
	public Forme getChapeauEtoile4() {
		return this.c4;
	}
	
	public ArrayList<Segment> getSegEtoile() {
		return this.seg;
	}
	
	// Setters \\
	
	public void setNomEtoile(String nom) {
		this.nom = nom;
	}

	public void setChapeauEtoile1(Forme c1) {
		this.c1 = c1;
	}

	public void setChapeauEtoile2(Forme c2) {
		this.c2 = c2;
	}

	public void setChapeauEtoile3(Forme c3) {
		this.c3 = c3;
	}

	public void setChapeauEtoile4(Forme c4) {
		this.c4 = c4;
	}

	public void setSegEtoile(ArrayList<Segment> seg) {
		this.seg = seg;
	}
	
	
	// Méthodes \\
	
	public void deplacer(int arg0, int arg1) {
		
		this.c1.deplacer(arg0,arg1);
		this.c2.deplacer(arg0,arg1);
		this.c3.deplacer(arg0,arg1);
		this.c4.deplacer(arg0,arg1);
		

	}
	
	 public ArrayList<Segment> dessiner() {
		 this.seg.addAll(this.c1.dessiner());
	     this.seg.addAll(this.c2.dessiner());
	     this.seg.addAll(this.c3.dessiner());
	     this.seg.addAll(this.c4.dessiner());
         return this.seg;
	    }

	public String typeForme() {
	
		return "GF";
	}
	
	
	
}
