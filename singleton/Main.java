package singleton;

public class Main {
    public static void main(String args[]){
        
Kylpyamme kylpyamme = Kylpyamme.getInstance();

kylpyamme.uusiKylpija("Joku");
kylpyamme.uusiKylpija("Toinen");

System.out.println("Kylpemässä ovat: " + kylpyamme.getKylpiat());
 
        
    }
}