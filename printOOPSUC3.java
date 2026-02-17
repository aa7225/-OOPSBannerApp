public class OOPSBannerApp {

    public static void main(String[] args) {
        // Construct and print each line of the "OOPS" banner
        // using String.join(" ", ...) for efficiency and readability.
        
        System.out.println(String.join(" ", "  ***  ", "  ***  ", " ***** ", "  **** "));
        System.out.println(String.join(" ", " **  ** ", " **  ** ", " **  **", " **    "));
        System.out.println(String.join(" ", "**    **", "**    **", " **  **", "  ***  "));
        System.out.println(String.join(" ", "**    **", "**    **", " ***** ", "    ** "));
        System.out.println(String.join(" ", "**    **", "**    **", " **    ", "     **"));
        System.out.println(String.join(" ", " **  ** ", " **  ** ", " **    ", " **  **"));
        System.out.println(String.join(" ", "  ***  ", "  ***  ", " **    ", "  **** "));
    }
}
