import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  // The painter needs to know the number of rows and columns.
  int gridRows, gridCols;

  public PainterPlus(int pGridRows, int pGridCols) {
    super();
    gridRows = pGridRows;
    gridCols = pGridCols;
  }
  
  // Painter does not provide `turnRight()` method by default.
  // Painter only provides `turnLeft()`, so I am just using it 
  // to turn the painter to the right.
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }

  // Ensure the painter is facing east.
  public void faceEast() {
    // If it is already facing east exit no need to do anything.
    if (isFacingEast()) {
      return;
    } else if(isFacingWest()) {
      turnLeft();
      turnLeft();
    } else if(isFacingNorth()) {
      turnRight();
    } else if(isFacingSouth()) {
      turnLeft();
    }
  }

  // Similar to `faceNorth()`, but makes the painter face north.
  public void faceNorth() {
    // If it is already facing north exit no need to do anything.
    if (isFacingNorth()) {
      return;
    } else if(isFacingSouth()) {
      turnLeft();
      turnLeft();
    } else if(isFacingEast()) {
      turnRight();
    } else if(isFacingWest()) {
      turnLeft();
    }
  }

  // Similar to `faceSouth()`, but makes the painter face south.
  public void faceSouth() {
    // If it is already facing north exit no need to do anything.
    if (isFacingSouth()) {
      return;
    } else if(isFacingNorth()) {
      turnLeft();
      turnLeft();
    } else if(isFacingEast()) {
      turnLeft();
    } else if(isFacingWest()) {
      turnRight();
    }
  }

  // Similar to `faceWest()`, but makes the painter face west.
  public void faceWest() {
    // If it is already facing west exit no need to do anything.
    if (isFacingWest()) {
      return;
    } else if(isFacingEast()) {
      turnLeft();
      turnLeft();
    } else if(isFacingNorth()) {
      turnLeft();
    } else if(isFacingSouth()) {
      turnRight();
    }
  }

  // This method moves the painter back to (0, 0). 
  public void moveToOrigin() {
    // Need to make sure the painter is facing west because the painter be moving
    // backwards in the x-axis.
    faceWest();
    // Move till the second pixel in the row is reached.
    for(int x = getX(); x >= 1; x--) {
      if (canMove()) move();
    }

    // Make the painter face north.
    turnRight();
    
    // Move till the second pixel of the column is reached.
    for(int y = getY(); y >= 1; y--) {
      if (canMove()) move();
    }
    // Make the painter face east.
    faceEast();
  }

  // Move the painter to a grid coordinate. 
  public void moveTo(int x, int y) {
    // If the painter is already on the desired grid coordinate, exit early.
    if(x == getX() && y == getY()) {
      return;
    }
    
    // Do not move to origin if it is already at origin point.
    if(getX() != 0 || getY() != 0) {
      moveToOrigin();
    }
    
    for (int i = 0; i < x; i++) {
      if (canMove()) move();
    }
    turnRight();
    for(int i = 0; i < y; i++) {
      if (canMove()) move();
    }

    // Make the painter face east.
    faceEast();
  }

  // This method paints on a grid coordinate with specified color. The 
  // coordinates given are actually offset from the last coordinate the painter 
  // was on.
  public void paintGrid(int x, int y, String color) {
    moveTo(x, y);
    paint(color);
  }

  // This method paints a line between two coordinates on the same y axis. 
  public void paintLineX(int startX, int endX, String color) {
    // The y coordinate is not changing, and I am using it multiple times in this method.
    // So just saving it as a constant.
    final int y = getY();
    paintGrid(startX, y, color);
    for(int x = startX + 1; x <= endX; x++) {
      paint(color);
      move();
    }
  }
}
