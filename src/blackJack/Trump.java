package blackJack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Trump {
	public ArrayList<Integer> Number() {
		Random r = new Random();
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i = 0 ; i <= 52 ; i++) {
            num.add(i+1);
    }
		Collections.shuffle(num);
		return num;
	}
	public String change(int n) {
		String card ="";
		switch(n) {
		case 1 ->{
			card="♠A";
		}
		case 2,3,4,5,6,7,8,9,10 -> {
			card="♠"+n;
		}
		case 11 ->{
			card="♠J";
		}
		case 12 ->{
			card="♠Q";
		}
		case 13 ->{
			card="♠K";
		}
		case 14 ->{
			card="♥A";
		}
		case 15,16,17,18,19,20,21,22,23 -> {
			card="♥"+(n-13);
		}
		
		case 24 ->{
			card="♥J";
		}
		case 25 ->{
			card="♥Q";
		}
		case 26->{
			card="♥K";
		}
		case 27 ->{
			card="♦A";
		}
		case 28,29,30,31,32,33,34,35,36 -> {
			card="♦"+(n-26);
		}
		case 37 ->{
			card="♦J";
		}
		case 38 ->{
			card="♦Q";
		}
		case 39 ->{
			card="♦K";
		}
		case 40 ->{
			card="♣A";
		}
		case 41,42,43,44,45,46,47,48,49 -> {
			card="♣"+(n-39);
		}
		case 50 ->{
			card="♣J";
		}
		case 51 ->{
			card="♣Q";
		}
		case 52 ->{
			card="♣K";
		}

	}
	return card;

}
	public Integer changenum(int n) {
		int cardnum = 0;
		switch(n) {
		case 1,2,3,4,5,6,7,8,9,10,11,12,13 -> {
			cardnum=n;
		}
		case 14,15,16,17,18,19,20,21,22,23,24,25,26 -> {
			cardnum=n-13;
		}
		case 27,28,29,30,31,32,33,34,35,36,37,38,39 -> {
			cardnum=n-26;
		}
		case 40,41,42,43,44,45,46,47,48,49,50,51,52 -> {
			cardnum=n-39;
		}

	}
	return cardnum;

}
}