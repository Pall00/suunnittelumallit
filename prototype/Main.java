package prototype;

public class Main {
    public static void main(String[] args) {
        try {
            Kello alkuperainen = new Kello(10, 30, 45);
            Kello matalaKopio = alkuperainen.clone();
            Kello syvaKopio = alkuperainen.syvaKopio();

            System.out.println("Alkuperäinen kello: " + alkuperainen);
            System.out.println("Matalakopio: " + matalaKopio);
            System.out.println("Syväkopio: " + syvaKopio);

            alkuperainen.setAika(11, 15, 30);
            System.out.println("\nMuutetaan alkuperäisen kellon aikaa...");
            System.out.println("Alkuperäinen kello: " + alkuperainen);
            System.out.println("Matalakopio: " + matalaKopio); // Matalakopio käyttäytyy samalla tavalla kuin alkuperäinen
            System.out.println("Syväkopio: " + syvaKopio); // Syväkopio ei muutu, koska se on erillinen olio

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}