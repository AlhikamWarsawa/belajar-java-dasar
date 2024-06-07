public class ifStatement {
    public static void main(String[] args) {
        var nilai = 80;
        var absen = 90;

        /*var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;
        var lulus = lulusAbsen && lulusNilai;*/

            // If
        if (nilai >= 80 && absen >= 80){
            System.out.println("Selamat Anda Lulus!");
            // Else If
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Selamat Anda Baik");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Selamat Anda Cukup");
            // Else
        } else {
            System.out.println("Selamat Anda Gagal!");
        }

    }
}
