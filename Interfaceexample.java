interface A{
    void show();
}

class DEMO implements A{
    public void show(){
        System.out.println("interface implemented successfully");
    }
}


public class Interfaceexample {
    public static void main(String[] args) {
        DEMO d = new DEMO();
        d.show();
    }
}
