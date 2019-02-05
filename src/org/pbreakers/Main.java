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

            p1.setAdresse(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p2.setAdresse(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p3.setAdresse(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p4.setAdresse(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));
            p5.setAdresse(new Adresse("3011","kinkondja","gambela","lubumbashi","lubumbashi"));

            p1.setPhones(new Telephone("0991888702"), new Telephone("+243823020372"));
            p2.setPhones(new Telephone("0992145447"), new Telephone("+243999931399"));
            p3.setPhones(new Telephone("0991856321"), new Telephone("+243909009000"));
            p4.setPhones(new Telephone("0994445588"), new Telephone("+243823004007"));
            p5.setPhones(new Telephone("0991880902"), new Telephone("+243810550590"));

            p1.setEmail(new Email("jonathanyombo@gmail.com"));
            p2.setEmail(new Email("jonathanyombo@yahoo.com"));
            p3.setEmail(new Email("jonathanyombo@facebook.com"));
            p4.setEmail(new Email("jonathanyombo@outlook.com"));
            p5.setEmail(new Email("jonathanyombo@pbreakers.com"));

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
