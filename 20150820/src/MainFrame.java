import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainFrame extends JFrame{
	private JButton jbtnExit=new JButton("Exit");
	private JButton jbtnPush=new JButton("Push");
	private JButton jbtnPull=new JButton("Pull");
	private JLabel jlb1=new JLabel();
	private Container cp;//宣告一個視窗容器
	private String str=("Push按的次數");
	private int count=0;
	public MainFrame(){//視窗類別的建構元
		initCamp();//呼叫initCamp函示以繪製視窗樣式
	}
	private	void initCamp(){
		cp=this.getContentPane();//取得視窗的 容器 以放置個元件
		this.setBounds(150,100,600,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//視窗按X即結束執行
		cp.setLayout(null);//不使用視窗布局類別
		
		//-------設定標籤-----------
		jlb1.setBounds(50,50,750,75);
		jlb1.setText(str+count);
		cp.add(jlb1);//將標籤放入容器
		
		//----------設定Push---------
		jbtnPush.setBounds(50,100,80,25);
		cp.add(jbtnPush);
		jbtnPush.addActionListener(new ActionListener(){//為Push加入處理事件
			public void actionPerformed(ActionEvent a1){
				count++;
				jlb1.setText(str+count);
			}
		});
		
		//----------設定Push---------
		jbtnPull.setBounds(150,100,80,25);
		cp.add(jbtnPull);
		jbtnPull.addActionListener(new ActionListener(){//為Pull加入處理事件
			public void actionPerformed(ActionEvent a1){
				if(count>0){
				count--;}
				jlb1.setText(str+count);
			}
		});
		
		//---------設定Exit按鈕---------
		jbtnExit.setBounds(50,150,80,25);
		cp.add(jbtnExit);
		jbtnExit.addActionListener(new ActionListener(){//為Exit加入處理事件
			public void actionPerformed(ActionEvent a1){
				System.exit(0);
			}
		});
	}
}
