package childBrother;
import java.util.Scanner;

public class test {
	 public static void main(String args[]){
		 cbTree my = new cbTree();
		 System.out.print("请输入输入长度");
		 Scanner cin = new Scanner(System.in);
		 int length =cin.nextInt();
		 System.out.print("请输入各点数");
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
		 System.out.println("请输多少种孩子关系第一个输入的父节点为根");
		 int k = cin.nextInt();
		 System.out.println("请输各个点父子关系");
		 for(int i=0; i<k; i++){
			 int parent = cin.nextInt();
			 int son = cin.nextInt();
			 my.addNode(my.nodelist[parent] ,my.nodelist[son]);
		 }
		 System.out.print("后根遍历");
		 my.postOrder(my.nodelist[0]);
		 System.out.println(" ");
		 System.out.print("先根遍历");
		 my.preOrder(my.nodelist[0]);
		 System.out.println(" ");
		 System.out.println("节点数");
		 int j=my.findAllNode();
		 System.out.print(j);
	 }
	 
}
