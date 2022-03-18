package no.noroff.nicholas.scenario1;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    // Dependency inversion violation, resolved with an interface.
    // open close Violation as well once you can't modify it.
    Sensor sensor = new Sensor();
    boolean alarmOn = false;

    // double responsibility, method to private
    public void check(){
        double psiPressureValue = sensor.popNextPressurePsiValue();

        if(psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue){
            alarmOn = true;
        }
    }

    public boolean isAlarmOn(){
        return alarmOn;
    }
}
