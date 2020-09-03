package de.mineclashtv;

public class ArgumentParser {

    private static final String ls = System.lineSeparator();

    public static void doShit(String[] args) {
        for(int i = 0; i < args.length; i++)
            switch (args[i]) {
                case "--dev": Main.dev = args[i + 1]; break;
                case "--primary": Main.primary = Integer.parseInt(args[i + 1]); break;
                case "--secondary": Main.secondary = Integer.parseInt(args[i + 1]); break;
                case "--help": System.out.println(
                        "This program sets the colors of a Roccat Kone Aimo mouse to your Xresources." + ls +
                                "Options: " + ls +
                                "--dev          Device to use, e.g. /dev/hidraw2" + ls +
                                "--primary      Set primary color, first 8 Xresources valid" + ls +
                                "--secondary    Set secondary color, first 8 Xresources valid"
                );
                System.exit(0);
            }
    }
}
