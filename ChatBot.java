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
		{"Cześc \n	jestem botem który umili ci czas podczas grania W Cudowne SUDOKU \n	możesz mnie zapytac o wiele ciekawych informacji \n	które znajdziesz pod komendą 'help'"},
		//powitania
		{"siema"},
		{"Dzień Dobry","Szczęśc Boże"},
		{"dzien dobry"},
		{"Dzień Dobry","Szczęśc Boże"},
		{"czesc"},
		{"Dzień Dobry","Szczęśc Boże"},
		{"hej"},
		{"Dzień Dobry","Szczęśc Boże"},
		{"siemano"},
		{"Dzień Dobry","Szczęśc Boże"},
		{"witaj", "witam"},
		{"Dzień Dobry"},
		{"witam"},
		{"Dzień Dobry","Szczęśc Boże"},
		//pozegnania
		{"do widzenia"},
		{"Nara","Bywaj","Z Bogiem","Daswidania"},
		{"dobranoc",},
		{"Nara","Bywaj","Z Bogiem","Daswidania"},
		{"na razie"},
		{"Nara","Bywaj","Z Bogiem","Daswidania"},
		{"do zobaczenia"},
		{"Nara","Bywaj","Z Bogiem","Daswidania"},
		{"zegnaj"},
		{"Nara","Bywaj","Z Bogiem","Daswidania"},
		//pytania o samopoczucie
		{"co tam","jak tam","co u ciebie","jak sie czujesz"},
		{"Niezgorzej","Obleci", "Tak se"},
		//regu³y gry w sudoku
		{"zasady"},
		{"W sudoku gra siê na planszy o wymiarach 9x9 podzielonej na \n	mniejsze obszary o wymiarach 3x3. Na poczttku gry niektóre z pól \n	planszy Sudoku s¹ ju¿ wype³nione liczbami. Celem gry jest \n	uzupelnienie pozostalych pól planszy cyframi od 1 do 9 \n	(po jednej cyfrze w kazdym polu)."},
		{"podasz mi reguly sudoku?"},
		{"W sudoku gra siê na planszy o wymiarach 9x9 podzielonej na \n	mniejsze obszary o wymiarach 3x3. Na poczttku gry niektóre z pól \n	planszy Sudoku s¹ ju¿ wype³nione liczbami. Celem gry jest \n	uzupelnienie pozostalych pól planszy cyframi od 1 do 9 \n	(po jednej cyfrze w kazdym polu)."},
		{"jakie sa zasady sudoku?"},
		{"W sudoku gra siê na planszy o wymiarach 9x9 podzielonej na \n	mniejsze obszary o wymiarach 3x3. Na poczttku gry niektóre z pól \n	planszy Sudoku s¹ ju¿ wype³nione liczbami. Celem gry jest \n	uzupelnienie pozostalych pól planszy cyframi od 1 do 9 \n	(po jednej cyfrze w kazdym polu)."},
		{"jak grac w sudoku?"},
		{"W sudoku gra siê na planszy o wymiarach 9x9 podzielonej na \n	mniejsze obszary o wymiarach 3x3. Na poczttku gry niektóre z pól \n	planszy Sudoku s¹ ju¿ wype³nione liczbami. Celem gry jest \n	uzupelnienie pozostalych pól planszy cyframi od 1 do 9 \n	(po jednej cyfrze w kazdym polu)."},
		{"znasz reguly sudoku?"},
		{"W sudoku gra siê na planszy o wymiarach 9x9 podzielonej na \n	mniejsze obszary o wymiarach 3x3. Na poczttku gry niektóre z pól \n	planszy Sudoku s¹ ju¿ wype³nione liczbami. Celem gry jest \n	uzupelnienie pozostalych pól planszy cyframi od 1 do 9 \n	(po jednej cyfrze w kazdym polu)."},
		//NIE
		{"tak"},
		{"Dlaczego tak?","A mo¿e nie?","Nie Nie Nie!!!!!!!"},
		//NIE
		{"nie"},
		{"Dlaczego nie?","A mo¿e tak?","TAK TAK TAK!!!!!!!"},
		//osobowosc
		{"co lubisz?"},
		{"nie wiem, jestem botem","co Ty slepy?","bota pytasz?"},
		{"Twoja ulubiona rzecz?"},
		{"nie wiem, jestem botem","co Ty slepy?","bota pytasz?"},
		{"masz zainteresowania?"},
		{"nie wiem, jestem botem","co Ty slepy?","bota pytasz?"},
		{"czy myslisz?"},
		{"jestem człowiekobotem, jasne ze czuję i myślę","a jak Ty sądzisz?","nie wiem czy chcê odpowiadaæ na to pytanie"},
		{"masz hobby?"},
		{"nie wiem, jestem botem","co Ty slepy?","bota pytasz?"},
		{"masz pasje?"},
		{"nie wiem, jestem botem","co Ty slepy?","bota pytasz?"},
		//helperr
		{"czy mozesz mi pomoc?","chcia³bym bys mi pomogl","potrzebuje pomocy","pomozesz mi?"},
		{"why not?","no dobra ³ajzo","je¿eli ¿¹dasz","a ile p³acisz? no dobra nie jestem materialist¹ jestem botem","niech pomyœlê...ok..."},
		//helper
		{"masz mi pomoc"},
		{"co ja murzyn?","nie będę Twoim niewolnikiem","wal się","no chyba nie","skąd się urwałeś?"},
		{"do roboty"},
		{"co ja murzyn?","nie będę Twoim niewolnikiem","wal się","no chyba nie","skąd się urwałeś?"},
		{"musisz mi pomoc"},
		{"co ja murzyn?","nie będę Twoim niewolnikiem","wal się","no chyba nie","skąd się urwałeś?"},
		{"rób!"},
		{"co ja murzyn?","nie będę Twoim niewolnikiem","wal się","no chyba nie","skąd się urwałeś?"},
		//obrazliwe
		{"Ty debilu"},
		{"nie gadam z Tobą","chyba Ty tej","zal..."},
		{"jestes głupi"},
		{"nie gadam z Tobą","chyba Ty tej","zal..."},
		{"kretyn"},
		{"nie gadam z Tobą","chyba Ty tej","zal..."},
		{"idiota"},
		{"taaa"},
		{"pełnym zdaniem proszę","nie wiem, Ty musiszz zdecydowac","jestem elokwentniejszy"},
		{"i?"},
		{"pełnym zdaniem proszę","nie wiem, Ty musiszz zdecydowac","jestem elokwentniejszy"},
		{"nie gadam z Tobą","chyba Ty tej","zal..."},
		{"Imbecyl"},
		{"nie gadam z Tobą","chyba Ty tej","zal..."},
		//opowiastki
		{"powiesz cos ciekawego?"},
		{"przecież jestem botem, nie znam historyjek","mam bugi w kodzie","pssst, moi programiœci nic nie umieją"},
		{"opowiedz cos"},
		{"przecież jestem botem, nie znam historyjek","mam bugi w kodzie","pssst, moi programiœci nic nie umieją"},
		{"co tam w świecie?"},
		{"przecież jestem botem, nie znam historyjek","mam bugi w kodzie","pssst, moi programiœci nic nie umieją"},
		{"opowiedz historie"},
		{"przecież jestem botem, nie znam historyjek","mam bugi w kodzie","pssst, moi programiœci nic nie umieją"},
		//podtrzymanie rozmowy
		{"no i?"},
		{"pełnym zdaniem proszę","nie wiem, Ty musiszz zdecydowac","jestem elokwentniejszy"},
		{"co z tego?"},
		{"pełnym zdaniem proszę","nie wiem, Ty musiszz zdecydowac","jestem elokwentniejszy"},
		{"co dalej?",},
		{"pełnym zdaniem proszę","nie wiem, Ty musiszz zdecydowac","jestem elokwentniejszy"},
		{"mhm"},
		{"pełnym zdaniem proszę","nie wiem, Ty musiszz zdecydowac","jestem elokwentniejszy"},
		{"hmmm"},
		{"pełnym zdaniem proszę","nie wiem, Ty musiszz zdecydowac","jestem elokwentniejszy"},
		//bycie botem
		{"jestes botem?"},
		{"jestem człowiekobotem, jasne ze czuję i myślę","a jak Ty sądzisz?","nie wiem czy chcê odpowiadaæ na to pytanie"},
		{"jestes czlowiekiem?"},
		{"jestem człowiekobotem, jasne ze czuję i myślę","a jak Ty sądzisz?","nie wiem czy chcê odpowiadaæ na to pytanie"},
		{"Ty idioto"},
		{"nie gadam z Tobą","chyba Ty tej","zal..."},
		{"Ty kretynie"},
		{"nie gadam z Tobą","chyba Ty tej","zal..."},
		{"potrafisz czuc?"},
		{"jestem człowiekobotem, jasne ze czuję i myślę","a jak Ty sądzisz?","nie wiem czy chcê odpowiadaæ na to pytanie"},
		{"czy masz uczucia?"},
		{"jestem człowiekobotem, jasne ze czuję i myślę","a jak Ty sądzisz?","nie wiem czy chcê odpowiadaæ na to pytanie"},
		//sens istnienia
		{"sens zycia","jaki jest sens istnienia?","jaki jest sens zycia?","po co ¿yjemy?","co sie w zyciu liczy?","jak zyc?"},
		{"jedno s³owo - JAVA"},
		//wiara
		{"jestes wierzacy?"},
		{"nie jestem upowa¿niony do odpowiadania \n	na tego typu pytania \n	#poprawnoœcPolityczna"},
		{"istnieje bog?"},
		{"nie jestem upowa¿niony do odpowiadania \n	na tego typu pytania \n	#poprawnoœcPolityczna"},
		{"chodzisz do kosciola?"},
		{"nie jestem upowa¿niony do odpowiadania \n	na tego typu pytania \n	#poprawnoœcPolityczna"},
		//lol
		{"pomoc"},
		{"help - wyświetla pomoc (o nikt na to nie wpadł...) \n	zasady - wyświetla ogólne zasady \n	jak wpisywac cyfry w wierszu? - \n	jak wpisywac cyfry w kolumnie? - \n	jak wpisywac cyfry w kwadracie? - \n	czy w kolumnie musza byc rozne cyfry? - \n	podpowiedz - wyświetla podpowiedź(och... Rly?) \n	cyfry w kwadracie/kolumnie/wierszu - wyświetla podpowiedż na temat kwadratu/kolumny/wiersza \n	podpowiedz kwadrat/kolumne/wiersz - podpowiada najłatwiejszy kwadrat/kolumne/wiersz \n	opowiedz cos \n	jaki jest sens zycia?	"},
		{"podpowiedz"},
		{"w x=2 y=4 moze byc odpowiedz 9","w x=5 y=1 moze byc odpowiedz 6","w x=7 y=5 moze byc odpowiedz 3","w x=9 y=3 moze byc odpowiedz 6","w x=1 y=3 moze byc odpowiedz 4","w x=6 y=6 moze byc odpowiedz 2","w x=7 y=4 moze byc odpowiedz 9","w x=5 y=3 moze byc odpowiedz 9","w x=3 y=4 moze byc odpowiedz 1","w x=8 y=7 moze byc odpowiedz 9","w x=3 y=7 moze byc odpowiedz 7","w x=9 y=1 moze byc odpowiedz 4",},
		//cd -wiersze-ok
		{"czy w wierszu musza byc rozne cyfry?"},
		{"tak","oczywiœcie"},
		{"kazda cyfra w wierszu musi byc inna?"},
		{"tak","oczywiœcie"},
		//cd -wiersze-nie ok
		{"nie moge wpisac dwoch identycznych cyfr w wierszu?"},
		{"Cyfry nie mogą się powtarzac","Każda cyfra może się pojawic tylko raz w każdym wierszu"},
		{"czy cyfry w wierszu moga sie powtarzac?"},
		{"Cyfry nie mogą się powtarzac","Każda cyfra może się pojawic tylko raz w każdym wierszu"},
		{"jak wpisywac cyfry w wierszu?"},
		{"Cyfry nie mogą się powtarzac","Każda cyfra może się pojawic tylko raz w każdym wierszu"},
		//cd -kolumny-ok
		{"kazda cyfra w kolumnie musi byc inna?"},
		{"tak","oczywiœcie"},
		{"czy w kolumnie musza byc rozne cyfry?"},
		{"tak","oczywiœcie"},
		//cd -kolumny-nie ok
		{"nie moge wpisac dwoch identycznych cyfr w kolumny?"},
		{"Cyfry nie mog¹ siê powtarzaæ","Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dej kolumnie"},
		{"czy cyfry w kolumnie moga sie powtarzac?"},
		{"Cyfry nie mog¹ siê powtarzaæ","Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dej kolumnie"},
		{"jak wpisywac cyfry w kolumnie?"},
		{"Cyfry nie mog¹ siê powtarzaæ","Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dej kolumnie"},
		//cd -kwadraty-ok
		{"czy w kwadracie musza byc rozne cyfry?"},
		{"tak","oczywiœcie"},
		{"kazda cyfra w kwadracie musi byc inna?"},
		{"tak","oczywiœcie"},
		//cd -kwadraty-nie ok
		{"nie moge wpisac dwoch identycznych cyfr w kwadracie?","czy cyfry w kwadracie moga sie powtarzac?","jak wpisywac cyfry w kwadracie?"},
		{"Cyfry nie mog¹ siê powtarzaæ","Ka¿da cyfra mo¿e siê pojawiæ tylko raz w ka¿dym kwadracie"},
		{"kim jestes?"},
		{"jestem człowiekobotem, jasne ze czuję i myślę","a jak Ty sądzisz?","nie wiem czy chcê odpowiadaæ na to pytanie"},
		//regu³y wiersz
		{"jakie sa reguly w wierszu?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym wierszu. Cyfry od 1 do 9"},
		{"wiersz?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym wierszu. Cyfry od 1 do 9"},
		{"jak wpisywac cyfry do wiersza?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym wierszu. Cyfry od 1 do 9"},
		{"jakie cyfry wpisywac do wiersza?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym wierszu. Cyfry od 1 do 9"},
		//regu³y kolumna
		{"jakie sa reguly w kolumnie?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdej kolumnie. Cyfry od 1 do 9"},
		{"kolumna?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdej kolumnie. Cyfry od 1 do 9"},
		{"jak wpisywac cyfry do kolumny?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdej kolumnie. Cyfry od 1 do 9"},
		{"jakie cyfry wpisywac do kolumny?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdej kolumnie. Cyfry od 1 do 9"},
		{"pomoz"},
		{"help - wyświetla pomoc (o nikt na to nie wpadł...) \n	zasady - wyświetla ogólne zasady \n	jak wpisywac cyfry w wierszu? - \n	jak wpisywac cyfry w kolumnie? - \n	jak wpisywac cyfry w kwadracie? - \n	czy w kolumnie musza byc rozne cyfry? - \n	podpowiedz - wyświetla podpowiedź(och... Rly?) \n	cyfry w kwadracie/kolumnie/wierszu - wyświetla podpowiedż na temat kwadratu/kolumny/wiersza \n	podpowiedz kwadrat/kolumne/wiersz - podpowiada najłatwiejszy kwadrat/kolumne/wiersz \n	opowiedz cos \n	jaki jest sens zycia?	"},
		{"jakie sa reguly w kwadracie?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		{"kwadrat?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},	
		{"jak wpisywac cyfry do kwadratu?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		{"jakie cyfry wpisywac do kwadratu?","kwadrat-jak wpisywac?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		//regu³y wiersz
		{"jakie sa reguly w kwadracie?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		{"kwadrat?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		{"jak wpisywac cyfry do kwadratu?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		{"jakie cyfry wpisywac do kwadratu?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		{"kwadrat-jak wpisywac?"},
		{"Kazda cyfra moze sie pojawic tylko raz w kazdym kwadracie. Cyfry od 1 do 9"},
		//regu³y-nie zrozumiane
		{"jak grac?"},
		{"nie rozumiem, uzyj googla albo inaczej sformuuj pytanie o zasady jaśniej"},
		//HELP
		{"help"},
		{"help - wyświetla pomoc (o nikt na to nie wpadł...) \n	zasady - wyświetla ogólne zasady \n	kim jestes? \n	jak wpisywac cyfry w wierszu? - \n	jak wpisywac cyfry w kolumnie? - \n	jak wpisywac cyfry w kwadracie? - \n	czy w kolumnie musza byc rozne cyfry? - \n	podpowiedz - wyświetla podpowiedź(och... Rly?) \n	cyfry w kwadracie/kolumnie/wierszu - wyświetla podpowiedż na temat kwadratu/kolumny/wiersza \n	podpowiedz kwadrat/kolumne/wiersz - podpowiada najłatwiejszy kwadrat/kolumne/wiersz \n	opowiedz cos \n	jaki jest sens zycia?	"},
		//Historia
		{"bajka"},
		{"Piał kogucik: kukuryku! \n	Wstawaj rano, mój chłopczyku.\n	A chłopczyk się ze snu budzi,\n	Patrzy.... dużo chodzi ludzi;\n	Więc się szybko zrywa z łóżka,\n	By nie uszedł za leniuszka;\n	 I rzekł: za twe kukuryku\n	Dziękuję ci koguciku."},
		{"opowiedz mi bajke"},
		{"Piał kogucik: kukuryku! \n	Wstawaj rano, mój chłopczyku.\n	A chłopczyk się ze snu budzi,\n	Patrzy.... dużo chodzi ludzi;\n	Więc się szybko zrywa z łóżka,\n	By nie uszedł za leniuszka;\n	 I rzekł: za twe kukuryku\n	Dziękuję ci koguciku."},
		//Standard
		{"Nie panimaju","Napisz coś normalnego...","Facepalm","Nie rozumie",
		"Nie wiem o co chodzi. Masz ziemniaka.", "No ten tego, nie wiem", "że co?"},
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
