import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	@SuppressWarnings("serial")
	public class NewMaze extends JFrame
	{
		private int x=135,y=120,x1=0,y1=1;
		private int maze[][]=
			{
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1},
				{0,0,0,0,1,0,0,0,0,0,0,0,1,1},
				{1,1,0,1,1,0,1,0,1,1,0,0,0,0},
				{1,1,0,1,1,0,1,0,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,1,1,0,0,0,0,0},
				{1,0,1,1,1,1,0,1,1,0,1,1,1,0},
				{1,0,1,1,1,1,0,1,1,0,1,0,0,0},
				{1,0,1,0,1,1,0,1,1,0,1,0,1,1},
				{1,0,1,0,1,1,0,1,1,0,1,0,1,1},
				{1,1,1,0,1,1,0,1,1,0,1,0,0,0},
				{1,0,0,0,1,1,0,0,0,0,1,1,1,1},
				{1,0,1,1,1,1,0,1,1,1,1,1,1,1},
				{0,0,0,0,0,0,0,0,0,1,1,1,1,1},
				{1,1,1,1,1,1,1,1,1,1,1,1,1,1}
			};
		private JLabel jlb=new JLabel();
		private JLabel jlb1=new JLabel();
		private Container cp;//宣告一個視窗容器
		private ImageIcon pic[]=new ImageIcon[6];
		private String PName[]={"MAP1","MAP2","MAP3","MAP4","78","map"};
		public NewMaze(){//視窗類別的建構元
			
			initCamp();//呼叫initCamp函示以繪製視窗樣式
			
		}
	private void initCamp(){
		cp=this.getContentPane();//取得視窗的 容器 以放置個元件
		this.setBounds(150,100,800,700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//視窗按X即結束執行
		cp.setLayout(null);//不使用視窗布局類別
		
		//--------載入圖片--------
		String str = "";
		for(int i=0;i<6;i++){
			str = "e:\\"+PName[i]+".jpg";
			pic[i]=new ImageIcon(str);
		}
		((JPanel)cp).setOpaque(false);
		//--------設定地圖--------
		jlb.setIcon(pic[0]);
		jlb.setBounds(0,0,768,614);
		//add(jlb);
		this.getLayeredPane().add(jlb,new Integer(Integer.MIN_VALUE));
		//--------顯示角色--------
		jlb1.setIcon(pic[4]);
		jlb1.setBounds(x,y,60,60);
		add(jlb1);
		//--------按鍵設定--------

		this.addKeyListener(new KeyListener(){
	
			@Override
			public void keyReleased(KeyEvent e3) {
				// TODO Auto-generated method stub

			}
			@Override
			public void keyTyped(KeyEvent e4) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyCode());
				debug(x,y,x1,y1);
				switch(e.getKeyCode()){
					case KeyEvent.VK_LEFT://左
						if(x1-1>=0 && x-90>=0){
							if( maze[y1][x1-1] ==0){
								x=x-90;
								x1=x1-1;
								jlb1.setLocation(x,y);
							}
							if(x1==6&&y1==1){
								jlb.setIcon(pic[0]);
								jlb1.setLocation(675,120);
								x=675;y=120;
							}
							if(x1==6&&y1==10){
								jlb.setIcon(pic[2]);
								jlb1.setLocation(630,320);
								x=630;y=320;
							}
							if(x1==6&&y1==12){
								jlb.setIcon(pic[2]);
								jlb1.setLocation(630,480);
								x=630;y=480;
							}
						}
					break;
					case KeyEvent.VK_UP://上
						if(y1-1>=0 && y-80>=0){
							if(maze[y1-1][x1]==0){
								y=y-80;
								y1=y1-1;
								jlb1.setLocation(x,y);
							}
							if(x1==1&&y1==6){
								jlb.setIcon(pic[0]);
								jlb1.setLocation(225,520);
								x=225;y=520;
							}
							if(x1==6&&y1==6){
								jlb.setIcon(pic[0]);
								jlb1.setLocation(675,520);
								x=675;y=520;
							}
							if(x1==9&&y1==6){
								jlb.setIcon(pic[1]);
								jlb1.setLocation(275,500);
								x=275;y=500;
							}
							if(x1==11&&y1==6){
								jlb.setIcon(pic[1]);
								jlb1.setLocation(455,500);
								x=455;y=500;
							}
						}
					break;
					case KeyEvent.VK_RIGHT://右
						if(x+90<=cp.getWidth() && x1+1<=maze.length){
							if(maze[y1][x1+1]==0){
								x=x+90;
								x1=x1+1;
								jlb1.setLocation(x,y);
							}
							if(x1==7&&y1==1){
								jlb.setIcon(pic[1]);
								jlb1.setLocation(90,120);
								x=90;y=120;
							}
							if(x1==7&&y1==10){
								jlb.setIcon(pic[3]);
								jlb1.setLocation(90,320);
								x=90;y=320;
							}
							if(x1==7&&y1==12){
								jlb.setIcon(pic[3]);
								jlb1.setLocation(90,480);
								x=90;y=480;
							}
							if(x1==13&&y1==9){
								jlb.setIcon(pic[5]);
								jlb.setBounds(0,0,768,614);
								jlb1.setVisible(false);
								JOptionPane.showMessageDialog(null,"You Win!!");
								System.exit(0);
							}
						}
					break;
					case KeyEvent.VK_DOWN://下
						if(y1+1<=maze[x1].length && y+80<=cp.getHeight()){
							if(maze[y1+1][x1]==0){
								y1=y1+1;
								y=y+80;
								jlb1.setLocation(x,y);
							}
							if(x1==1&&y1==7){
								jlb.setIcon(pic[2]);
								jlb1.setLocation(180,80);
								x=180;y=80;
							}							
							if(x1==6&&y1==7){
								jlb.setIcon(pic[2]);
								jlb1.setLocation(630,80);
								x=630;y=80;
							}
							if(x1==11&&y1==7){
								jlb.setIcon(pic[3]);
								jlb1.setLocation(450,80);
								x=450;y=80;
							}
							if(x1==9&&y1==7){
								jlb.setIcon(pic[3]);
								jlb1.setLocation(270,80);
								x=270;y=80;
							}
						}
					break;
				}
				debug(x,y,x1,y1);
			}
		});
	}
	public void debug(int x,int y,int x1,int y1){
		System.out.println("x="+x+", "+"y="+y);
		System.out.println("x1="+x1+", y1="+y1);
		//System.out.println("maze[x1][y1]="+maze[x1][y1]);
		System.out.println("--------------------");
	}
	
}	