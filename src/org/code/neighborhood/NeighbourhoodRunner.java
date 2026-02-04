import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    // Number of grids in a row or column
    final int gridCount = 16;
    AsepriteLogo logoPainter = new AsepriteLogo(gridCount, gridCount);
    logoPainter.setPaint(Integer.MAX_VALUE);
    logoPainter.paintLogo();
  }
}
