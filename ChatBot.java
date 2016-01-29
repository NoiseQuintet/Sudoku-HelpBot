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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel MainWindow=new JPanel();
	
	JTextArea c = new JTextArea();
	JTextArea ChatBox=new JTextArea(20,70);
	JTextArea TextInput=new JTextArea(1,70);
	JScrollPane Scroll=new JScrollPane(
		ChatBox,
		JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER
		
	);
	
	String[][] ChatBotText={
		
		
			
		//demo
			{"demo"},
			{"Czeœc \n	jestem botem który umili ci czas podczas grania W Cudowne SUDOKU \n	mo¿esz mnie zapytac o wiele ciekawych informacji \n	które znajdziesz pod komend¹ 'help'"},
		//powitania
		{"siema","dzien dobry","czesc","hej","siemano","witaj", "witam"},
		{"Witam Waæosobowoœæ","Dzieñ Dobry","Szczêœæ Bo¿e"},
		//pozegnania
		{"do widzenia","dobranoc","na razie","do zobaczenia","zegnaj"},
		{"Nara","Bywaj","Z Bogiem","Daswidania"},
		//pytania o samopoczucie
		{"co tam","jak tam","co u ciebie","jak sie czujesz"},
		{"Niezgorzej","Obleci", "Tak se"},
		//regu³y gry w sudoku
		{"podasz mi reguly sudoku?","jakie sa zasady sudoku?","jak graæ w sudoku?","znasz regu³y sudoku?","znasz zasady sudoku?","nie umiem grac w sudoku","jak mam grac?","jak grac","wujasnisz zasady?"},
		{"W sudoku gra siê na planszy o wymiarach 9x9 podzielonej na \n	mniejsze obszary o wymiarach 3x3. Na pocz¹tku gry niektóre z pól \n	planszy Sudoku s¹ ju¿ wype³nione liczbami. Celem gry jest \n	uzupe³nienie pozosta³ych pól planszy cyframi od 1 do 9 \n	(po jednej cyfrze w ka¿dym polu)."},
		
		//NIE
		{"tak"},
		{"Dlaczego tak?","A mo¿e nie?","Nie Nie Nie!!!!!!!"},
		//NIE
		{"nie"},
		{"Dlaczego nie?","A mo¿e tak?","TAK TAK TAK!!!!!!!"},
		//osobowosc
		{"co lubisz","Twoja ulubiona","zainteresowania","hobby"},
		{"nie wiem, jestem botem","co Ty slepy?","bota pytasz?"},
		//helperr
		{"czy mozesz mi pomoc?","chcia³bym bys mi pomogl","potrzebuje pomocy","pomozesz mi?"},
		{"why not?","no dobra ³ajzo","je¿eli ¿¹dasz","a ile p³acisz? no dobra nie jestem materialist¹ jestem botem","niech pomyœlê...ok..."},
		//helper
		{"masz mi pomoc","do roboty","musisz mi pomoc","rób!"},
		{"co ja murzyn?","nie bêdê Twoim niewolnikiem","wal siê","no chyba nie","sk¹d siê urwa³eœ?"},
		//obrazliwe
		{"Ty debilu","jestes g³upi","kretyn","idiota","Ty idioto","Ty kretynie"},
		{"nie gadam z Tob¹","chyba Ty tej","zal..."},
		//opowiastki
		{"powiesz cos ciekawego?","opowiedz cos","co tam w œwiecie?","opowiedz historie"},
		{"przecie¿ jestem botem, nie znam historyjek","mam bugi w kodzie","pssst, moi programiœci nic nie umiej¹"},
		//podtrzymanie rozmowy
		{"no i?","co z tego?","co dalej?","i?","mhm","taaa","hmmm"},
		{"pe³nym zdaniem proszê","nie wiem, Ty musiszz zdecydowaæ","jestem elokwentniejszy"},
		//bycie botem
		{"jestes botem?","jestes czlowiekiem?","czy myslisz?","potrafisz czuc?","czy masz uczucia?"},
		{"jestem cz³owiekobotem, jasne ¿e czujê i myœlê","a jak Ty s¹dzisz?","nie wiem czy chcê odpowiadaæ na to pytanie"},
		//sens istnienia
		{"sens zycia","jaki jest sens istnienia?","jaki jest sens zycia?","po co ¿yjemy?","co sie w zyciu liczy?","jak zyc?"},
		{"jedno s³owo - JAVA"},
		//wiara
		{"jestes wierzacy?","istnieje bog?","chodzisz do kosciola?"},
		{"nie jestem upowa¿niony do odpowiadania \n	na tego typu pytania \n	#poprawnoœcPolityczna"},
		//lol
		{"podpowiedz"},
		{"w x=2 y=4 moze byc odpowiedz 9","w x=5 y=1 moze byc odpowiedz 6","w x=7 y=5 moze byc odpowiedz 3","w x=9 y=3 moze byc odpowiedz 6","w x=1 y=3 moze byc odpowiedz 4","w x=6 y=6 moze byc odpowiedz 2","w x=7 y=4 moze byc odpowiedz 9","w x=5 y=3 moze byc odpowiedz 9","w x=3 y=4 moze byc odpowiedz 1","w x=8 y=7 moze byc odpowiedz 9","w x=3 y=7 moze byc odpowiedz 7","w x=9 y=1 moze byc odpowiedz 4",},
		//cd -wiersze-ok
		{"czy w wierszu musza byc rozne cyfry?","kazda cyfra w wierszu musi byc inna?"},
		{"tak","oczywiœcie"},
		//cd -wiersze-nie ok
		{"nie moge wpisac dwoch identycznych cyfr w wierszu?","czy cyfry w wierszu moga sie powtarzac?","jak wpisywaæ cyfry w wierszu?"},
		{"Cyfry nie mog¹ siê powtarzaæ","Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dym wierszu"},
		//cd -kolumny-ok
		{"czy w kolumnie musza byc rozne cyfry?","kazda cyfra w kolumnie musi byc inna?"},
		{"tak","oczywiœcie"},
		//cd -kolumny-nie ok
		{"nie moge wpisac dwoch identycznych cyfr w kolumny?","czy cyfry w kolumnie moga sie powtarzac?","jak wpisywaæ cyfry w kolumnie?"},
		{"Cyfry nie mog¹ siê powtarzaæ","Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dej kolumnie"},
		//cd -kwadraty-ok
		{"czy w kwadracie musza byc rozne cyfry?","kazda cyfra w kwadracie musi byc inna?"},
		{"tak","oczywiœcie"},
		//cd -kwadraty-nie ok
		{"nie moge wpisac dwoch identycznych cyfr w kwadracie?","czy cyfry w kwadracie moga sie powtarzac?","jak wpisywaæ cyfry w kwadracie?"},
		{"Cyfry nie mog¹ siê powtarzaæ","Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dym kwadracie"},
		//regu³y wiersz
		{"jakie sa reguly w wierszu?","wiersz?","jak wpisywac cyfry do wiersza?","jakie cyfry wpisywac do wiersza?","wiersz-jak wpisywac?"},
		{"Kazda cyfra moze siê pojawiæ tylko raz w ka¿dym wierszu. Cyfry od 1 do 9"},
		//regu³y kolumna
		{"jakie sa reguly w kolumnie?","kolumna?","jak wpisywac cyfry do kolumny?","jakie cyfry wpisywac do kolumny?","kolumna-jak wpisywac?"},
		{"Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dej kolumnie. Cyfry od 1 do 9"},
		//regu³y wiersz
		{"jakie sa reguly w kwadracie?","kwadrat","jak wpisywac cyfry do kwadratu?","jakie cyfry wpisywac do kwadratu?","kwadrat-jak wpisywac?"},
		{"Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dym kwadracie. Cyfry od 1 do 9"},
		//regu³y-nie zrozumiane
		{"jak graæ?"},
		{"nie rozumiem, uzyj googla albo inaczej sformuuj pytanie o zasady jaœniej"},
		//HELP
		{"help", "pomoc", "pomó¿"},
		{"help - wyświetla pomoc (o nikt na to nie wpadł...) \n	zasady - wyœwietla ogólne zasady \n	podpowiedz - wyœwietla podpowiedŸ \n	cyfry w kwadracie/kolumnie/wierszu - wyœwietla podpowiedŸ na temat kwadratu/kolumny/wiersza \n	podpowiedz kwadrat/kolumne/wiersz - podpowiada naj³atwiejszy kwadrat/kolumne/wiersz \n	opowiedz cos \n	jaki jest sens zycia?	"},
			
		//Standard
		{"Nie panimaju","Napisz coœ normalnego...","Facepalm","Nie rozumie",
		"Nie wiem o co chodzi. Masz ziemniaka.", "No ten tego, nie wiem", "¯e co?"},
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
	
	//fcja sprawdza czy stringi s¹ sobie równe
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
		setSize(800,400);
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
			//while(
			//	input.charAt(input.length()-1)=='!' ||
			//	input.charAt(input.length()-1)=='.' ||
			//	input.charAt(input.length()-1)=='?'
			//){
			//	input=input.substring(0,input.length()-1);
			//}
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
					// losujemy odpowiedŸ
					int r=(int)Math.floor(Math.random()*ChatBotText[(j*2)+1].length);
					addTextToBox("\n-->SBOT:\t"+ChatBotText[(j*2)+1][r]);
				}
				j++;
				//nie znalezlismy odpowiedzi 
				if(j*2==ChatBotText.length-1 && re==0){
					re=1;
				}
			}
			
			//-----Standatdowy output bota (jak nie znajdzie odpowiedzi)--------------
			if(re==1){
				// losujemy odpowiedŸ
				int r=(int)Math.floor(Math.random()*ChatBotText[ChatBotText.length-1].length);
				addTextToBox("\n-->SBOT:\t"+ChatBotText[ChatBotText.length-1][r]);
			}
			addTextToBox("\n");
		}
	}
	

}
