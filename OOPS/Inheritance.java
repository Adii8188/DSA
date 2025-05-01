class Inherit{
    public static void main(String b[]){
        Fish f1=new Fish();
        f1.eat();
    }
}

class Animal{
    String breath;
    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class Fish extends Animal{
    int wind;
}