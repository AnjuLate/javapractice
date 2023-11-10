public class LongdataToShortdata {
    public static void main(String[] args) {
        long longV = 30000;
        short shortV = (short) longV;
        System.out.println("Original long value: " + longV);
        System.out.println("Converted short value: " + shortV);
    }
}
