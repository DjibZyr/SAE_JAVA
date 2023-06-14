package ok;

import java.util.*;

import ardoise.*;


public class TestArdoise {
	
	public static void AfficherChapeau() {
		Ardoise ar = new Ardoise();

        Scanner scan = new Scanner(System.in);
        System.out.println("Voulez-vous un oiseau ? Y/n : ");
        String YNchapeau = scan.nextLine();
        if (YNchapeau.equals("Y")) {
            System.out.println("Combien en voulez-vous ? : ");
            int NBchapeau = scan.nextInt();
            int NBpoint = NBchapeau * 3;
            ArrayList<PointPlan> points = new ArrayList<PointPlan>();

            try {
                for (int i = 0; i < NBpoint; i++) {
                    String Idpoint = "point " + (i + 1);
                    System.out.println("Entrez le x du " + Idpoint);
                    int x = scan.nextInt();
                    while (x < 0 || x > 200) {
                        System.out.println("Vous devez entrer une valeur entre 0 et 200 ! Réessayez : ");
                        x = scan.nextInt();
                    }
                    System.out.println("Entrez le y du " + Idpoint);
                    int y = scan.nextInt();
                    while (y < 0 || y > 200) {
                        System.out.println("Vous devez entrer une valeur entre 0 et 200 ! Réessayez : ");
                        y = scan.nextInt();
                    }
                    PointPlan point = new PointPlan(x, y);
                    points.add(point);
                }

                ArrayList<Forme> chapeaux = new ArrayList<Forme>();
                int j = 0;
                for (int i = 0; i < NBchapeau; i++) {
                    String nomChapeau = "Chapeau " + (i + 1);
                    Forme chapeau = new Chapeau(nomChapeau, points.get(j), points.get(j + 1), points.get(j + 2));
                    chapeau.dessiner();
                    chapeaux.add(chapeau);
                    j += 3;
                }

                for (int i = 0; i < chapeaux.size(); i++) {
                    ar.ajouterForme(chapeaux.get(i));
                }

                ar.dessinerGraphique();
            } catch (IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
        scan.close();
    }

    public static void AfficherTriangle() {
    	 Ardoise ar = new Ardoise();

         Scanner scan = new Scanner(System.in);
         System.out.println("Voulez-vous un Triangle ? Y/n : ");
         String YNtriangle = scan.nextLine();
         if (YNtriangle.equals("Y")) {
             System.out.println("Combien en voulez-vous ? : ");
             int NBtriangle = scan.nextInt();
             int NBpoint = NBtriangle * 3;
             ArrayList<PointPlan> PointsTriangle = new ArrayList<PointPlan>();
             try {
                 for (int i = 0; i < NBpoint; i++) {
                     String Idpoint = "point " + (i + 1);
                     System.out.println("Entrez le x du " + Idpoint);
                     int x = scan.nextInt();
                     while (x < 0 || x > 200) {
                         System.out.println("Vous devez entrer une valeur entre 0 et 200 ! Réessayez :");
                         x = scan.nextInt();
                     }
                     System.out.println("Entrez le y du " + Idpoint);
                     int y = scan.nextInt();
                     while (y < 0 || y > 200) {
                         System.out.println("Vous devez entrer une valeur entre 0 et 200 ! Réessayez :");
                         y = scan.nextInt();
                     }
                     PointPlan point = new PointPlan(x, y);
                     PointsTriangle.add(point);
                 }

                 ArrayList<Forme> triangles = new ArrayList<Forme>();
                 int j = 0;
                 for (int i = 0; i < NBtriangle; i++) {
                     String nomTriangle = "Triangle " + (i + 1);
                     Forme triangle = new Triangle(nomTriangle, PointsTriangle.get(j), PointsTriangle.get(j + 1), PointsTriangle.get(j + 2));
                     triangle.dessiner();
                     triangles.add(triangle);
                     j += 3;
                 }

                 for (int i = 0; i < triangles.size(); i++) {
                     ar.ajouterForme(triangles.get(i));
                 }
             } catch (IllegalArgumentException e) {
                 System.out.println("Erreur : " + e.getMessage());
             } 
             ar.dessinerGraphique();
         }
        
     } 
    	
    public static void AfficherQuadrilatere() {
    	Ardoise ar = new Ardoise();
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Voulez-vous un Quadrilatere ? Y/n : ");
        String YNQuarilatere = scan.nextLine();
        if (YNQuarilatere.equals("Y")) {
            System.out.println("Combien en voulez-vous ? : ");
            int NBquadrilatere = scan.nextInt();
            int NBpoint = NBquadrilatere*2;
            ArrayList<PointPlan> PointsQuadrilatere = new ArrayList<PointPlan>();
            for (int i = 0; i < NBpoint; i ++) {
                String Idpoint = "point "+(i+1);
                System.out.println("Entrez le x du "+Idpoint);
                int x = scan.nextInt();
                System.out.println("Entrez le y du "+Idpoint);
                int y = scan.nextInt();
                PointPlan point = new PointPlan(x,y);
                PointsQuadrilatere.add(point);
            }
            ArrayList<Forme> quadrilateres = new ArrayList<Forme>();
            int j = 0;
            for (int i = 0; i < NBquadrilatere; i++) {

                String nomQuadrilatere = "Quadrilatere "+(i+1);
                Forme quadrilatere = new Quadrilatere(nomQuadrilatere,PointsQuadrilatere.get(j),PointsQuadrilatere.get(j+1));
                quadrilatere.dessiner();
                quadrilateres.add(quadrilatere);
                j+= 2;
            }
            for (int i = 0; i < quadrilateres.size(); i ++) {
                ar.ajouterForme(quadrilateres.get(i));
            }
        }
        ar.dessinerGraphique();
        scan.close();
    }

    public static void AfficherMaison() {

    	Ardoise ar = new Ardoise();
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Voulez-vous une Maison ? Y/n : ");
        String YNMaison = scan.nextLine();
        if (YNMaison.equals("Y")) {
            System.out.println("Combien en voulez-vous ? : ");
            int NBmaison = scan.nextInt();
            int NBpoint = NBmaison*7;
            ArrayList<PointPlan> PointsQuadrilatere = new ArrayList<PointPlan>();
            for (int i = 0; i < NBpoint; i ++) {
                String Idpoint = "point "+(i+1);
                System.out.println("Entrez le x du "+Idpoint);
                int x = scan.nextInt();
                System.out.println("Entrez le y du "+Idpoint);
                int y = scan.nextInt();
                PointPlan point = new PointPlan(x,y);
                PointsQuadrilatere.add(point);
            }
            ArrayList<Forme> quadrilateres = new ArrayList<Forme>();
            int j = 0;
            int d = 7;
            for (int i = 0; i < NBmaison; i++) {
            	
                String nomMaison = "Maison "+(i+1);
                System.out.println(PointsQuadrilatere);
                Forme chap = new Chapeau("Toit", PointsQuadrilatere.get(0+d*i), PointsQuadrilatere.get(1+d*i), PointsQuadrilatere.get(2+d*i) );
                Forme quadrilatere = new Quadrilatere(nomMaison, PointsQuadrilatere.get(3+d*i), PointsQuadrilatere.get(4+d*i));
                Forme quadrilatere1 = new Quadrilatere(nomMaison, PointsQuadrilatere.get(5+d*i), PointsQuadrilatere.get(6+d*i));
                
                chap.dessiner();
                quadrilatere.dessiner();
                quadrilatere1.dessiner();
                quadrilateres.add(chap);
                quadrilateres.add(quadrilatere);
                quadrilateres.add(quadrilatere1);
                j+= 2;
            }
            
            for (int i = 0; i < quadrilateres.size(); i ++) {
                ar.ajouterForme(quadrilateres.get(i));
            }
        }
        ar.dessinerGraphique();
        scan.close();
    }
    
    public static void AfficherEtoile() {

        Ardoise ar = new Ardoise();
        Scanner scan = new Scanner(System.in);

        System.out.println("Voulez-vous une Étoile ? Y/n : ");
        String YNEtoile = scan.nextLine();
        if (YNEtoile.equals("Y")) {
            System.out.println("Combien en voulez-vous ? : ");
            int NBEtoile = scan.nextInt();
            int NBPoint = NBEtoile*12;
            ArrayList<PointPlan> PointsEtoile = new ArrayList<PointPlan>();
            for (int i = 0; i < NBPoint; i ++) {
                String Idpoint = "point "+(i+1);
                System.out.println("Entrez le x du "+Idpoint);
                int x = scan.nextInt();
                System.out.println("Entrez le y du "+Idpoint);
                int y = scan.nextInt();
                PointPlan point = new PointPlan(x,y);
                PointsEtoile.add(point);
            }
            ArrayList<Forme> chapeaux = new ArrayList<Forme>();
            int j = 0;
            for (int i = 0; i < NBPoint/3; i++) {

                String nomChapeau = "Chapeau "+(i+1);
                Forme chapeau = new Chapeau(nomChapeau,PointsEtoile.get(j),PointsEtoile.get(j+1),PointsEtoile.get(j+2));
                chapeau.dessiner();
                chapeaux.add(chapeau);
                j+= 3;
            }
            ArrayList<Forme> etoiles = new ArrayList<Forme>();
            int k = 0;
            for (int i = 0; i < NBEtoile; i++) {

                String nomEtoile = "Étoile "+(i+1);
                Forme etoile = new Etoile(nomEtoile,chapeaux.get(k),chapeaux.get(k+1),chapeaux.get(k+2),chapeaux.get(k+3));
                etoile.dessiner();
                etoiles.add(etoile);
                k+=4;
            }
            for (int i = 0; i < etoiles.size(); i ++) {
                ar.ajouterForme(etoiles.get(i));
            }

    }
    ar.dessinerGraphique();
}
    
    public static void main(String[] args) {
        TestArdoise.AfficherEtoile();
        
    }
}