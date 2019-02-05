package org.pbreakers;

class ValeurErroneeException extends Exception {
    ValeurErroneeException(int nb){
        System.out.println("Le nombre taper ne peut-etre egale a 0");
    }

    ValeurErroneeException(String s){
        System.out.println("Vous devez entrer quelque chose, pas une chaine vide");
    }

    ValeurErroneeException(){
        System.out.println("Valeur non permise ou erronne, veuillez reverifier les valeurs entrer svp !");
    }
}
