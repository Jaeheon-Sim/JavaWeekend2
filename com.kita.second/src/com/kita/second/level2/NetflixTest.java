package com.kita.second.level2;

public class NetflixTest {
	public static void main(String[] args) {
		Viewer rv = new Viewer();
		rv.chooseNew();
		
		
		ProGamer sim = new ProGamer();
		Game gm = new Game();
		Bg bg = new Bg();
		Ow ow = new Ow();
		sim.work(bg);
		sim.work(ow);
		sim.work(gm);
		
		
	}
}
