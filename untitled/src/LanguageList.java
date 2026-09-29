import java.util.ArrayList;
import java.util.List;

public class LanguageList {

    private List<String> languages = new ArrayList<>();

    // Verifica si la lista está vacía
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    // Agrega un lenguaje
    public void addLanguage(String language) {
        languages.add(language);
    }

    // Elimina un lenguaje
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    // Devuelve el primer lenguaje
    public String firstLanguage() {
        return languages.get(0);
    }

    // Devuelve la cantidad de lenguajes
    public int count() {
        return languages.size();
    }

    // Verifica si un lenguaje está en la lista
    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    // Verifica si contiene Java o Kotlin
    public boolean isExciting() {
        return languages.contains("Java")
                || languages.contains("Kotlin");
    }



    public static void main(String[] args) {

        LanguageList languageList = new LanguageList();

        System.out.println("¿Está vacía? " + languageList.isEmpty());

        languageList.addLanguage("Kotlin");
        languageList.addLanguage("Python");
        languageList.addLanguage("Scala");

        System.out.println("Cantidad: " + languageList.count());
        System.out.println("Primer lenguaje: " + languageList.firstLanguage());

        System.out.println("¿Está Python? "
                + languageList.containsLanguage("Python"));

        System.out.println("¿Está Ruby? "
                + languageList.containsLanguage("Ruby"));

        System.out.println("¿Es emocionante? "
                + languageList.isExciting());

        languageList.removeLanguage("Scala");

        System.out.println("Cantidad después de eliminar Scala: "
                + languageList.count());
    }
}