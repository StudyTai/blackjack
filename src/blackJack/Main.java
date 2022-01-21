package blackJack;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		Trump trump = new Trump();
		int startnum = 0;
		int nc = 1;
		ArrayList<Integer> player = trump.Number();
		int sum = 0;
		System.out.println("～ブラックジャック～");
		System.out.println("～あなたのカード～");
		for(int i=0;i<3;i++) {
			if(i==0) {
				continue;
			}
			String startcard = trump.change(player.get(i));
			int startcardnum = trump.changenum(player.get(i));
			System.out.println(i+"枚目："+startcard);
			sum += startcardnum;
			player.remove(i);
		}
		System.out.println("合計："+sum);
		System.out.println("もう一枚引きますか？(1：はい,それ以外：いいえ)");
		int toadd = scanner.nextInt();
		while (toadd==1) {
			nc +=1;
			String card = trump.change(player.get(nc));
			int cardnum = trump.changenum(player.get(nc));
			System.out.println(nc+1+"枚目："+card);
	        sum += cardnum;
	        System.out.println("合計："+sum);
	        if(nc>=49) {
	        	break;
	        }else {
	        	System.out.println("もう一枚引きますか？(1：はい,それ以外：いいえ)");
				int foradd = scanner.nextInt();
				if(foradd!=1) {
					break;
				}
	        }
			
		}
		System.out.println("～敵のカード～");
		for(int i=1;i<=2;i++) {
			String startcard = trump.change(player.get(51-i));
			startnum += trump.changenum(player.get(51-i));
			System.out.println(i+"枚目："+startcard);
		}
		int bd = Math.abs(startnum-21);
		int pd = Math.abs(sum-21);
		System.out.println("敵から21への近さ："+bd);
		System.out.println("あなたから21への近さ："+pd);
		if(bd-pd>0) {
			System.out.println("あなたの勝利です！");
		}else if(pd-bd>0) {
			System.out.println("敵の勝利です！");
		}else {
			System.out.println("同点です！");
			
		}
	}

}
