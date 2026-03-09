public class UC7{
static class CharacterPatternMap {
    /** The character being represented */
    Character character;
    /** The ASCII art pattern lines for the character */
    String[] pattern;

    /**
     * Constructs a CharacterPatternMap with a character and its pattern
     * 
     * @param character the character to be mapped
     * @param pattern the ASCII art pattern representation as array of strings
     */
    public CharacterPatternMap(Character character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    /**
     * Retrieves the mapped character
     * 
     * @return the character associated with this pattern map
     */
    public Character getCharacter() {
        return character;
    }

    /**
     * Retrieves the ASCII art pattern
     * 
     * @return the pattern array representing the character
     */
    public String[] getPattern() {
        return pattern;
    }
}

/**
 * Static Method to Create and initializes CharacterPatternMap array for predefined characters
 * 
 * Populates pattern maps for letters 'O', 'P', 'S' and space character.
 * Each character has a 7-line ASCII art representation.
 * 
 * @return array of CharacterPatternMap objects containing character patterns
 */
public static CharacterPatternMap[] createCharacterPatternMaps() {
    return new CharacterPatternMap[] {
        new CharacterPatternMap('O', new String[] {
            "  OOO  ", " O   O ", " O   O ", " O   O ", " O   O ", " O   O ", "  OOO  "
        }),
        new CharacterPatternMap('P', new String[] {
            " PPPP  ", " P   P ", " P   P ", " PPPP  ", " P     ", " P     ", " P     "
        }),
        new CharacterPatternMap('S', new String[] {
            "  SSSS ", " S     ", " S     ", "  SSS  ", "     S ", "     S ", " SSSS  "
        }),
        new CharacterPatternMap(' ', new String[] {
            "       ", "       ", "       ", "       ", "       ", "       ", "       "
        })
    };
}

/**
 * Retrieves the ASCII pattern for a given character
 * 
 * Searches through the character pattern maps to find a matching character.
 * If the character is not found, recursively returns the pattern for space character.
 * 
 * @param ch        the character to look up
 * @param charMaps  the array of CharacterPatternMap objects to search through
 * @return the pattern array for the given character, or space pattern if not found
 */
public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
    for (CharacterPatternMap map : charMaps) {
        if (Character.toUpperCase(map.getCharacter()) == Character.toUpperCase(ch)) {
            return map.getPattern();
        }
    }
    // If not found and we aren't already looking for a space, look for the space pattern
    if (ch != ' ') {
        return getCharacterPattern(' ', charMaps);
    }
    return null; // Fallback if space isn't in the map
}

/**
 * Prints a message as a banner using ASCII art patterns
 * 
 * Renders the entire message horizontally by combining individual character
 * patterns line by line. Characters are separated by spacing for readability.
 * 
 * @param message   the message string to be displayed as a banner
 * @param charMaps  the array of CharacterPatternMap objects containing available patterns
 */
public static void printMessage(String message, CharacterPatternMap[] charMaps) {
    // We assume 7 lines high based on the requirements
    for (int i = 0; i < 7; i++) {
        for (char ch : message.toCharArray()) {
            String[] pattern = getCharacterPattern(ch, charMaps);
            if (pattern != null) {
                // Print the current line of the character pattern plus some padding
                System.out.print(pattern[i] + "  ");
            }
        }
        // Move to the next line after all characters' current lines are printed
        System.out.println();
    }
}
public class OOPSBannerApp {

    /**
     * CharacterPatternMap - Inner class for storing character-to-pattern mappings
     */
    static class CharacterPatternMap {
        Character character;
        String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    /**
     * Initializes the pattern maps for 'O', 'P', 'S' and space.
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[] {
                "  OOO  ", " O   O ", " O   O ", " O   O ", " O   O ", " O   O ", "  OOO  "
            }),
            new CharacterPatternMap('P', new String[] {
                " PPPP  ", " P   P ", " P   P ", " PPPP  ", " P     ", " P     ", " P     "
            }),
            new CharacterPatternMap('S', new String[] {
                "  SSSS ", " S     ", " S     ", "  SSS  ", "     S ", "     S ", " SSSS  "
            }),
            new CharacterPatternMap(' ', new String[] {
                "       ", "       ", "       ", "       ", "       ", "       ", "       "
            })
        };
    }

    /**
     * Searches for a character pattern; defaults to space if not found.
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (Character.toUpperCase(map.getCharacter()) == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        // Recursive fallback to space if character isn't found
        return (ch != ' ') ? getCharacterPattern(' ', charMaps) : null;
    }

    /**
     * Renders the message horizontally line by line.
     */
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {
        for (int i = 0; i < 7; i++) { // Loop through each of the 7 lines
            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, charMaps);
                if (pattern != null) {
                    System.out.print(pattern[i] + "  "); // Added padding between letters
                }
            }
            System.out.println(); // Move to next line
        }
    }

    /**
     * Main method - Entry point for the banner display application
     */
    public static void main(String[] args) {
        // Create CharacterPatternMap array
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        
        // Define the message to be displayed
        String message = "OOPS";
        
        // Print the banner message
        printMessage(message, charMaps);
    }
}
}