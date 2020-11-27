package Observer;

public class MessageSubscriber_Three implements Observer {
    @Override
    public void actualiser(MessageMeteo msg) {
        System.out.println("Message Sub THREE :: HUMD " + msg.getHumidite() + " PRESS " + msg.getPression() + " TEMP " + msg.getTemerature());

    }
}
