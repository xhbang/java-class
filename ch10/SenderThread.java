import java.io.*;
class SenderThread extends Thread{
  PipedWriter pipedWriter;
  public SenderThread( ){
  pipedWriter = new PipedWriter( );
  }
  public PipedWriter getPipedWriter( ){
    return pipedWriter;
  }
  public void run( ){
    for (int  i =0; i<5;i++){
     try{
      pipedWriter.write(i); 
     }catch(IOException e){   
     }
     System.out.println("Send: "+i);
    }
  }
}
