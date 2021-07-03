package javaspecific;

public class Singleton {
    private static Singleton si = null;
    public String s;
    private Singleton(){
        s = "Hi I am in the Singleton class";
    }

    public static Singleton singleton()
    {
        if (si == null){
            si = new Singleton();
        }
        return si;
    }
}

class SingletonMain{
    public static void main(String[] args) {
        Singleton x = Singleton.singleton();
        Singleton y = Singleton.singleton();
        Singleton z = Singleton.singleton();

        x.s = (x.s).toUpperCase();

        System.out.println("X is: "+x.s);
        System.out.println("Y is: "+y.s);
        System.out.println("Z is: "+z.s);
        System.out.println("\n");

        z.s = (z.s).toLowerCase();

        System.out.println("X is: "+x.s);
        System.out.println("Y is: "+y.s);
        System.out.println("Z is: "+z.s);
        System.out.println("\n");
    }
}