// PalmerPenguinsM2.java
// Ashanti Hill
// May 24, 2026
// Program to calculate and display Palmer Penguin statistics

public class PalmerPenguinsM2 {

    // constants to represent the species and count
    static final String SP_CHINSTRAP = "Chinstrap";
    static final String SP_GENTOO = "Gentoo";
    static final String SP_ADELIE = "Adelie";
    
    static final int TOTAL_SPECIES =3;
    
    static final int NUM_CHINSTRAP=68;
    static final int NUM_GENTOO=123;
    static final int NUM_ADELIE=151;


    public static void main(String[] args) {
    
        int totalPenguins= NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;
    
    // output the species names with intro text
        System.out.println("Introducing the Palmer Penguins: ");
        System.out.println("\t" + SP_CHINSTRAP + "!");
        System.out.println("\t" + SP_GENTOO + "!");
        System.out.println("and last but not least...");
        System.out.println("\t" + SP_ADELIE + "!");
        System.out.println("There are a total of " + TOTAL_SPECIES +
                       "penguin species in this dataset.");
        
        System.out.printf("%s:%d(%.2f%%)\n", "Chinstrap", 68, 19.88);
        System.out.printf("%s:%d(%.2f%%)\n", "Gentoo", 68, 19.88);
        System.out.printf("%s:%d(%.2f%%)\n", "Adelie", 68, 19.88);

    }
}
