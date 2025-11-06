public class player {
     int age;
    String name;

    player(String a, int b){
        name=a;
        age=b;
    }
    void show(){
         System.out.println("name="+ name+ "age="+ age );
     }
}
class Cricketplayer extends player {
    Cricketplayer(int b, String a) {
        super(a, b);
    }
}
class Hockeyplayer extends player {
    Hockeyplayer(int b, String a) {
        super(a, b);
    }
}
class playermain{
    public static void main(String[] args) {
        new Cricketplayer(30,"virat").show();
        new Hockeyplayer(20,"sunil").show();
    }
}

