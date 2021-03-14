package interfaces;

public interface Pet {
    String NAME = "PET";

    String getName();

    String makeSound();

    default String getColor() {
        return "BROWN";
    }

    default String phrase() {
        logPhraseCall();
        return getName() + ":" + makeSound();
    }

    private void logPhraseCall() {
        System.out.println("phrase method was called");
    }
}