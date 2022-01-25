package chegg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bash {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        ProcessBuilder processBuilder = new ProcessBuilder();
//        processBuilder.command("bash", "-c", "ls -ltr /home/cavisson/");
        processBuilder.command("bash", "-c", "ping google.com");
        try {
            Process process = processBuilder.start();
            StringBuilder output = new StringBuilder();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            String line;
            Long l = Long.valueOf(0);

            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
            int exitVal = process.waitFor();
            if (exitVal == 0) {
                System.out.println("Success!");
                System.out.println(output);
                System.exit(0);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}