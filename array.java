public class array {
    public static void main(String[] args) {
//        Membuat Array
        String[] arrayString;
        // String[] arrayString = new string [3]; (Langsung)
        arrayString = new String[3];
        arrayString[0] = "Eko";
        arrayString[1] = "Kurniawan";
        arrayString[2] = "Khannedy";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

//        Array Initializer
        int[] arrayInt = new int[]{
                10, 90, 80, 67, 29
        };

        long[] arrayLong = {
                10L, 90L, 80L, 67L, 29L
        };

        String[] namaNama = {
                "Eko", "Kurniawan", "Khannedy"
        };

//        Operasi Di Array
        //array[index]
        System.out.println(namaNama[0]);
        //array[index] = value
        System.out.println(namaNama[1] = null);
        //array.length
        System.out.println(namaNama.length);

//        Array Di Dalam Array
        String[][] members = {
                {"Eko", "Kurniawan", "Khannedy"},
                {"Budi", "Nugraha", "Khannedy"},
                {"Joko", "Kurniawan"}
        };
        System.out.println(members[0][1]); //Kurniawan
        System.out.println(members[1][0]); //Budi
    }
}
