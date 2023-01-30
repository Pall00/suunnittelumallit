package abstractfactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        VaateTehdas tehdas = new AdidasTehdas();

       /*  Class<?> c = null;
        VaateTehdas tehdas = null;

 Properties properties = new Properties();
 try {
        properties.load(new FileInputStream("tehdas.properties"));
 }catch (IOException e) {
    e.printStackTrace();
}
  try{
        c = Class.forName(properties.getProperty("tehdas"));
        tehdas = (VaateTehdas)c.getDeclaredConstructor().newInstance();

 }catch (Exception e){
    e.printStackTrace();
}*/
        

        Hattu hattu = tehdas.createHattu();
        Paita paita = tehdas.createPaita();
        Housut housut = tehdas.createHousut();
		Tossut tossut = tehdas.createTossut();
		
		System.out.println("Päälläni on:\n " + hattu +"\n "+ paita+"\n "+ housut +"\n "+ tossut);

}

}
