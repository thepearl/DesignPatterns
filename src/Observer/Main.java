package Observer;

public class Main {
    public static void main(String[] args)
    {
        AffichageConditions s1 = new AffichageConditions();
        AffichagePrevisions s2 = new AffichagePrevisions();

        MessagePublisher p = new MessagePublisher();

        p.enregistrerObservateur(s1);
        p.enregistrerObservateur(s2);

        p.notifierObservateur(new MessageMeteo(25, 12,2));

        p.supprimerObservateur(s1);

        System.out.println();
        System.out.println("--- APRES SUPPRESSION DE SUB CONDITION ----");
        System.out.println();

        p.notifierObservateur(new MessageMeteo(21,14,2));
    }
}
