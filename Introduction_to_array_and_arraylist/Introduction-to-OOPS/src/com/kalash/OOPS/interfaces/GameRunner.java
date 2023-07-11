package com.kalash.OOPS.interfaces;

public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		ChessGame game = new ChessGame();

//		GamingConsole game = new MarioGame();
//		GamingConsole game = new ChessGame();

		GamingConsole[] games = { new MarioGame(), new ChessGame() };
		for (GamingConsole game : games) {
			game.up();
			game.down();
			game.right();
			game.left();
		}

	}

}
