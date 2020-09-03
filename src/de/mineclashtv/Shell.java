package de.mineclashtv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Shell {

    final ProcessBuilder processBuilder;

    public Shell() {
        this.processBuilder = new ProcessBuilder();
    }

    public String execute(String command) {
        processBuilder.command("sh", "-c", command);

        try {
            Process process = processBuilder.start();
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null)
                output.append(line).append(System.lineSeparator());

            int exitCode = process.waitFor();
            if(exitCode == 0)
                return output.toString();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return null;
    }
}
