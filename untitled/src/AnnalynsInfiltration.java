
public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {

        return !knightIsAwake;
    }

    public static void main(String[] args) {

        boolean knightIsAwake = true;

        System.out.println("Caballero despierto: " + knightIsAwake);
        System.out.println("¿Puede hacer ataque rápido? "
                + canFastAttack(knightIsAwake));

        knightIsAwake = false;

        System.out.println();
        System.out.println("Caballero despierto: " + knightIsAwake);
        System.out.println("¿Puede hacer ataque rápido? "
                + canFastAttack(knightIsAwake));
    }
}

