package Observer;

public class AffichagePrevisions implements Observer{
    static  float moyTemp = 1;
    static float maxTemp = 0;
    static float minTemp = 100;
    static  int n = 1;
    AffichagePrevisions(){
        n++;
    }
    @Override
    public void actualiser(MessageMeteo msg) {
        // Setting MoyTemp
        moyTemp = msg.getTemerature() / n;

        //Setting MaxTemp
        if (this.maxTemp < msg.getTemerature())
        {
            this.maxTemp = msg.getTemerature();
        }

        //Setting MinTemp
        if (this.minTemp > msg.getTemerature())
        {
            this.minTemp = msg.getTemerature();
        }

        System.out.println("Previsions TEMP :: MOY: " + this.moyTemp + " MAX: " + this.maxTemp + " MIN: " + this.minTemp );
    }
}
