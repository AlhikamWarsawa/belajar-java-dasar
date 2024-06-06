public class variable {
    public static void main(String[] args) {
//        Variable
        String name;
        name = "Eko Kurniawan Khannedy";

        System.out.println(name);

        int age = 30;
        String address = "Indonesia";

        System.out.println(age);
        System.out.println(address);

        // Ganti Isi Variable
        name = "Budi Nugraha";
        System.out.println(name);

//        Kata Kunci Var
        var firstname = "Eko";
        var middlename = "Kurniawan";
        var lastname = "Khannedy";

//        var company; //Error
//        company = "Indonesia"; //Error

//        Kata Kunci Final
        final String application = "Belajar Java";
//        application = "Belajar PHP"; //Error Karena Tidak Bisa Diubah Lagi
    }
}
