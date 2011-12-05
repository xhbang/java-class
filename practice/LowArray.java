//LowArray
public class LowArray{
	private long a[];
	public LowArray(int size){
		a=new long(size);
	}
	public void setElem(int index,long value){
		a[index]=value;
	}
	public long getElem(int index){
		return a[index];
	}
	public void search(int searchKey){
		for(int i=0;i<size;i++){
			if(a.getElem(i)==searchKey)
				break;
		}
		if(i==size)
			System.out.println("Not found");
		else
			System.out.println("Find");
	}
}
