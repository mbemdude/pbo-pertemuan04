package perulangan;

public class perulangan {
    public static void main(String[] args) {
        int isiGalon = 0;
        int galonPenuh = 200;

        System.out.println("Isi galon : " + isiGalon + " l");
        System.out.println("Isi galon ketika penuh : " + galonPenuh + " l");

        while (isiGalon != galonPenuh) {
            isiGalon++;
            System.out.println("Galon sedang diisi...");
            System.out.println("Isi galon sekarang : " + isiGalon + " l");
        }
        System.out.println("==================");
        System.out.println("Galon terisi penuh");
        System.out.println("==================");
    }
}
