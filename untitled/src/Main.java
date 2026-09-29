
// Clase padre
class Fighter {

    public boolean isVulnerable() {
        return true;
    }

    public int getDamagePoints(Fighter fighter) {
        return 0;
    }
}


// Clase hija: Warrior
class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}


// Clase hija: Wizard
class Wizard extends Fighter {

    private boolean spellPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (spellPrepared) {
            return 12;
        } else {
            return 3;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();

        // Warrior
        System.out.println(warrior);
        System.out.println("¿Warrior vulnerable? " + warrior.isVulnerable());

        System.out.println("Warrior ataca a Wizard: "
                + warrior.getDamagePoints(wizard));

        System.out.println();

        // Wizard antes de preparar el hechizo
        System.out.println(wizard);
        System.out.println("¿Wizard vulnerable? " + wizard.isVulnerable());

        System.out.println("Wizard ataca a Warrior: "
                + wizard.getDamagePoints(warrior));

        System.out.println();

        // Wizard prepara el hechizo
        wizard.prepareSpell();

        System.out.println("Wizard prepara el hechizo...");
        System.out.println("¿Wizard vulnerable? " + wizard.isVulnerable());

        System.out.println("Wizard ataca a Warrior: "
                + wizard.getDamagePoints(warrior));
    }
}
