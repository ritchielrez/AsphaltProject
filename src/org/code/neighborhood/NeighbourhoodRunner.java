import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    final int gridSize = 16;
    AsepriteLogo logoPainter = new AsepriteLogo(gridSize, gridSize);
    logoPainter.setPaint(Integer.MAX_VALUE);
    logoPainter.paintLogo();
  }
}
