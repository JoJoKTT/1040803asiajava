import java.util.Scanner;
public class Ex03Receipt {
/*	���]�o�����Τ@�o���������X�� 01272636�B39412201�B94586356�C
 	�г]�p�@�{�����ϥΪ̿�J�@�յo�����X�Y�i�L�X�������B�C
	(�䤤���T�X�ۦP���� 200 ���F���|�X�ۦP���� 1000 ���F�����X�ۦP����
	4000 ���F�����X�ۦP���� 10000 ���F���C�X�ۦP���� 40000 ���F���X�����ۦP
	���� 200000 ���C*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int p1[]={0,1,2,7,2,6,3,6};
		int p2[]={3,9,4,1,2,2,0,1};
		int p3[]={9,4,5,8,6,3,5,6};
		String a1=scn.next();
		char a2[]=a1.toCharArray();
		char a[]=new char[8];
		for(int i=0;i<8;i++){
			a[i]=(char) (a2[i]-'0');
		}
			if(a[0]==p1[0]&&a[1]==p1[1]&&a[2]==p1[2]&&a[3]==p1[3]&&a[4]==p1[4]&&a[5]==p1[5]&&a[6]==p1[6]&&a[7]==p1[7]
					||a[0]==p2[0]&&a[1]==p2[1]&&a[2]==p2[2]&&a[3]==p2[3]&&a[4]==p2[4]&&a[5]==p2[5]&&a[6]==p2[6]&&a[7]==p2[7]
							||a[0]==p3[0]&&a[1]==p3[1]&&a[2]==p3[2]&&a[3]==p3[3]&&a[4]==p3[4]&&a[5]==p3[5]&&a[6]==p3[6]&&a[7]==p3[7]){
				System.out.print("���ߩp���F200000��");
			}else if(a[1]==p1[1]&&a[2]==p1[2]&&a[3]==p1[3]&&a[4]==p1[4]&&a[5]==p1[5]&&a[6]==p1[6]&&a[7]==p1[7]
					||a[1]==p2[1]&&a[2]==p2[2]&&a[3]==p2[3]&&a[4]==p2[4]&&a[5]==p2[5]&&a[6]==p2[6]&&a[7]==p2[7]
							||a[1]==p3[1]&&a[2]==p3[2]&&a[3]==p3[3]&&a[4]==p3[4]&&a[5]==p3[5]&&a[6]==p3[6]&&a[7]==p3[7]){
				System.out.print("���ߩp���F40000��");
			}else if(a[2]==p1[2]&&a[3]==p1[3]&&a[4]==p1[4]&&a[5]==p1[5]&&a[6]==p1[6]&&a[7]==p1[7]
					||a[2]==p2[2]&&a[3]==p2[3]&&a[4]==p2[4]&&a[5]==p2[5]&&a[6]==p2[6]&&a[7]==p2[7]
							||a[1]==p3[1]&&a[2]==p3[2]&&a[3]==p3[3]&&a[4]==p3[4]&&a[5]==p3[5]&&a[6]==p3[6]&&a[7]==p3[7]){
				System.out.print("���ߩp���F10000��");
			}else if(a[3]==p1[3]&&a[4]==p1[4]&&a[5]==p1[5]&&a[6]==p1[6]&&a[7]==p1[7]
					||a[3]==p2[3]&&a[4]==p2[4]&&a[5]==p2[5]&&a[6]==p2[6]&&a[7]==p2[7]
							||a[3]==p3[3]&&a[4]==p3[4]&&a[5]==p3[5]&&a[6]==p3[6]&&a[7]==p3[7]){
				System.out.print("���ߩp���F4000��");
			}else if(a[4]==p1[4]&&a[5]==p1[5]&&a[6]==p1[6]&&a[7]==p1[7]
					||a[4]==p2[4]&&a[5]==p2[5]&&a[6]==p2[6]&&a[7]==p2[7]
							||a[4]==p3[4]&&a[5]==p3[5]&&a[6]==p3[6]&&a[7]==p3[7]){
				System.out.print("���ߩp���F1000��");
			}else if(a[5]==p1[5]&&a[6]==p1[6]&&a[7]==p1[7]
					||a[5]==p2[5]&&a[6]==p2[6]&&a[7]==p2[7]
							||a[5]==p3[5]&&a[6]==p3[6]&&a[7]==p3[7]){
				System.out.print("���ߩp���F200��");
			}else{
				System.out.print("��p�A�z�S������");
			}
	}

}