import java.util.Timer;
import java.util.TimerTask;

public class RedLight implements LightState {

    private TrafficLight trafficLight;

    @Override
    public void whatColorIs() {
        System.out.println("- Red");
    }

    @Override
    public void setTrafficLight(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
        this.trafficLight.whatColorIs();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                RedLight.this.trafficLight.setState(new GreenLight());
            }
        },7000);
    }
}
