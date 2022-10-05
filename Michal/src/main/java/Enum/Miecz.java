package Enum;

public class Miecz {
    private Material material;


    public Miecz(Material material) {
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
        return "Miecz{" +
                "material=" + material +
                '}';
    }
}