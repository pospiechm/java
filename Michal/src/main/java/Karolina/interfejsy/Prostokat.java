package Karolina.interfejsy;

public class Prostokat implements Figura{

  private double a;
  private double b;

  public Prostokat(double a, double b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public double obliczPole() {
    return a * b;
  }

  @Override
  public double obliczObwod() {
    return 2*a + 2*b;
  }

  public double getA() {
    return a;
  }

  public void setA(double a) {
    this.a = a;
  }

  public double getB() {
    return b;
  }

  public void setB(double b) {
    this.b = b;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Prostokat)) {
      return false;
    }

    Prostokat prostokat = (Prostokat) o;

    if (Double.compare(prostokat.a, a) != 0) {
      return false;
    }
    return Double.compare(prostokat.b, b) == 0;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(a);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(b);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "Prostokat{" +
        "a=" + a +
        ", b=" + b +
        '}';
  }
}
