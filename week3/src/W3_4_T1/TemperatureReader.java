package W3_4_T1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TemperatureReader {
    public static void main(String[] args) {
        String fileUrl = "https://users.metropolia.fi/~jarkkov/temploki.csv";
        List<Double> temperatures = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new URL(fileUrl).openStream()))) {
            System.out.println("Calculating The Average Temperature on 01.01.2023 ...");
            String line;

            while ((line = br.readLine()) != null) {
                try {
                    String[] columns = line.split(";");
                    String date = columns[0];
                    String ulkoTalo = columns[1];

                    // System.out.printf("%-20s || %s °C%n", date, ulkoTalo);
                    double temperature = Double.parseDouble(ulkoTalo.replace(",", "."));

                    if (date.contains("01.01.2023")) {
                        temperatures.add(temperature);
                    } else {
                        break;
                    }
                } catch (NumberFormatException ignored){}

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        double averageTemperature = temperatures.stream().mapToDouble(Double::doubleValue).average().orElse(Double.NaN);
        System.out.printf("Average temperature on 01.01.2023: %.2f °C%n", averageTemperature);
    }
}