import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame{
	private JButton jbtnExit=new JButton("Exit");
	private JButton jbtnPush=new JButton("Push");
	private JButton jbtnPull=new JButton("Pull");
	private JLabel jlb1=new JLabel();
	private Container cp;//�ŧi�@�ӵ����e��
	private String str=("Push��������");
	private int count=0;
	public MainFrame(){//�������O���غc��
		initCamp();//�I�sinitCamp��ܥHø�s�����˦�
	}
	private	void initCamp(){
		cp=this.getContentPane();//���o������ �e�� �H��m�Ӥ���
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//������X�Y��������
		cp.setLayout(null);//���ϥε����������O
		
		//-------�]�w����-----------
		jlb1.setBounds(50,50,750,75);
		jlb1.setText(str+count);
		cp.add(jlb1);//�N���ҩ�J�e��
		
		//----------�]�wPush---------
		jbtnPush.setBounds(50,100,80,25);
		cp.add(jbtnPush);
		jbtnPush.addActionListener(new ActionListener(){//��Push�[�J�B�z�ƥ�
			public void actionPerformed(ActionEvent a1){
				count++;
				jlb1.setText(str+count);
			}
		});
		
		//----------�]�wPush---------
		jbtnPull.setBounds(150,100,80,25);
		cp.add(jbtnPull);
		jbtnPull.addActionListener(new ActionListener(){//��Pull�[�J�B�z�ƥ�
			public void actionPerformed(ActionEvent a1){
				if(count>0){
				count--;}
				jlb1.setText(str+count);
			}
		});
		
		//---------�]�wExit���s---------
		jbtnExit.setBounds(50,150,80,25);
		cp.add(jbtnExit);
		jbtnExit.addActionListener(new ActionListener(){//��Exit�[�J�B�z�ƥ�
			public void actionPerformed(ActionEvent a1){
				System.exit(0);
			}
		});
	}
}
