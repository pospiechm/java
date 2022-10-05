package Karolina.interfejsy;

public class TrojkatProstokatny implements Figura {

  private double a;
  private double b;
  private double c;

  public TrojkatProstokatny (double a, double b, double c) {
    this.a=a;
    this.b=b;
    this.c=c;
  }

  @Override
  public double obliczPole() {
    return 1/2 * a *b;
  }

  @Override
  public double obliczObwod() {
    return a+b+c;
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

  public double getC() {
    return c;
  }

  public void setC(double c) {
    this.c = c;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TrojkatProstokatny)) {
      return false;
    }

    TrojkatProstokatny that = (TrojkatProstokatny) o;

    if (Double.compare(that.a, a) != 0) {
      return false;
    }
    if (Double.compare(that.b, b) != 0) {
      return false;
    }
    return Double.compare(that.c, c) == 0;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits(a);
    result = (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(b);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    temp = Double.doubleToLongBits(c);
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "TrojkatProstokatny{" +
        "a=" + a +
        ", b=" + b +
        ", c=" + c +
        '}';
  }
}
