public class Main {
    public static void main(String[] args) {
        int isiGelas = 0;
        int penuh = 225;

        System.out.println("Isi gelas sekarang     : " + isiGelas + " ml");
        System.out.println("Isi gelas ketika penuh : " + penuh + " ml");

        while(isiGelas != penuh) {
            isiGelas++;
            System.out.println("Gelas sedang diisi..");
            System.out.println("Isi gelas sekarang : " + isiGelas + " ml");
        }

        System.out.println("Finale : Isi gelas sekarang : " + isiGelas + " ml");
    }
}