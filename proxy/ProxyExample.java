import java.util.ArrayList;
import java.util.List;

class ProxyExample {
    public static void main(final String[] arguments) {
         Image image1 = new ProxyImage("HiRes_10MB_Photo1");
         Image image2 = new ProxyImage("HiRes_10MB_Photo2");
 
         // Lisää valokuvakansio (esim. List-rakenne) ja lisää valokuvia proxyinä
         List<Image> photoAlbum = new ArrayList<>();
         photoAlbum.add(image1);
         photoAlbum.add(image2);
 
         // Tulosta tiedot valokuvakansion sisällöstä (kuvia ei ladata)
         for (Image image : photoAlbum) {
             image.showData();
         }
 
         // Esitä, kuinka valokuvakansiota voidaan selata (kuvat ladataan, ellei vielä ole ladattu)
         for (Image image : photoAlbum) {
             image.displayImage();
         }
     }
 }