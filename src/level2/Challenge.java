package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
		driveDirect(1000,1000);
		sleep(1500);
		driveDirect(500,1000);
		sleep(620);
		driveDirect(1000,1000);
		sleep(2500);
		driveDirect(1000,500);
		sleep(640);
		driveDirect(1000,1000);
		sleep(1500);
	}

	public void loop() {
	
	}
}
