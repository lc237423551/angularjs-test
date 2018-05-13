package childBrother;

public class cbTree {
	cbNode[] nodelist = new cbNode[10000];
	int count=0;
	int root;
	public void addData(int data, int length){ 
		int i = length;
		nodelist[i] = new cbNode(data, null, null);	
		i++;
	}
	public void preOrder(cbNode head){
		if(head == null) return ;
		System.out.print(head.data);
		preOrder(head.firstChild);
		preOrder(head.brother);
		count++;
	}
	public void postOrder(cbNode head){
		if(head == null) return ;
		postOrder(head.firstChild);
		System.out.print(head.data);
		postOrder(head.brother);
	}
	public void addNode(cbNode parent, cbNode firstChild){
		if(parent.firstChild != null){
			addBrother(parent.firstChild,firstChild);
			//parent.firstChild.brother = firstChild;
			//addNode(parent.firstChild, firstChild);
		}else{
			parent.firstChild = firstChild;
		}
	}
	public void addBrother(cbNode firstChild ,cbNode brother ){
		if(firstChild.brother == null){
			firstChild.brother = brother;
		}else{
			addBrother(firstChild.brother, brother);
		}
	}
	public int findAllNode(){	
		return count;
	}
}
