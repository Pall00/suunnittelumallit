package singleton;
import java.util.ArrayList;

public class Kylpyamme{

    private ArrayList<String> kylpee;

    private Kylpyamme(){
        kylpee = new ArrayList<>();
    }

    public void uusiKylpija(String kylpija){
        kylpee.add(kylpija);
    }

    public ArrayList<String> getKylpiat(){
        return kylpee;
    }
    
    private static Kylpyamme INSTANCE = null;
    public static Kylpyamme getInstance(){
    if (INSTANCE == null){
    INSTANCE = new Kylpyamme();
    }
    return INSTANCE;
    }
    }
    
