class Main{
    public static void main(String e[]){
        // Dog d=new Dog();
        // d.eat();
        // System.out.println(d.color);
        // d.walk();
        // Bird b=new Bird();
        // System.out.println(b.color);
        // b.walk();

        Deer dd=new Deer();
    }
}




abstract class Animal{
    String color;

    Animal(){
        color="red";
        System.out.println("Animal Constructor");
    }

    void eat(){
        System.out.println("Animal Eates Anything");
    }

    abstract void walk();

}

class Dog extends Animal{

    Dog(){
        System.out.println("Dog Constructor");
    }
    void walk(){
        System.out.println("walks 4 legs ");
    }

}

class Deer extends Dog{

    Deer(){
        System.out.println("Deer Constructor");
    }
}



class Bird extends Animal{
     void walk(){
        System.out.println("walks 2 legs ");
    }
}