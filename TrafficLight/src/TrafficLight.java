public class TrafficLight {
    private LightState lightState;

    public TrafficLight() {
        setState(new RedLight());
    }

    public void setState(LightState lightState) {
        this.lightState = lightState;
        this.lightState.setTrafficLight(this);
    }

    public void whatColorIs() {
        this.lightState.whatColorIs();
    }

}
