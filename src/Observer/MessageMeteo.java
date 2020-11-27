package Observer;

import java.util.ArrayList;

public class MessageMeteo {
    float temperature;
    float humidite;
    float pression;
    ArrayList observateurs;

    public float getTemerature(){
        return this.temperature;
    }

    public float getHumidite(){
        return this.humidite;
    }

    public float getPression(){
        return this.pression;
    }

    public MessageMeteo(float temperature, float humidite, float pression){
        this.temperature = temperature;
        this.humidite = humidite;
        this.pression = pression;
    }
}
