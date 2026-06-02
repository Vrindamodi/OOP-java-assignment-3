interface Speaker {
    void speak(String text);
}

interface Translator {
    void translate(String text, String language);
}

class AIAssistant implements Speaker, Translator {

    @Override
    public void speak(String text) {
        System.out.println("Assistant speaking: \"" + text + "\"");
    }

    @Override
    public void translate(String text, String language) {
        System.out.println("Original (English): " + text);

        String translated;
        if (language.equalsIgnoreCase("Hindi")) {
            translated = "Namaste, aap kaise hain?";
        } else if (language.equalsIgnoreCase("Spanish")) {
            translated = "Hola, como estas?";
        } else if (language.equalsIgnoreCase("French")) {
            translated = "Bonjour, comment allez-vous?";
        } else {
            translated = "[Translation not available for " + language + "]";
        }

        System.out.println("Translated (" + language + "): " + translated);
    }
}

public class AIPoweredAssistant {
    public static void main(String[] args) {
        AIAssistant assistant = new AIAssistant();

        assistant.speak("Hello, how are you?");
        System.out.println();

        assistant.translate("Hello, how are you?", "Hindi");
        System.out.println();

        assistant.translate("Hello, how are you?", "Spanish");
    }
}
