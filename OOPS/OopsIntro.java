class Oops{
public static void main(String arg[]){
        MyCl ob=new MyCl();
        ob.setColor("yellow");
        System.out.println(ob.getColor());
        ob.setTip(6);
        System.out.println(ob.getTip());
}
}
class MyCl{
   private String color;
    void setColor(String color){
        this.color=color;
    }
    private int tip;
    void setTip(int tip){
        this.tip=tip;
    }
    String getColor(){
        return color;
    }
    int getTip(){
        return tip;
    }
}
