package ok;

import java.util.ArrayList;

import ardoise.*;

public class Triangle extends Forme{

	private String nom;
	private PointPlan p1;
	private PointPlan p2;
	private PointPlan p3;
	private ArrayList<Segment> seg;
	
	
	// Constructeurs \\
	
	public Triangle() {
		
	}
	
	public Triangle(String nom, PointPlan p1,PointPlan p2,PointPlan p3) {
		this.setNomForme(nom);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.seg = new ArrayList<Segment>();
	}
	
	public Triangle(Triangle t) {
		this(t.getNomTriangle(),t.getPointPlanTriangle1(),t.getPointPlanTriangle2(),t.getPointPlanTriangle3());
		this.seg = t.getSegTriangle();
	}
	
	
	// Getters \\
	
	
	public String getNomTriangle() {
		return nom;
	}
		
	public PointPlan getPointPlanTriangle1() {
		return p1;
	}
		
	public PointPlan getPointPlanTriangle2() {
		return p2;
	}

	public PointPlan getPointPlanTriangle3() {
		return p3;
	}

	public ArrayList<Segment> getSegTriangle() {
		return this.seg;
	}
		
	// Setters \\
		
	public void setNomTriangle(String nom) {
		this.nom = nom;
	}
		
	public void setPointPlanTriangle1(PointPlan p1) {
		this.p1 = p1;
	}
		
	public void setPointPlanTriangle2(PointPlan p2) {
		this.p2 = p2;
	}
		
	public void setPointPlanTriangle3(PointPlan p3) {
		this.p3 = p3;
	}
		
	public void setSegTriangle(ArrayList<Segment> seg) {
		this.seg = seg;
	}
	
	
	// Méthodes \\
	
	
	public void deplacer(int arg0, int arg1) {
		
		this.dessiner();
		
		this.seg.get(0).deplacer(arg0,arg1);
		this.seg.get(1).getPointArrivee().deplacer(arg0, arg1);
	}
	
	public ArrayList<Segment> dessiner() {
		Segment s1 = new Segment(p1,p2);
		Segment s2 = new Segment(p2,p3);
		Segment s3 = new Segment(p3,p1);
		this.seg.add(s1);
		this.seg.add(s2);
		this.seg.add(s3);
		return this.seg;
		
	}

	public String typeForme() {
	
		return "T";
	}
}
