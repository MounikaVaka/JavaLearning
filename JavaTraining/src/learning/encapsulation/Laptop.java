package learning.encapsulation;

public class Laptop {

    private String company;

    private String model = "ABA";

    public String color;

    protected int screenSize;

    String os;



    //Setter
     void setCompany(String cmp){

        this.company = cmp;

    }


     String getModel() {
        //System.out.println(company);
        return model;
    }
}
