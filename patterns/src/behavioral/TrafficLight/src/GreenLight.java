package behavioral.TrafficLight.src;

import java.util.Timer;
import java.util.TimerTask;

public class GreenLight implements LightState {

    private TrafficLight trafficLight;

    @Override
    public void whatColorIs() {
        System.out.println("- Green");
    }

    @Override
    public void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
        this.trafficLight.whatColorIs();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                GreenLight.this.trafficLight.setState(new YellowLight());
            }
        },7000);
    }
}
