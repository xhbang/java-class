import java.io.*;
class ReceiverThread extends Thread{
  PipedReader pipedReader;
  public ReceiverThread( SenderThread senderThread) throws IOException{
  pipedReader = new PipedReader(senderThread.getPipedWriter( ));
  }
  public void run( ){
    int i=0;
    while(true){
      try{
      i = pipedReader.read();
      System.out.println("Received: "+i);  
    }catch(IOException e){        
      }
     if(i == 4) break;     
    }
  }
}
