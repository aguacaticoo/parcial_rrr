
public class SqueakyClean {

    public static String clean(String input) {

        return input.replace(' ', '_');
    }

    public static void main(String[] args) {

        String name = "my   Id";

        String result = clean(name);

        System.out.println("Original: " + name);
        System.out.println("Limpio: " + result);
    }
}
