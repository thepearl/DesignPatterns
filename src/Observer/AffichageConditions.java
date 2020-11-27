package Observer;

public class AffichageConditions implements Observer{

    @Override
    public void actualiser(MessageMeteo msg) {
        System.out.println("Conditions :: HUMD " + msg.getHumidite() + " PRESS " + msg.getPression() + " TEMP " + msg.getTemerature());
    }
}
