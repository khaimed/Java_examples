package Math;
/*
    Exercice 2 : Classe Point
    On considère une classe Point définie par deux attributs : x et y.
    Travail demandé :

    1. Créer une méthode membre permettant d’afficher les coordonnées d’un point sous
    la forme (x,y).
*/
class Point{
    int x;
    int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String member(){
        return "(" + this.x + "," + this.y + ")";
    }
    /*
        2. Créer une méthode membre deplacer(int dx,int dy) permettant de modifier
        les coordonnées du point selon deux valeurs fournies en paramètres.
    */
    public void deplacer(int dx,int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    /*
        3. Créer une méthode membre getDistance(Point p) permettant de calculer la distance
         entre le point courant et un autre point donné en paramètre.
    */
    public double getDistance(Point p){
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    /*
        4. Réfléchir : Peut-on appeler la méthode deplacer() sans objet ?
        => Non
        5. Est ce qu’on peut créer une méthode static ? qui permet de calculer et retourner
        la distance entre deux points. si Oui, donner son code source.
    */
    public static double getDistance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }
    /*
        6. Créer une classe exécutable Program qui permet de tester les fonctionnalités précédentes.
    */
}
public class Main {
    public static void main(String[] args) {
        // 1. Affichage de point
        Point p1 = new Point(3,6);
        Point p2 = new Point(4,7);
        System.out.println(p1.member());
        System.out.println(p2.member());
        //2. Deplacement de point
        p1.deplacer(1,3);
        System.out.println(p1.member());
        p2.deplacer(2,2);
        System.out.println(p1.member());
        //3. Affichage de distance
        System.out.println(p1.getDistance(p2));
        System.out.println(p2.getDistance(p1));
        //4. Affichage de distance avec static
        System.out.println(Point.getDistance(p1,p2));
    }
}