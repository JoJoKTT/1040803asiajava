import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KEYEVENT {
	private Container cp;//�ŧi�@�ӵ����e��

	public KEYEVENT(){
		keyevent(null);
	}
	cp=this.getContentPane();//���o������ �e�� �H��m�Ӥ���
	this.setBounds(150,100,600,400);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);//������X�Y��������
	cp.setLayout(null);//���ϥε����������O
	public void keyevent(KeyEvent e) {
	int ikey=e.getKeyCode();
	System.out.print(ikey);
	}
}
