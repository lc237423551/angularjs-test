package childBrother;
import java.util.Scanner;

public class test {
	 public static void main(String args[]){
		 cbTree my = new cbTree();
		 System.out.print("���������볤��");
		 Scanner cin = new Scanner(System.in);
		 int length =cin.nextInt();
		 System.out.print("�����������");
		 //int i;
		 int num = 0;
		 //int[] treeRoot = null;
		 for( int i=0; i<length; i++){
//			 my.newnode[i].firstChild = null;
//			 my.newnode[i].brother = null;
			 num = cin.nextInt();
			 //treeRoot[i] = num;
			 //my.addNode(num,i);
			 my.addData(num, i);
		 }
		 //my.addNode(num, length);
		 System.out.println("��������ֺ��ӹ�ϵ��һ������ĸ��ڵ�Ϊ��");
		 int k = cin.nextInt();
		 System.out.println("��������㸸�ӹ�ϵ");
		 for(int i=0; i<k; i++){
			 int parent = cin.nextInt();
			 int son = cin.nextInt();
			 my.addNode(my.nodelist[parent] ,my.nodelist[son]);
		 }
		 System.out.print("�������");
		 my.postOrder(my.nodelist[0]);
		 System.out.println(" ");
		 System.out.print("�ȸ�����");
		 my.preOrder(my.nodelist[0]);
		 System.out.println(" ");
		 System.out.println("�ڵ���");
		 int j=my.findAllNode();
		 System.out.print(j);
	 }
	 
}
