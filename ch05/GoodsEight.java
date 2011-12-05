public class GoodsEight{
     private void internalTracking(boolean b) {
          if(b) {
               class TrackingSlip {
                    private String id;
                    TrackingSlip(String s) {
                         id = s;
                    System.out.println(""+getSlip());
                    }
                    String getSlip() { return id; }
               }
               TrackingSlip ts = new TrackingSlip("slip");
               String s = ts.getSlip();
          }
     }
     public void track() { internalTracking(true); }
     public static void main(String[] args) {
          GoodsEight g= new GoodsEight();
          g.track();
     }
}
