package java;

public class Solarsystem {
    void revolve(){
        System.out.println("Revolve");
    }
    public static void main(String[] args){
        Solarsystem earth = new Solarsystem();
        Solarsystem venus = new Solarsystem();
        earth.revolve();
        venus.revolve();
    }    
}

