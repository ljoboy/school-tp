package org.pbreakers;

public class Adresse extends Coordonnee {
    private String numero;
    private String avenue;
    private String quartier;
    private String commune;
    private String ville;

    Adresse(String num, String av, String quart, String com, String vil){
        try{
            this.setNumero(num);
            this.setAvenue(av);
            this.setQuartier(quart);
            this.setCommune(com);
            this.setVille(vil);
        }catch(ValeurErroneeException e){
            System.out.println("Adresse Inavalide : ");
        }

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws ValeurErroneeException{
        if (numero.equals("")){
            throw new ValeurErroneeException();
        }else{
            this.numero = numero;
        }
    }

    public String getAvenue() {
        return avenue;
    }

    public void setAvenue(String avenue) throws ValeurErroneeException{
        if (avenue.equals("")){
            throw new ValeurErroneeException("");
        }else{
            this.avenue = avenue;
        }
    }

    public String getQuartier() {
        return quartier;
    }

    public void setQuartier(String quartier) throws ValeurErroneeException{
        if (quartier.equals("")){
            throw new ValeurErroneeException("");
        }else{
            this.quartier = quartier;
        }
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public void utiliser() {

    }
}
