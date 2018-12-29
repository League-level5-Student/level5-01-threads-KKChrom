package _02_Advanced_Robot_Race;

import java.lang.reflect.Array;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
		Random rand = new Random();
		Robot[] arr = new Robot[5];
		for(int i = 0;i< arr.length;i++)
		{
			arr[i] = new Robot((50*i),500);
			arr[i].setAngle(0);
		}
		Thread o1 = new Thread(()->{
			arr[0].move(rand.nextInt(50) + 1);
		});
		Thread o2 = new Thread(()->{
			arr[1].move(rand.nextInt(50) + 1);
		});
		Thread o3 = new Thread(()->{
			arr[2].move(rand.nextInt(50) + 1);
		});
		Thread o4 = new Thread(()->{
			arr[3].move(rand.nextInt(50) + 1);
		});
		Thread o5 = new Thread(()->{
			arr[4].move(rand.nextInt(50) + 1);
		});
		o1.start();
		o2.start();
		o3.start();
		o4.start();
		o5.start();
		
}
}
