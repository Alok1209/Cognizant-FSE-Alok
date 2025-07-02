package Code;
public class Singleton{
    public static  Singleton instance=new Singleton();
    int a;
    public Singleton(){
        a=0;
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance= new Singleton();
        }
         return instance;
    }
    public void show(){
        System.out.println("Current Value of the Singleton Instance is "+instance.a);
    }
    public void Setter(int a){
        instance.a=a;
    }
    public int Getter(){
        return instance.a;
    }

    public static void main(String[] args){
        Singleton S1=Singleton.getInstance();
        Singleton S2=Singleton.getInstance();
        S1.show();
        S1.Setter(25);
        S1.show();
        S2.show();

     }

}