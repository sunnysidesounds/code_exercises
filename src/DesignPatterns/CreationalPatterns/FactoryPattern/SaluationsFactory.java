package DesignPatterns.CreationalPatterns.FactoryPattern;


public class SaluationsFactory {

    public static void main(String[] args){
        SaluationsFactory factory = new SaluationsFactory();
        factory.getPerson("Jason", "M");
        factory.getPerson("Amanda", "F");
    }

    public Person getPerson(String name, String gender){
        if(gender.equals("M")){
            return new Male(name);
        } else if (gender.equals("F")){
            return new Female(name);
        } else {
            return null;
        }
    }


}
