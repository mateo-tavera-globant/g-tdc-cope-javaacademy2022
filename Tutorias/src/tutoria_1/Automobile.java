package tutoria_1;

//We set this to abstract because we cannot create a general object as a vehicle is
abstract public class Automobile {

    public void driving(){
        System.out.println("You drive the vehicle");
    }
    public void breaking(){
        System.out.println("You step on the breaks");
    }
    public void honking(){
        System.out.println("*honk honk, beep beep, toot toot*");
    }
}
