package ok;

import java.util.ArrayList;


import ardoise.*;

public class Chapeau extends Forme {
	
	private String nom;
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private ArrayList<Segment> seg;

	
	

	public Chapeau() {
		
	}

	public Chapeau(String nom, PointPlan p1,PointPlan p2,PointPlan p3) {
		this.setNomForme(nom);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.seg = new ArrayList<Segment>();
		
	}
	
	public Chapeau(Chapeau c) {
		
	}
	
	
	public void deplacer(int arg0, int arg1) {
		
		this.dessiner();
		
		this.seg.get(0).deplacer(arg0,arg1);
		this.seg.get(1).getPointArrivee().deplacer(arg0, arg1);
		

	}
	
	public ArrayList<Segment> dessiner() {
		Segment s1 = new Segment(p1,p2);
		Segment s2 = new Segment(p2,p3);
		
		
		this.seg.add(s1);
		this.seg.add(s2);
		return this.seg;
		
	}
	
	public String getNomChapeau() {
		return this.nom;
	}
	
	public void setNomChapeau(String nom) {
		this.nom = nom;
	}


	public String typeForme() {
	
		return "C";
	}

}
