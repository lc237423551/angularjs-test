import java.util.Scanner;
public class test {
	 public static void main(String args[]){
		 parent myparent = new parent();
		 Scanner cin = new Scanner(System.in);
		 System.out.print("�����볤��");
		 int length = cin.nextInt();
//		 int data[] = new int[length];
//		 int parentroot[] = new int[length];
		 System.out.print("�������ֵ����˫�׽ڵ�");
		 for(int i=0; i<length; i++){
			  int data = cin.nextInt(); 
			  int parentroot = cin.nextInt();
			  myparent.addNode(length, data, parentroot);
		 }
//		 System.out.print("�������˫�׽ڵ�");
//		 for(int i=0; i<length; i++){
//			  parentroot[i] = cin.nextInt();	
//		 }
//		 for(int i=0; i<length; i++){
//			 int a = data[i];
//			 int b =parentroot[i];
//			myparent.addNode(length, a, b);
//		 }
//		 
		 System.out.println(myparent.newnode[1].parent);
		 System.out.print("˫�������");
		 int deep = myparent.findDeep();
		 System.out.print(deep);
	 }
}
