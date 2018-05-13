package childBrother;

public class cbNode {
	int data = 0;
	cbNode firstChild = null;
	cbNode brother = null;
	public cbNode(int data, cbNode firstChild, cbNode brother){
		this.data = data;
		this.firstChild = firstChild;
		this.brother = brother;
	}
}
