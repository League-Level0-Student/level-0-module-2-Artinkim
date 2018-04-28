package extra;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */


public class StarShow {
	
	Robot robot = new Robot("batman");
	Random rand = new Random();
	
	void makeStars() {
		
		
		
		drawStar(150);
		robot.setSpeed(8);

		int robotX = 10;

		int robotY = 950;

		int starSize = 25;


		// 12. Repeat the steps #19 to #18, 30 times

			
	
			robot.setX(robotX);
	
			robot.setY(robotY);
	
			drawStar(starSize);
	
			robotX+=starSize;
	
			robotY-=starSize;
	
			starSize+=20;
	
		robot.turn(12);

	for(int i = 0;i<=30;i++)
	{
	robot.setPenWidth(i);
		robot.setPenColor(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
	}
	}

	private void drawStar(int starSize) {
		robot.penDown();
for(int i=0;i<=5;i++)
{
	robot.move(starSize);		
	robot.turn(144);
}
	}

public static void main(String[] args) 
{
	new StarShow().makeStars();
}

}			
	
	







