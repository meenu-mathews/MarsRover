package com.marsrover;
import com.marsrover.model.MarsRover;
import com.marsrover.model.Plateau;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MarsRoverTest {
   MarsRover marsRoverObj = new MarsRover();
   Plateau plateauObj = new Plateau();

@Test
public void checkOutput(){
//  System.out.println(marsRoverObj.moveRover(plateauObj.getxCoord(),plateauObj.getyCoord()));
  // assertEquals(marsRoverObj.moveRover(plateauObj.getxCoord(),plateauObj.getyCoord()),"1 3 N");
}
}
