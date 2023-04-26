package behavioral.TrafficLight.src;

import java.util.Timer;
import java.util.TimerTask;

public class YellowLight implements LightState {

    private TrafficLight trafficLight;

    @Override
    public void whatColorIs() {
        System.out.println("- Yellow");
    }

    @Override
    public void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
        this.trafficLight.whatColorIs();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                YellowLight.this.trafficLight.setState(new RedLight());
            }
        },7000);
    }
}
