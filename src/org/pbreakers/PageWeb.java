package org.pbreakers;

public class PageWeb extends Electronique {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) throws ValeurErroneeException {
        if (url.equals("")){
            throw new ValeurErroneeException("");
        }else {
            this.url = url;
        }
    }

    @Override
    public void utiliser() {

    }
}
