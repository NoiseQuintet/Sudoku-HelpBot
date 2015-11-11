package MAIN;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import java.awt.Color;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import java.lang.Math;

public class ChatBot extends JFrame implements KeyListener{

	JPanel MainWindow=new JPanel();
	JTextArea ChatBox=new JTextArea(20,50);
	JTextArea TextInput=new JTextArea(1,50);
	JScrollPane Scroll=new JScrollPane(
		ChatBox,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		
	);
	
	String[][] ChatBotText={
		//powitania
		{"siema","dzien dobry","czesc","hej","siemano","witaj", "witam"},
		{"Witam Waćosobowość","Dzień Dobry","Szczęść Boże"},
		//pożegnania
		{"do widzenia","dobranoc","na razie","do zobaczenia","zegnaj"},
		{"Nara","Bywaj","Z Bogiem","Daswidania"},
		//pytania o samopoczucie
		{"co tam","jak tam","co u ciebie","jak sie czujesz"},
		{"Niezgorzej","Obleci", "Tak se"},
		//NIE
		{"tak"},
		{"Dlaczego tak?","A może nie?","Nie Nie Nie!!!!!!!"},
		//NIE
		{"nie"},
		{"Dlaczego nie?","A może tak?","TAK TAK TAK!!!!!!!"},
		//Standard
		{"Nie panimaju","Napisz coś normalnego...","Facepalm","Nie rozumie",
		"Nie wiem o co chodzi. Masz ziemniaka.", "No ten tego, nie wiem", "Że co?"}
	};
	
	public void keyReleased(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			TextInput.setEditable(true);
		}
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void addTextToBox(String s){
		ChatBox.setText(ChatBox.getText()+s);
	}
	
	//fcja sprawdza czy stringi są sobie równe
	public boolean Match(String in,String[] s){
		boolean match=false;
		for(int i=0;i<s.length;i++){
			if(s[i].equals(in)){
				match=true;
			}
		}
		return match;
	}
	
	public ChatBot(){
		super("Sudoku Chat Bot");
		setSize(600,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ChatBox.setEditable(false);
		TextInput.addKeyListener(this);
	
		MainWindow.setBackground(new Color(0,200,0));
		MainWindow.add(Scroll);
		MainWindow.add(TextInput);
		add(MainWindow);
		setVisible(true);
		//addTextToBox(Integer.toString(ChatBotText.length-1)+"\n");
		//addTextToBox(Integer.toString(ChatBotText[ChatBotText.length-1].length)+"\n");
	}
	
	public void keyPressed(KeyEvent e){
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			TextInput.setEditable(false);
			String input=TextInput.getText();
			TextInput.setText("");
			addTextToBox("--->You:\t"+input);
			input.trim();
			while(
				input.charAt(input.length()-1)=='!' ||
				input.charAt(input.length()-1)=='.' ||
				input.charAt(input.length()-1)=='?'
			){
				input=input.substring(0,input.length()-1);
			}
			input.trim();
			byte re=0;
			
			//lenght -1 poniewaz nie interesuje nas zawartosc ostatniego wiersza
			// wiersze parzyste to odpowiedzi bota
			// wiersze nieparzyste to input uzytkownika
			//--Szukamy odpowiedzi bota na input
			int j=0;//w ktorej grupie jestesmy
			while(re==0){
				if(Match(input.toLowerCase(),ChatBotText[j*2])){
					re=2;
					// losujemy odpowiedź
					int r=(int)Math.floor(Math.random()*ChatBotText[(j*2)+1].length);
					addTextToBox("\n-->Reptilianin:\t"+ChatBotText[(j*2)+1][r]);
				}
				j++;
				//nie znalezlismy odpowiedzi 
				if(j*2==ChatBotText.length-1 && re==0){
					re=1;
				}
			}
			
			//-----Standatdowy output bota (jak nie znajdzie odpowiedzi)--------------
			if(re==1){
				// losujemy odpowiedź
				int r=(int)Math.floor(Math.random()*ChatBotText[ChatBotText.length-1].length);
				addTextToBox("\n-->Reptilianin:\t"+ChatBotText[ChatBotText.length-1][r]);
			}
			addTextToBox("\n");
		}
	}
	

}
