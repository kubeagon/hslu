import java.util.HashMap;

public class Aufgabe8 {

    public static void main(String[] args) {

        /**
         * A HashMap data structure that stores football team (FussballManschaft) objects using 
         * String keys as identifiers. This allows for efficient O(1) lookup, insertion, and 
         * deletion of teams by their name or unique identifier.
         * 
         * Key: String - typically the team name or identifier
         * Value: FussballManschaft - the football team object containing team information
         */
        HashMap<String, FussballManschaft> mannschaften = new HashMap<>();

        FussballManschaft fcLuzern = new FussballManschaft("FC Luzern", "Luzern", 2000000.0);
        FussballManschaft fcBasel = new FussballManschaft("FC Basel", "Basel", 1000000.0);

        mannschaften.put("fcLuzern", fcLuzern);
        mannschaften.put("fcBasel", fcBasel);

        System.out.println(mannschaften.isEmpty());

        System.out.println(mannschaften.keySet()); // prints all keys in the map

        for (String key : mannschaften.keySet()) { // also prints all keys in the map
            System.out.println(key);
        }

        System.out.println("Namen und Ortschaften:");

        for (String key : mannschaften.keySet()) {
            FussballManschaft team = mannschaften.get(key); // gets the instance from the map
            System.out.println("Name: " + team.getName() + " Ort: " + team.getOrt()); // uses the instance to get the name and ort
        }

        System.out.println("Namen und Ortschaften:");
        System.out.println("Name: " + fcBasel.getName() + " Ort: " + fcBasel.getOrt());
    }
}
