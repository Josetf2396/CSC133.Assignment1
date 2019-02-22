package com.mycompany.a1;

import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.Label;
import com.codename1.ui.events.ActionEvent;
import java.lang.String;

public class Game {

	private GameWorld gw;

	public Game() {
		gw = new GameWorld();
		this.gw.init();
		play();
	}

	private void play() {
		Label myLabel = new Label("Enter a Command:");
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.addComponent(myTextField);
		this.show();
		
		myTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				switch (sCommand.charAt(0)) {
				case 'a':
					gw.addNewAstroid();
					break;
				case 'y':
					gw.nonPlayerShip();
					break;
				case 'b':
					gw.blinkingStation();
					break;
				case 's':
					gw.playerShip();
					break;
				case 'i':
					gw.increaseSpeed();
					break;
				case 'd':
					gw.decreaseSpeed();
					break;
				case 'l':
					gw.turnLeft();
					break;
				case 'r':
					gw.turnRight();
					break;
				case '>':
					gw.turnMissleLauncher();
					break;
				case 'f':
					gw.fire();
					break;
				case 'L':
					gw.launchNPSMissle();
					break;
				case 'j':
					gw.jump();
					break;
				case 'n':
					gw.reloadMissle();
					break;
				case 'k':
					gw.eliminateAstroid();
					break;
				case 'e':
					gw.elimnateNPS();
					break;
				case 'E':
					gw.explodePS();
					break;
				case 'c':
					gw.crashPS();
					break;
				case 'h':
					gw.hitNPS();
					break;
				case 'x':
					gw.collideAsteroid();
					break;
				case 'I':
					gw.collideAsteroidNPS();
					break;
				case 't':
					gw.tick();
					break;
				case 'p':
					gw.print();
					break;
				case 'm':
					gw.map();
					break;
				case 'q':
					gw.quit();
					break;
				// add code to handle rest of the commands
				} // switch
			} // actionPerformed
		} // new ActionListener()
		); // addActionListener
	} // play