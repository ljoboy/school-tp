package org.pbreakers;

public class Telephone extends Coordonnee {
    private String numero;

    Telephone(String num){
        try{
            this.setNumero(num);
        }catch(ValeurErroneeException e){
            System.out.println(".Numero de telephone Incorrecte : ");
        }

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws ValeurErroneeException {
        if (numero.equals("")){
            throw new ValeurErroneeException("");
        }else if (numero.length() < 10){
            throw new ValeurErroneeException();
        }else{
            this.numero = numero;
        }
    }

    @Override
    public void utiliser() {

    }
}
