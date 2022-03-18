package no.noroff.nicholas.scenario2;

public class Alarm {
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;
    private boolean alarmOn = false;

    private void check(GetPressure sensor){
        double psiPressureValue = sensor.popNextPressurePsiValue();
        if(psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue){
            alarmOn = true;
        }
    }

    public boolean isAlarmOn(GetPressure sensor){
        check(sensor);
        return alarmOn;
    }
}
