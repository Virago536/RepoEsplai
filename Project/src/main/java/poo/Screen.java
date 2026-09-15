package poo;

import java.util.Objects;

public class Screen {
    private String brand;
    private int id;

    public Screen(String brand) {
        if (Objects.isNull(brand) || brand.isBlank())
            throw new InvalidData("Se requiere marca");
        this.brand = brand;
    }

    public void render() {
        System.out.println(this.brand + ": Renderizando frames");
    }
}
