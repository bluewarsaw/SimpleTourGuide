package pl.sebastianczarnecki.simpletourguide;

public class East {

    private String EastTitle;
    private int EastImage;
    private String EastDescription;

    public East(String vEastTitle, int vEastImage, String vEastDescription){
        EastTitle = vEastTitle;
        EastImage = vEastImage;
        EastDescription = vEastDescription;
        }

    public String getEastTitle(){
        return EastTitle;
    }


    public int getEastImage(){
        return EastImage;
    }

    public String getEastDescription(){
        return EastDescription;
    }

}
