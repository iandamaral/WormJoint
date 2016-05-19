package com.ian.wj.testes;

import static org.fest.swing.launcher.ApplicationLauncher.application;
import static org.fest.swing.finder.WindowFinder.findFrame;

import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.GenericTypeMatcher;
import org.fest.swing.core.Robot;
import org.fest.swing.fixture.FrameFixture;
import org.junit.Test;

import com.ian.wj.WormJoint;

import org.fest.swing.testing.FestSwingTestCaseTemplate;

import static java.awt.event.KeyEvent.VK_SPACE;
/*
public class TesteWJ {

	@Test
	public void testaWJ() {
		Robot robot = BasicRobot.robotWithNewAwtHierarchy();
		robot.settings().delayBetweenEvents(50);		
		application(WormJoint.class).start();
		try {
			Thread.sleep(1000);
			
			FrameFixture frame = findFrame(WormJoint.class).using(robot);	
			frame.click();
			Thread.sleep(1000);
			for (int x=0; x<10;x++) {
				frame.pressKey(VK_SPACE);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}*/

public class TesteWJ {

	@Test
	public int testaWJ() {
		return (1);
	}
}
