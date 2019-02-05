package org.pbreakers;

public class Personne {

    private String nom_complet;
    private Adresse adresse;
    private Telephone phone1;
    private Telephone phone2;
    private PageWeb website;
    private Email email;

    Personne(String nom) throws ValeurErroneeException{
        if (nom.equals("")){
            throw new ValeurErroneeException(nom);
        }else{
            this.nom_complet = nom;
        }
    }

    public void setPhones(Telephone num1, Telephone num2){
        this.setPhone1(num1);
        this.setPhone2(num2);
    }

    public String getNom_complet() {
        return nom_complet;
    }

    public void setNom_complet(String nom_complet) {
        this.nom_complet = nom_complet;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Telephone getPhone1() {
        return phone1;
    }

    public void setPhone1(Telephone phone1) {
        this.phone1 = phone1;
    }

    public Telephone getPhone2() {
        return phone2;
    }

    public void setPhone2(Telephone phone2) {
        this.phone2 = phone2;
    }


    public PageWeb getWebsite() {
        return website;
    }

    public void setWebsite(PageWeb website) {
        this.website = website;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

}
