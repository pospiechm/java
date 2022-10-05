package Karolina.interfejsy;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Okrag implements Figura {

  private double r;

  public Okrag (double r) {
    this.r = r;
  }

  @Override
  public double obliczPole() {
    return PI* pow(r, 2);
  }

  @Override
  public double obliczObwod() {
    return 2*PI*r;
  }

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Okrag)) {
      return false;
    }

    Okrag okrag = (Okrag) o;

    return Double.compare(okrag.r, r) == 0;
  }

  @Override
  public int hashCode() {
    long temp = Double.doubleToLongBits(r);
    return (int) (temp ^ (temp >>> 32));
  }

  @Override
  public String toString() {
    return "Okrag{" +
        "r=" + r +
        '}';
  }
}
