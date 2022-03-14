/**
 * Datentyp für Elemente einer verketteten Liste.
 */
public class Element {
    /*
     * Attribute:
     *   - Schlüssel: Hiernach wird später sortiert werden.
     *   - Wert: Die eigentlichen Daten der Elemente.
     * 
     *     (Diese beiden Einträge sind nur für den Anfang int.
     *      Später werden wir sie durch sinnvollere Daten ersetzen.)
     *   
     *   - next: Der Nachfolger des aktuellen Elements in der Liste.
     */
    int key;
    int value;
    
    Element next;

    /**
     * Methode für die String-Ausgabe.
     * Durch die Existenz dieser Funktion gibt System.out.println()
     * nicht nur eine Adresse aus, sondern wirklich das Schlüssel-Wert-Paar.
     */
    public String toString() {
        return "(" + key + "," + value + ")";
    }
}