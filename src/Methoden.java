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
    public static double berechnungQuadrat(double x) {
        double ergebnis = x * x;
        // gib das ergebnis als Rückgabewert der Methode zurück
        System.out.println("Das Ergebnis ist " + ergebnis);
        return ergebnis;
    }

    // Berechne: n*(n-1)*(n-2)* ... 1
    public static long fakultät(long n) {
        // Berechnung, wo man akkumulieren muss
        long produkt = 1;
        for (int zahl=1; zahl <= n; zahl++) {
            produkt = produkt * zahl;
        }
        return produkt;
    }

    public static long fakultät_rekursiv(long n) {
        if (n == 0) return 1;
        return n * fakultät_rekursiv(n - 1);
    }


    // globale Variable (alle Methoden können darauf zugreifen)
    public static long methodenAufrufZähler;

    // Berechne: fibo(n) = fibo(n-1) + fibo(n-2)
    public static long fibonacci(long n) {
        methodenAufrufZähler++;
        if (n <= 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int x = 7;                              // x: lokale Variable
        ausgabe( x );
        System.out.println("Mein x ist " + x);

        int[] integerFeld = { 1, 2, 3, 4, 5 };
        ausgabe( integerFeld );
        System.out.println("Wert an der Stelle 0: " + integerFeld[0]);

        double wert = 17;
        double berechneterWert = berechnungQuadrat(wert);
        System.out.println("Als Ergebnis wurde berechnet: " + berechneterWert);

        System.out.println("fakultät von 6: " + fakultät(6) );
        System.out.println("fakultät von 17: " + fakultät(17) );
        System.out.println("fakultät(rek) von 17: " + fakultät_rekursiv(17));

        methodenAufrufZähler = 0;
        long startTime = System.nanoTime();
        System.out.println("fibo(6): " + fibonacci(6));
        long diffTime = System.nanoTime() - startTime;
        System.out.println("Anzahl fibo-Aufrufe: " + methodenAufrufZähler);
        System.out.println("in " + diffTime + "ns");

        methodenAufrufZähler = 0;
        startTime = System.nanoTime();
        System.out.println("fibo(50): " + fibonacci(50));
        diffTime = System.nanoTime() - startTime;
        System.out.println("Anzahl fibo-Aufrufe: " + methodenAufrufZähler);
        System.out.println("in " + diffTime + "ns");
    }

}
