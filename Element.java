



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
        this.next = isValid() ? this.next : new Element();
    }

    /**
     * Liefert die Länge der Liste, die ab diesem Element beginnt.
     */
    public int size() {
        return isValid() ? 1 + next.size() : 0;
    }

    /**
     * Liefert das ungültige Element am Ende der Liste.
     */
    public Element getEnd() {
        return isValid() ? next.getEnd() : this;
    }

    /**
     * Hängt ein neues Element mit den gegebenen Daten am Ende der Liste an.
     */
    public void add(int key, int value) {
        getEnd().setData(key, value);
    }

    /**
     * Liefert einen String, der die String-Repräsentationen aller Elemente enthält.
     * Die einzelnen Elemente sind mit Komma getrennt.
     */
    public String allElementsToString() {
        if (!isValid()) {
            return "";
        }
        String result = toString();
        if (next.isValid()) {
            result += "," + next.allElementsToString();
        }
        return result;
    }

    /* AUFGABEN */

    /**
     * Fügt ein Element mit den angegebenen Daten zwischen this und seinem
     * Nachfolger ein. Diese Methode funktioniert nur mit gültigen Elementen.
     * 
     * (Bei ungültigen Elementen würde man das neue Element möglicherweise vor this
     *  einfügen wollen. Wir haben aber an diese Stelle keine Informationen über den
     *  Vorgänger zur Verfügung. Hierfür wäre eine doppelt verkettete Liste hilfreich.)
     */
    public void insert(int key, int value) {
        // TODO

        // Hinweis: Erzeugen Sie ein neues Element mit den angegebenen Daten.
        //          Setzen Sie anschließend dessen Nachfolger passend und hängen
        //          Sie es als Nachfolger von this in die Liste.
    }

    /**
     * Liefert das i-te Element der Liste.
     * Liefert null, falls dieses Element nicht existiert.
     */
    public Element get(int i) {
        // Behandlung ungültiger Eingaben.
        if (i < 0) { return null; }

        // Fall 1: Die Liste ist leer.
        if (!this.isValid()) { return null; } 

        // Fall 2: Die Liste ist ein gültiges Element und next ist eine Liste
        if (i == 0) { return this; } // 2a: Es wurde nach Head gefragt, this ist Head.
        return next.get(i-1);        // 2b: Es wurde nach einem Element in Tail gefragt.

      /* Alternativ für Fall 2:
        return i==0 ? this : next.get(i-1);
       */
    }

    /**
     * Vertauscht die Elemente an den Stellen i und j.
     * Hat keinen Effekt, wenn eine der Stellen nicht existiert.
     * Garantiert Adressstabilität, d.h. es werden keine Werte kopiert,
     * sondern nur die next-Zeiger der Listenelemente geändert.
     */
    public void swap(int i, int j) {
        // TODO

        // Hinweis: Holen Sie sich zuerst die beiden Elemente sowie deren
        //          Vorgänger und Nachfolger. Anschließend können Sie die
        //          Vertauschung einfach durchführen.
    }
}