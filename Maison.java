package ok;
import ardoise.*;
import java.util.ArrayList;

public class Maison extends Forme {

	private String nom;
    private Forme c;
    private Forme q1;
    private Forme q2;
    private ArrayList<Segment> seg;
    
    
    
    // Constructeurs \\
    
    public Maison() {
        
    }

    public Maison(String nom, Forme c, Forme q1, Forme q2) {
    	this.setNomForme(nom);
        this.c = c;
        this.q1 = q1;
        this.q2 = q2;
        this.seg = new ArrayList<Segment>();
    }
    
    public Maison(Maison m) {
        this(m.getNomMaison(),m.getChapeauMaison(), m.getQuadrilatereMaison1(), m.getQuadrilatereMaison2()); 
        this.seg = m.getSegMaison(); 
    }
    
    
    // Getters \\
    
    public String getNomMaison() {
    	return this.nom;
    }

    public Forme getChapeauMaison() {
        return this.c;
    }

    public Forme getQuadrilatereMaison1() {
        return this.q1;
    }

    public Forme getQuadrilatereMaison2() {
        return this.q2;
    }

    public ArrayList<Segment> getSegMaison() {
        return this.seg;
    }

    // Setters \
    
    public void setNomMaison(String nom) {
    	this.nom = nom;
    }

    public void setChapeauMaison(Forme c) {
        this.c = c;
    }

    public void setQuadrilatereMaison1(Forme q1) {
        this.q1 = q1;
    }

    public void setQuadrilatereMaison2(Forme q2) {
        this.q2 = q2;
    }

    public void setSegMaison(ArrayList<Segment> seg) {
        this.seg = seg;
    }
    
    
    // Méthodes \\

    public void deplacer(int arg0, int arg1) {
        this.c.deplacer(arg0,arg1);
        this.q1.deplacer(arg0,arg1);
        this.q2.deplacer(arg0,arg1);
    }


    public ArrayList<Segment> dessiner() {
        this.seg.addAll(this.c.dessiner());
        this.seg.addAll(this.q1.dessiner());
        this.seg.addAll(this.q2.dessiner());
        return this.seg;
    }
    
    public String typeForme() {
        return "GF";
    }
}
