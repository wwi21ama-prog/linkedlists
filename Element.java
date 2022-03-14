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

    /**
     * Prüft, ob dieses Element gültig ist.
     * Ein Element ist gültig, wenn der Nachfolger nicht null ist.
     * Dadurch können wir eine leere Liste erzeugen, indem wir einfach
     * ein ungültiges Element konstruieren.
     */
    public boolean isValid() {
        return next != null;
    }

    /**
     * Setzt die angegebenen Daten in diesem Element.
     * Das Element muss dadurch gültig werden.
     * Falls es bisher ungültig war, wird ein neues ungültiges Element angehängt.
     * Ansonsten werden einfach die bisherigen Daten überschrieben.
     */
    public void setData(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = isValid() ? next : new Element();
    }

    /**
     * Liefert die Länge der Liste, die ab diesem Element beginnt.
     */
    public int size() {
        return isValid() ? 1 + next.size() : 0;
    }
}