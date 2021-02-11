import java.util.Date;

public class Main {
    public static void main(String[] args) {

        int alter = 25;
        String vorname = "Sebastian";
        String nachname = "Pichler";
        char geschlecht = 'm';
        double notendurchschnitt = 1.5;
        boolean verheiratet = false;
        Date geburtstag = new Date(805388880000L);
        
        System.out.println("Mein Name ist " + vorname + " " + nachname + ".");
        System.out.println("Ich bin " + alter + " Jahre alt und am " + myBirthday + " geboren.");
        System.out.println("Mein Geschlecht ist " + geschlecht + " und ich habe einen Notendurchschnitt von " + notendurchschnitt + ".");
        System.out.println("Mein Status verheiratet ist " + verheiratet + ".");
    }
}
