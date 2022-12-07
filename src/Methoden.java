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

    // Call-By-Reference (CbR)
    // -> Übergebene Variable wird einem weiteren Namen zugeordnet, aber
    //    es handelt sich um die selbe Variable (Speicherstelle)
    //    jede Wertänderung dieser Variable hat Auswirkung auf den Aufrufer !!
    //    CbR gilt für alle komplexen Datentypen (nicht primitive)
    public static void ausgabe(int[] array) {
        System.out.println("Ausgabe (int[]): " + array[0]);
        array[0] += 10;
    }

    // Funktionen, die etwas berechnen


    public static void main(String[] args) {
        int x = 7;                              // x: lokale Variable
        ausgabe( x );
        System.out.println("Mein x ist " + x);

        int[] integerFeld = { 1, 2, 3, 4, 5 };
        ausgabe( integerFeld );
        System.out.println("Wert an der Stelle 0: " + integerFeld[0]);
    }

}
