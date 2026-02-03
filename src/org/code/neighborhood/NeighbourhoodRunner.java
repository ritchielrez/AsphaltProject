import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    final int gridSize = 16;
    Painter painter = new Painter();
    painter.setPaint(gridSize * gridSize);
  }
}
