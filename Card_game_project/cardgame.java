import java.awt.*;
import java.applet.*;
public class cardgame extends Applet{
	String message1,message2,message3;
	int Lastcard,newcard,suit,credit;
	Button button1;
	Button button2;
	Button button3;
	TextField text1;
	Image pic;
	Image King_of_harts;
	Image queen_of_harts;
	Image Jack_of_harts;
	Image Harts_10;
	Image Harts_9;
	Image Harts_8;
	Image Harts_7;
	Image Harts_6;
	Image Harts_5;
	Image Harts_4;
	Image Harts_3;
	Image Harts_2;
	Image Harts_ace;
	
	Image King_of_spades;
	Image queen_of_spades;
	Image jack_of_spades;
	Image spades_10;
	Image spades_9;
	Image spades_8;
	Image spades_7;
	Image spades_6;
	Image spades_5;
	Image spades_4;
	Image spades_3;
	Image spades_2;
	Image spades_ace;
	
	Image King_of_diamonds;
	Image queen_of_diamonds;
	Image jack_of_diamonds;
	Image diamonds_10; 
	Image diamonds_9;
	Image diamonds_8;
	Image diamonds_7;
	Image diamonds_6;
	Image diamonds_5;
	Image diamonds_4;
	Image diamonds_3;
	Image diamonds_2;
	Image diamonds_ace; 
	
	Image King_of_clubs;
	Image queen_of_clubs;
	Image jack_of_clubs;
	Image clubs_10;
	Image clubs_9;
	Image clubs_8;
	Image clubs_7;
	Image clubs_6;
	Image clubs_5;
	Image clubs_4;
	Image clubs_3;
	Image clubs_2;
	Image clubs_ace;          
	
	
	public void init(){
		pic = getImage(getCodeBase(),"background.jpg");
		King_of_harts = getImage(getCodeBase(),"hk.png");
		queen_of_harts = getImage(getCodeBase(),"hq.png");
		Jack_of_harts = getImage(getCodeBase(),"hj.png");
		Harts_10 = getImage(getCodeBase(),"h10.png");
		Harts_9 = getImage(getCodeBase(),"h9.png");
		Harts_8 = getImage(getCodeBase(),"h8.png");
		Harts_7 = getImage(getCodeBase(),"h7.png");
		Harts_6 = getImage(getCodeBase(),"h6.png");
		Harts_5 = getImage(getCodeBase(),"h5.png");
		Harts_4 = getImage(getCodeBase(),"h4.png");
		Harts_3 = getImage(getCodeBase(),"h3.png");
		Harts_2 = getImage(getCodeBase(),"h2.png");
		Harts_ace = getImage(getCodeBase(),"hace.png");
		
		King_of_spades = getImage(getCodeBase(),"ks.png");
		queen_of_spades = getImage(getCodeBase(),"qs .png");
		jack_of_spades = getImage(getCodeBase(),"js.png");
		spades_10 = getImage(getCodeBase(),"s10.png");
		spades_9 = getImage(getCodeBase(),"s9.png");
		spades_8 = getImage(getCodeBase(),"s8.png");
		spades_7 = getImage(getCodeBase(),"s7.png");
		spades_6 = getImage(getCodeBase(),"s6.png");
		spades_5 = getImage(getCodeBase(),"s5.png");
		spades_4 = getImage(getCodeBase(),"s4.png");
		spades_3 = getImage(getCodeBase(),"s3.png");
		spades_2 = getImage(getCodeBase(),"s2.png");
		spades_ace = getImage(getCodeBase(),"acespades.png");
		
		King_of_diamonds = getImage(getCodeBase(),"dk.png");
		queen_of_diamonds = getImage(getCodeBase(),"dq.png");
		jack_of_diamonds = getImage(getCodeBase(),"dj.png");
		diamonds_10 = getImage(getCodeBase(),"d10.png");
		diamonds_9 = getImage(getCodeBase(),"d9.png");
		diamonds_8 = getImage(getCodeBase(),"d8.png");
		diamonds_7 = getImage(getCodeBase(),"d7.png");
		diamonds_6 = getImage(getCodeBase(),"d6.png");
		diamonds_5 = getImage(getCodeBase(),"d5.png");
		diamonds_4 = getImage(getCodeBase(),"d4.png");
		diamonds_3 = getImage(getCodeBase(),"d3.png");
		diamonds_2 = getImage(getCodeBase(),"d2.png");
		diamonds_ace = getImage(getCodeBase(),"dace.png");
	
		King_of_clubs = getImage(getCodeBase(),"kc.png");
		queen_of_clubs = getImage(getCodeBase(),"qc .png"); 
		jack_of_clubs = getImage(getCodeBase(),"jc.png"); 
		clubs_10 = getImage(getCodeBase(),"c10.png"); 
		clubs_9 = getImage(getCodeBase(),"c9.png");
		clubs_8 = getImage(getCodeBase(),"c8 .png"); 
		clubs_7 = getImage(getCodeBase(),"c7.png");
		clubs_6 = getImage(getCodeBase(),"c6.png"); 
		clubs_5 = getImage(getCodeBase(),"c5.png"); 
		clubs_4 = getImage(getCodeBase(),"c4 .png");
		clubs_3 = getImage(getCodeBase(),"c3 .png");
		clubs_2 = getImage(getCodeBase(),"c2.png");
		clubs_ace = getImage(getCodeBase(),"acec.png"); 
	
	
	
	button1 = new Button("Enter Credit");
	button2 = new Button("Higher");
	button3 = new Button("Lower");
	text1 = new TextField(10);
	add(button1);
	add(button2);
	add(button3);
	add(text1);
}
	
	public boolean action(Event evt, Object arg){
		newcard = (int)(13*Math.random()+2);
		suit = (int)(4*Math.random());
	
		if(evt.target==button1){
			try{
				message3=text1.getText();
				Integer c = new Integer(message3);
				credit = c.intValue()+credit;
				message2=" ";
			}catch(Exception e){
				message2="please enter a number!!";
			}
		}
		
		if(evt.target==button2){
			if(newcard>Lastcard){
				credit=credit+10;
			}else{
				credit=credit-10;
				}
		}
		if(evt.target==button3){
			if(newcard>Lastcard){
				credit=credit+10;
			}else{
				credit=credit-10;
				}
		}
		message3=Integer.toString(credit);		
		
		
		
		Lastcard = newcard;
		repaint();
		return(true);
		
	
	}
	
	public void paint(Graphics g){
		
		g.drawImage(pic,0,0,this);
		
		
		if((newcard==14)&&(suit==0)){
			g.drawImage(Harts_ace,50,50,this);
		}		

		if((newcard==13)&&(suit==0)){
			g.drawImage(King_of_harts,50,50,this);
		}
		
		if((newcard==12)&&(suit==0)){
			g.drawImage(queen_of_harts,50,50,this);
		}
		
		if((newcard==11)&&(suit==0)){
			g.drawImage(Jack_of_harts,50,50,this);
		}
		
		if((newcard==10)&&(suit==0)){
			g.drawImage(Harts_10,50,50,this);
		}
		
		if((newcard==9)&&(suit==0)){
			g.drawImage(Harts_9,50,50,this);
		}
		
		if((newcard==8)&&(suit==0)){
			g.drawImage(Harts_8,50,50,this);
		}
		
		if((newcard==7)&&(suit==0)){
			g.drawImage(Harts_7,50,50,this);
		}
		if((newcard==6)&&(suit==0)){
			g.drawImage(Harts_6,50,50,this);
		}
		
		if((newcard==5)&&(suit==0)){
			g.drawImage(Harts_5,50,50,this);
		}
		
		if((newcard==4)&&(suit==0)){
			g.drawImage(Harts_4,50,50,this);
		}
		
		if((newcard==3)&&(suit==0)){
			g.drawImage(Harts_3,50,50,this);
		}
		
		if((newcard==2)&&(suit==0)){
			g.drawImage(Harts_2,50,50,this);
		}
		
		
		
		
		
		if((newcard==14)&&(suit==1)){
			g.drawImage(spades_ace,50,50,this);
		}
		
		if((newcard==13)&&(suit==1)){
			g.drawImage(King_of_spades,50,50,this);
		}
		
		if((newcard==12)&&(suit==1)){
			g.drawImage(queen_of_spades,50,50,this);
		}
		
		if((newcard==11)&&(suit==1)){
			g.drawImage(jack_of_spades,50,50,this);
		}
		
		if((newcard==10)&&(suit==1)){
			g.drawImage(spades_10,50,50,this);
		}
		
		if((newcard==9)&&(suit==1)){
			g.drawImage(spades_9,50,50,this);
		}
		
		if((newcard==8)&&(suit==1)){
			g.drawImage(spades_8,50,50,this);
		}
		
		if((newcard==7)&&(suit==1)){
			g.drawImage(spades_7,50,50,this);
		}
		
		if((newcard==6)&&(suit==1)){
			g.drawImage(spades_6,50,50,this);
		}
		
		if((newcard==5)&&(suit==1)){
			g.drawImage(spades_5,50,50,this);
		}
		
		if((newcard==4)&&(suit==1)){
			g.drawImage(spades_4,50,50,this);
		}
		
		if((newcard==3)&&(suit==1)){
			g.drawImage(spades_3,50,50,this);
		}
		
		if((newcard==2)&&(suit==1)){
			g.drawImage(spades_2,50,50,this);
		}
		
	
	    if((newcard==14)&&(suit==2)){
			g.drawImage(diamonds_ace,50,50,this);
		}
	
	    if((newcard==13)&&(suit==2)){
			g.drawImage(King_of_diamonds,50,50,this);
		}
		
		if((newcard==12)&&(suit==2)){
			g.drawImage(queen_of_diamonds,50,50,this);
		}
		if((newcard==11)&&(suit==2)){
			g.drawImage(jack_of_diamonds,50,50,this);
		}
		if((newcard==10)&&(suit==2)){
			g.drawImage(diamonds_10,50,50,this);
		}
		if((newcard==9)&&(suit==2)){
			g.drawImage(diamonds_9,50,50,this);
		}
		if((newcard==8)&&(suit==2)){
			g.drawImage(diamonds_8,50,50,this);
		}
		if((newcard==7)&&(suit==2)){
			g.drawImage(diamonds_7,50,50,this);
		}
		if((newcard==6)&&(suit==2)){
			g.drawImage(diamonds_6,50,50,this);
		}
		if((newcard==5)&&(suit==2)){
			g.drawImage(diamonds_5,50,50,this);
		}
		if((newcard==4)&&(suit==2)){
			g.drawImage(diamonds_4,50,50,this);
		}
		if((newcard==3)&&(suit==2)){
			g.drawImage(diamonds_3,50,50,this);
		}
		if((newcard==2)&&(suit==2)){
			g.drawImage(diamonds_2,50,50,this);
		}
		
		
		
		if((newcard==14)&&(suit==3)){
			g.drawImage(clubs_ace,50,50,this);
		}
		if((newcard==13)&&(suit==3)){
			g.drawImage(King_of_clubs,50,50,this);
		}
		if((newcard==12)&&(suit==3)){
			g.drawImage(queen_of_clubs,50,50,this);
		}
			
		if((newcard==11)&&(suit==3)){
			g.drawImage(jack_of_clubs,50,50,this);
		}
		if((newcard==10)&&(suit==3)){
			g.drawImage(clubs_10,50,50,this);
		}
		if((newcard==9)&&(suit==3)){
			g.drawImage(clubs_9,50,50,this);
		}
		
		if((newcard==8)&&(suit==3)){
			g.drawImage(clubs_8,50,50,this);
		}
		
		if((newcard==7)&&(suit==3)){
			g.drawImage(clubs_7,50,50,this);
		}
		
		if((newcard==6)&&(suit==3)){
			g.drawImage(clubs_6,50,50,this);
		}
		
		if((newcard==5)&&(suit==3)){
			g.drawImage(clubs_5,50,50,this);
		}
		
		if((newcard==4)&&(suit==3)){
			g.drawImage(clubs_4,50,50,this);
		}
		
		if((newcard==3)&&(suit==3)){
			g.drawImage(clubs_3,50,50,this);
		}
		
		if((newcard==2)&&(suit==3)){
			g.drawImage(clubs_2,50,50,this);
		}
		
		
	
		g.drawString("Daniel Chew",660,550);
		g.drawString("Ludo A",660,560);
		g.drawString("credit =",660,570);
		g.drawString(message3,700,570);
	
	}
}