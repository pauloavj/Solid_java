package no.noroff.nicholas.scenario2;

import java.util.Random;

public class Sensor implements GetPressure {
    public static final double OFFSET = 16;

    @Override
    public double popNextPressurePsiValue(){
        double pressureTelemetryValue;
        pressureTelemetryValue = samplePressure();
        return OFFSET + pressureTelemetryValue;
    }

    private double samplePressure() {
        Random basicRandomNumbersGenerator = new Random();
        double pressureTelemetryValue = 6 * basicRandomNumbersGenerator.nextDouble() * basicRandomNumbersGenerator.nextDouble();
        return pressureTelemetryValue;
    }
}
