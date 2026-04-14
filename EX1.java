package packkTP3;

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("Point (" + x + ", " + y + ")");
    }

    public void deplacer(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public double distanceOrigine() {
        return Math.sqrt(x * x + y * y);
    }
    public double distancePts(Point p) {
    	double dx = this.x -p.x;
    	double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
public class EX1{
	public static void main(String[] args) {
        Point p1 = new Point(3, 4); 
        Point p2 = new Point(4, 5); 

        p1.afficher();
        
        System.out.println("Distance à l'origine:" + p1.distanceOrigine());

        p1.deplacer(2, -1); 
        System.out.print("Après déplacement : ");
        p1.afficher();
        
        System.out.println("Distance entre 2 points :");
        System.out.println(p2.distancePts(p1));
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	

