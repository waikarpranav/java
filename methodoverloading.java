public class methodoverloading {
      static void add(int a, int b){
          System.out.println(a+b);
    }
       static void add(double a , int b){
           System.out.println(a-b);
       }
       static void add(int a, int b , int c){
           System.out.println(a+b*c);
       }
    public static void main(String[] args) {
        add(5,6);
        add(7.6,8);
        add(7,6,5);

}


}
