package array;

public class array {
    public static void main(String[] args) {
        String mahasiswa[] = new String[5];

        mahasiswa[0] = "Ahmad Syarwani";
        mahasiswa[1] = "Rizky Dimas";
        mahasiswa[2] = "Muhammad Rama";
        mahasiswa[3] = "Yosin Nasa";
        mahasiswa[4] = "Anugerah Mahardika";

        for (int i = 0; i<=4; i++ ) {
            System.out.println("Nama: " + mahasiswa[i]);
        }
    }
}
