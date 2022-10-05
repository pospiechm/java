package Enum;

public class Tarcza {

    private Material material;


    public Tarcza(Material material) {
        this.material = material;


    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial (Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Tarcza{" +
                "material=" + material +
                '}';
    }
}
