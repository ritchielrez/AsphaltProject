import org.code.neighborhood.*;

public class PainterPlus extends Painter {
  // Painter does not provide `turnRight()` method by default.
  // Painter only provides `turnLeft()`, so I am just using it 
  // to turn the painter to the right.
  public void turnRight() {
    turnLeft();
    turnLeft();
    turnLeft();
  }
  
  // Move the painter to a grid coordinate. Optionally move the painter 
  // to a specific direction by the end. The coordinates given are actually
  // offset from the last coordinate the painter was on.
  public void moveTo(int x, int y, String direction) throws RuntimeException {
    for (int i = 0; i < x; i++) {
      if (canMove()) move();
    }
    turnRight();
    for(int i = 0; i < y; i++) {
      if (canMove()) move();
    }

    switch(direction.toLowerCase()) {
      case "north": {
        turnLeft();
        turnLeft();
        break;
      }
      case "south": {
        break;
      }
      case "east": {
        turnLeft();
        break;
      }
      case "west": {
        turnRight();
        break;
      }
      default: {
       throw new RuntimeException("Unreachable."); 
      }
    }
  }

  public void moveTo(int x, int y) {
    moveTo(x, y, "south");
  }

  // `paint()` method paints on a grid coordinate with specified color
  // and optionally the direction of the painter at after the pixel has
  // been drawn can be specified as well. The coordinates given are actually
  // offset from the last coordinate the painter was on.
  public void paintTo(int x, int y, String color, String direction) {
    moveTo(x, y, direction);
    paint(color);
    move();
  }
  public void paintTo(int x, int y, String color) {
    moveTo(x, y);
    paint(color);
    move();
  }
}
