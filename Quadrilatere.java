package ok;

import java.util.ArrayList;


import ardoise.*;

public class Quadrilatere extends Forme{
	
	private String nom;
	private PointPlan p1;
	private PointPlan p2;
	private ArrayList<Segment> seg;
	
	
	
	// Constructeurs \\
	
	public Quadrilatere() {
		
	}
	
	public Quadrilatere(String nom, PointPlan p1,PointPlan p2) {
		this.setNomForme(nom);
		this.p1 = p1;
		this.p2 = p2;
		this.seg = new ArrayList<Segment>();
	}
	
	public Quadrilatere(Quadrilatere q) {
		this(q.getNomQuadrilatere(), q.getPointPlanQuadrilatere1(), q.getPointPlanQuadrilatere2());
		this.seg = q.getSegQuadrilatere();
		}
	
	
	// Getters \\
	
	public String getNomQuadrilatere() {
		return nom;
	}
	
	public PointPlan getPointPlanQuadrilatere1() {
		return p1;
	}
	
	public PointPlan getPointPlanQuadrilatere2() {
		return p2;
	}
	
	public ArrayList<Segment> getSegQuadrilatere() {
		return this.seg;
	}
	
	// Setters \\
	
	public void setNomQuadrilatere(String nom) {
		this.nom = nom;
	}

	public void setPointPlanQuadrilatere1(PointPlan p1) {
		this.p1 = p1;
	}

	public void setPointPlanQuadrilatere2(PointPlan p2) {
		this.p2 = p2;
	}
	
	public void setSegQuadrilatere(ArrayList<Segment> seg) {
		this.seg = seg;
	}
	
	
	// Méthodes \\


	public void deplacer(int arg0, int arg1) {
		
		this.dessiner();
		
		this.seg.get(0).deplacer(arg0,arg1);
		this.seg.get(1).getPointArrivee().deplacer(arg0, arg1);
		this.seg.get(2).getPointArrivee().deplacer(arg0, arg1);
		

	}
	
	 public ArrayList<Segment> dessiner() {

		 PointPlan p3 = new PointPlan(this.p1.getAbscisse(), this.p2.getOrdonnee());
         PointPlan p4 = new PointPlan(this.p2.getAbscisse(), this.p1.getOrdonnee());
         Segment s1 = new Segment(p1,p4);
         Segment s2 = new Segment(p1,p3);
         Segment s3 = new Segment(p3,p2);
         Segment s4 = new Segment(p2,p4);
         this.seg.add(s1);
         this.seg.add(s2);
         this.seg.add(s3);
         this.seg.add(s4);
         return this.seg;
	    }

	public String typeForme() {
	
		return "Q";
	}
}
