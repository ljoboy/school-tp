package org.pbreakers;

public class Main {

    public static void main(String[] args) {
        Personne p1, p2, p3, p4, p5;
        try {
            p1 = new Personne("Dark Angel");
            p2 = new Personne("Lijerbul");
            p3 = new Personne("LJOBOY");
            p4 = new Personne("Jonathan");
            p5 = new Personne("Josiane");

            p1.adresses.add(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p2.adresses.add(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p3.adresses.add(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p4.adresses.add(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p5.adresses.add(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));

            p1.phones.add(new Telephone("0991888702"));
            p1.phones.add( new Telephone("+243823020372"));
            p2.phones.add(new Telephone("0992145447") );
            p2.phones.add(new Telephone("+243999931399"));
            p3.phones.add(new Telephone("0991856321") );
            p3.phones.add(new Telephone("+243909009000"));
            p4.phones.add(new Telephone("0994445588") );
            p4.phones.add(new Telephone("+243823004007"));
            p5.phones.add(new Telephone("0991880902"));
            p5.phones.add( new Telephone("+243810550590"));

            p1.email.add(new Email("jonathanyombo@gmail.com"));
            p2.email.add(new Email("jonathanyombo@yahoo.com"));
            p3.email.add(new Email("jonathanyombo@facebook.com"));
            p4.email.add(new Email("jonathanyombo@outlook.com"));
            p5.email.add(new Email("jonathanyombo@pbreakers.com"));

            Carnet c1 = new Carnet(p1);
            Carnet c2 = new Carnet(p2);

            c1.contacts.add(p2);
            c1.contacts.add(p3);
            c1.contacts.add(p4);
            c1.contacts.add(p5);
            c2.contacts.add(p1);
            c2.contacts.add(p3);
            c2.contacts.add(p4);
            c2.contacts.add(p5);

        } catch (ValeurErroneeException e) {
            System.out.println("Erreur !");
        }
    }
}
