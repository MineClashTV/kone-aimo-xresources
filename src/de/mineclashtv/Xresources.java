package de.mineclashtv;

public class Xresources {

    public static String getColor(int color) {
        String exec = new Shell().execute("xrdb -query | grep '*.color" + color + "' | awk '{print $NF}' | sed 's/#//g'");
        return exec.split(System.lineSeparator())[0];
    }
}
