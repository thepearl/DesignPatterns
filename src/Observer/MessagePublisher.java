package Observer;
import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void enregistrerObservateur(Observer o) {
        observers.add(o);
    }

    @Override
    public void supprimerObservateur(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifierObservateur(MessageMeteo m) {
        for(Observer o: observers) {
            o.actualiser(m);
        }
    }
}
