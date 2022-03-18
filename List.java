public class List {

  Element head;

  /** Konstruktor, erzeugt eine leere Liste. */
  List() {
    head = new Element();
  }
  
  // Öffentliches Interface einer Listenklasse:

  /** Hängt ein Element mit den angegebenen Daten am Ende der Liste an. */
  public void add(int key, int value) {
    //head.getEnd().setData(key, value);
    head.add(key,value);
  }

  /** Liefert die Länge der Liste. */
  public int size() {
    return head.size();
  }

  /** Vertauscht zwei Elemente */
  public void swap(int i, int j) {
    // Fehlerüberprüfung
    if (i < 0 || j < 0) { return; }

    // An Element (head) delegieren, falls swap dort korrekt arbeitet.
    if (i > 0 && j > 0) {
      head.swap(i,j);
      return;
    }

    // i oder j sind 0
    if (i == 0) {
      /* Liste:
         (head ->)     B -> C -> ... -> D -> E -> F -> ...
  
        Ziel: Vertauschen von B und E.
       */
  
      Element B = head.get(i); // Unnötig, das Element heißt schon head.
      Element E = head.get(j);
      
      Element C = B.next;
      Element D = head.get(j-1);
      Element F = E.next;
  
      B.next = F;
      E.next = C;
      D.next = B;
      // B = E; // Unnötig
      head = E;

      // Alternative, evtl. einfachere Möglichkeit:
      // Ein künstliches Element erzeugen und head als next anhängen.
      // Dann "normal" Element.swap() benutzen.
      // Aus dieser Liste das geeignete Element holen und hier als head wieder einsetzen.
      
    } else { // j == 0
      swap(j,i);
    }
  }
}