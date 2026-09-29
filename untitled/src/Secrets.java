public class Secrets {

    public static int shiftBack(int value, int places) {

        return value >>> places;
    }

    public static void main(String[] args) {

        int value = 0b1001;
        int places = 2;

        int result = shiftBack(value, places);

        System.out.println("Valor original: " + Integer.toBinaryString(value));
        System.out.println("Posiciones: " + places);
        System.out.println("Resultado: " + Integer.toBinaryString(result));
    }
}
