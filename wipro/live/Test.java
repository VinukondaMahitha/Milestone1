package live;

import music.playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
public static void main(String[] args) {
	Veena v=new Veena();
	v.play();
	Saxophone s=new Saxophone();
	s.play();
	playable p=v;
	playable p1=s;
	p.play();
	p1.play();
}
}
