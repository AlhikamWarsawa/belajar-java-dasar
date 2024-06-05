public class konversiNumber {
    public static void main(String[] args) {

//        Otomatis
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

//        Manual
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

        // 1000 akan terkena overflow dan terus berulang dari 1 - 127 karena tipe data byte
    }
}
