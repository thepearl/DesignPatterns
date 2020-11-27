package Observer;

public interface Subject {
    public void enregistrerObservateur(Observer o);
    public void supprimerObservateur(Observer o);
    public void notifierObservateur(MessageMeteo m);
}
