public class OOPSBannerApp {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define String Array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O, O, P, S
        String[] lines = {
            String.join("  ", " OOOO ", " OOOO ", "PPPPPP", " SSSSS"),
            String.join("  ", "O    O", "O    O", "P    P", "S     "),
            String.join("  ", "O    O", "O    O", "PPPPPP", " SSSS "),
            String.join("  ", "O    O", "O    O", "P     ", "     S"),
            String.join("  ", " OOOO ", " OOOO ", "P     ", "SSSSS ")
        };

        // Use a loop to print each line of the banner to create the
        // visual effect for the message "OOPS"
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

