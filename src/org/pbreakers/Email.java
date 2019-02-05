package org.pbreakers;

public class Email extends Electronique {
    private String mail;
    private String type; //prive, professinnelle, etc

    Email(String mail){
        try {
            this.setMail(mail);
        }catch (ValeurErroneeException e){
            System.out.println("Email Incorrecte : ");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) throws ValeurErroneeException {
        if (mail.equals("")){
            throw new ValeurErroneeException("");
        }else{
            this.mail = mail;
        }
    }

    @Override
    public void utiliser() {

    }
}
