package com.irelandpenguin_01;

public class TestDemo {

	public static void main(String[] args) {
		Game g = new KingImpl();
		g.playerGame();
		KingImpl king  = (KingImpl) g;
		king.setGameName("chess");
		king.setPlayerName("irelandpenguin");
		king.setPlayerTimer(1.00);
		System.out.print(g.toString());
	}

}
