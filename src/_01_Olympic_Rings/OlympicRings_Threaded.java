package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String args[]) {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	Robot  r1 = new Robot(250, 200);
	Robot r2 = new Robot(300, 250);
	Robot r3 = new Robot(350, 200);
	Robot  r4 = new Robot(400, 250);
	Robot  r5 = new Robot(450, 200);
	
Thread o1 = new Thread(()->{
	r1.penDown();
	r1.setSpeed(10);
	for(int i =0; i<360;i++)
	{
		r1.move(1);
		r1.turn(1);
	}
	r1.hide();
	});
Thread o2 = new Thread(()->{
	r2.penDown();
	r2.setSpeed(10);
	for(int i =0; i<360;i++)
	{
		r2.move(1);
		r2.turn(1);
	}
	r2.hide();
	});
Thread o3 = new Thread(()->{
	r3.penDown();
	r3.setSpeed(10);
	for(int i =0; i<360;i++)
	{
		r3.move(1);
		r3.turn(1);
	}
	r3.hide();
});
Thread o4 = new Thread(()->{
	r4.penDown();
	r4.setSpeed(10);
	for(int i =0; i<360;i++)
	{
		r4.move(1);
		r4.turn(1);
	}
	r4.hide();
});
Thread o5 = new Thread(()->{
	r5.penDown();
	r5.setSpeed(10);
	for(int i =0; i<360;i++)
	{
		r5.move(1);
		r5.turn(1);
	}
	r5.hide();
	
});
o1.start();
o2.start();
o3.start();
o4.start();
o5.start();
}
}
