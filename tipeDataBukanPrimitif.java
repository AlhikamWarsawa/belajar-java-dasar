public class tipeDataBukanPrimitif {
    public static void main(String[] args) {
//        Tipe Data Bukan Primitif
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        //Byte iniByte;
        //System.out.println(iniByte); Error

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

//        Konversi Dari Tipe Primitif
        int iniInt = 100;
        Integer iniObject = iniInt;

        // short iniShort = iniInteger2; //Error
        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 1000L;
        amount.byteValue();

    }
}
