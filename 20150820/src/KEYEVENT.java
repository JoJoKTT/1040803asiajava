import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KEYEVENT {
	private Container cp;//宣告一個視窗容器

	public KEYEVENT(){
		keyevent(null);
	}
	cp=this.getContentPane();//取得視窗的 容器 以放置個元件
	this.setBounds(150,100,600,400);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);//視窗按X即結束執行
	cp.setLayout(null);//不使用視窗布局類別
	public void keyevent(KeyEvent e) {
	int ikey=e.getKeyCode();
	System.out.print(ikey);
	}
}
