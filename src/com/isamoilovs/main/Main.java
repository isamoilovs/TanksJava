package com.isamoilovs.main;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Timer;

import com.isamoilovs.display.*;
import com.isamoilovs.game.Game;


public class Main {
	public static void main(String args[]) {
		
		Game tanks = new Game();
		tanks.start();
		
	}
}
