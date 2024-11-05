public class Quadrado extends Quadrilatero{
  public static void main(String[] args) {
   Quadrado quadrado = new Quadrado();
   double lado = 2.5;
   System.out.println(quadrado.calcularArea(lado));
  }
  
  @Override
  public double calcularArea(double l) {
    
    return Math.pow(l,2);
  }
}
