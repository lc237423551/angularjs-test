public class parent<AnyType> {
	int index = 0;
	//static final int Max = 10;
	//parentNode newNode[] = new parentNode[];
	int root,size;
	parentNode newnode[] = new parentNode[1000];
	
	public boolean addNode (int length, int data,int parent){
		parentNode newNode[] = new parentNode[length];
		this.size = length;
		//addData(int data, AnyType parent, int num);
		addData(data, parent);
		return true;
	}
	public void addData(int data, int parent) {
		// TODO Auto-generated method stub
		 newnode[index] = new parentNode(data, parent);
		 index++;	
	}	
//	public int findDeep(parentNode son){
//		if(son.parent == null){
//			return 1;
//		}else{
//			for(parentNode parent=son.parent; parent != null ;parent.parent){
//				
//			}
//		}
//		return count;
//	}
	public int findDeep(){
		System.out.println("-----");
		if(this.size == 1){
			return 1;
		}
		int i = 0;
		int num = 0;
		int Allcount[] = new int [this.size];
		int count = 0;
		int deep = 0;
		int j = 0;
		while(i != this.size-1){
			count = 1;
			j = i;
			while(newnode[j].parent != 0){
				count++;
				num = newnode[j].parent;
				j = num-1;
			}
			Allcount[i] = count;
			i++;
		}
		deep = getMax(Allcount);
		return deep;
		
	}
	public int getMax(int[] count){
		   int max = 0;
		   for(int i=0;i<count.length;i++){
		           max = max > count[i] ? max : count[i];
		   }
		   return max;    
	}
}
