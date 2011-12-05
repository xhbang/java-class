interface Destination {
    String readLabel();
}

public class GoodsSeven {
     public Destination dest(String s) {
          class GDestination implements Destination {
               private String label;
               private GDestination(String whereTo) {
                 label = whereTo;
                 System.out.println(readLabel());
               }
               public String readLabel() { return label; }
          }
          return new GDestination(s);
     }
     public static void main(String[] args) {
          GoodsSeven g= new GoodsSeven ();
          Destination d = g.dest("Beijing");
     }
}
