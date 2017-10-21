package hello;

public class Avatar {
    private String hair, hair_color, eyecolor, skin, shirt, pants;

    public Avatar(String hair, String hair_color, String eyecolor, String skin, String shirt, String pants) {
        this.hair = hair;
        this.hair_color = hair_color;
        this.eyecolor = eyecolor;
        this.skin = skin;
        this.shirt = shirt;
        this.pants = pants;
    }

    public String getHair() {
        return hair;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public String getSkin() {
        return skin;
    }

    public String getShirt() {
        return shirt;
    }

    public String getPants() {
        return pants;
    }

    public void setHair(String charhair){
        hair = charhair;
    }

    public void setHairColor(String haircolor){
        hair_color = haircolor;
    }
    public void seteyecol(String eyecol){
        eyecolor = eyecol;
    }
    public void setskin(String skincol){
        skin = skincol;
    }
    public void setshit(String shirttype) {
        shirt = shirttype;
    }
    public void setpants(String panttype){
        pants = panttype;
    }


}
