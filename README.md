# Beispiele zu verketteten Listen

## Beschreibung

In diesem Repo wird eine Klasse `Element` für Daten in verketteten Listen definiert.

Jedes `Element` besteht aus drei Feldern: Einem Schlüssel, einem Wert und einem
Nachfolger. Schlüssel und Wert sind die eigentlichen Daten.
Diese werden wir später noch allgemeiner/flexibler gestalten.
Der Nachfolger ist selbst wieder vom Typ `Element`.

Der grunsätzliche Ansatz ist dabei, dass das Einde einer Liste immer 
durch ein `Element` ohne Nachfolger dargestellt wird.
Dieses Element nennen wir "ungültig" oder ein "Dummy-Element".
Eine leere Liste besteht nur aus einem solchen Element.

Ein neues Element wird an die Liste angehängt,
indem das Dummy-Element am Ende mit Daten befüllt und anschließend ein neues 
Dummy-Element angehängt wird.

In der Datei `Main.java` sind Demo-Funktionen definiert,
die den Umgang mit derartigen Listen zeigen sollen. Jede dieser Funktionen definiert
als allererstes ein leeres Listenelement, dann werden Elemente angehängt.
Die Funktionen sind nummeriert und zeigen, wie man eine Liste mit Grundfunktionen
aufbauen und verwalten kann und wie man sich diese Aufgabe mit weiteren Hilfsfunktionen
vereinfachen kann.

## Aufgaben

 In der Datei `Element.java` sind ganz unten einige Aufgaben formuliert.
 Diese Aufgaben sollen im Rahmen der Vorlesung gelöst werden.
 Anschließend nehmen wir dies als Basis für eine weitere Erweiterung der Liste.
 Außerdem werden wir auf Basis dieser Listenimplementierung auch einige der
 Sortierverfahren aus der Vorlesung umsetzen.
