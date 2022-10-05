package Karolina.enumeryczny;

public class Chelm {

  private Material material;

  public Chelm(Material material) {
    this.material = material;
  }

  public Material getMaterial() {
    return material;
  }

  public void setMaterial(Material material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return "Chelm{" +
        "material=" + material +
        '}';
  }
}
