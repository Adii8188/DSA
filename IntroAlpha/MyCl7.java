public class MyCl7{
    public static void main(String arg[]){
        int x,y,z;
        x=y=z=2;
        x+=y;
        y-=z;
        z/=(x+y);// int z hai to yha answer 0.5 aaye ga but int hai to kewal 0 lega ;
        System.out.println(z); //
        System.out.println(x+" "+y+" "+z);
    }
}