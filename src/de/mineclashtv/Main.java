package de.mineclashtv;

import java.util.ArrayList;

public class Main {

    public static int primary = 1, secondary = 5;
    public static String dev = "/dev/hidraw2";
    private static final ArrayList<String> colors = new ArrayList<>();
    private static Shell shell = new Shell();

    public static void main(String[] args) {
        ArgumentParser.doShit(args);

        System.out.println("Using device " + dev);
        System.out.println("Reading Xresources...");

        // Get first 8 colors from Xresources.
        for(int i = 0; i < 8; i++) {
            String color = Xresources.getColor(i);
            colors.add(color);
            //System.out.println(((i == primary) || (i == secondary)) ? (i + ": " + color + ((i == primary) ? " [primary color]" : " [secondary color]")) : (i + ": " + color));
        }

        // This is utterly stupid and should be replaced with a loop
        String primaryColor = colors.get(primary).substring(0, 2) + " " +
                colors.get(primary).substring(2, 4) + " " +
                colors.get(primary).substring(4, 6);
        String secondaryColor = colors.get(secondary).substring(0, 2) + " " +
                colors.get(secondary).substring(2, 4) + " " +
                colors.get(secondary).substring(4, 6);

        /*  This requires the roccat_kone_aimo_rgb_tool executable in the same run directory
         *  LEDs:
         *      wheel
         *      left strip top
         *      left strip below top
         *      left strip above bottom
         *      left strip bottom
         *      right strip top
         *      right strip below top
         *      right strip above bottom
         *      right strip bottom
         *      left lower side
         *      right lower side */
        shell.execute("sudo ./roccat_kone_aimo_rgb_tool " + dev + " " +
                primaryColor + " " +
                primaryColor + " " +
                primaryColor + " " +
                secondaryColor + " " +
                secondaryColor + " " +
                primaryColor + " " +
                primaryColor + " " +
                secondaryColor + " " +
                secondaryColor + " " +
                secondaryColor + " " +
                secondaryColor
        );
    }
}