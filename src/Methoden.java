public class Methoden {

    // das ist eine neue Methode

    // Aufbau: Methodenkopf Methodenrumpf
    // Methodenkopf: "public" "static" Datentyp Methodenname "(" Parameterliste ")"
    // Methodenrumpf: "{" Anweisungen "}"
    // Datentyp: void (= Platzhalter für keinen Datentyp)
    // Parameterliste: Datentyp Parametername [, Datentyp Parametername ...]

    // Methodensignatur: Methodenname + Datentypen der Parameter
    // -> Überladen
    //    Mehrere Methoden mit gleichem Namen können existieren, solange sich
    //            ihre Methodensignatur unterscheidet

    // Methode mit Datentyp: Funktion (es wird was berechnet und zurück gegeben)
    // Methode ohne Datentyp: Prozedur (es wird einfach was gemacht)

    public static void ausgabe(int x, int y) {
        System.out.println("Ausgabe: " + x + ", " + y);
    }

    public static void ausgabe(double x) {
        System.out.println("Ausgabe (double): " + x);
    }

    // Call-By-Value (CbV)
    // -> Übergebene Wert lässt ein neue unabhängige Variable erstellen,
    //    jede Wertänderung dieser Variable hat keine Auswirkung auf den Aufrufer
    //    CbV gilt für alle primitiven Datentypen
    public static void ausgabe(int x) {         // x: formale Variable
        System.out.println("Ausgabe (int): " + x);
        x++;
    }

    public static void main(String[] args) {
        int x = 7;                              // x: lokale Variable
        ausgabe( x );
        System.out.println("Mein x ist " + x);
    }

}
