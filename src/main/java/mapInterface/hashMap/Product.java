package mapInterface.hashMap;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Product {
    private String name;
    private String description;

    // agar equals() and hashCode() override nakoni dar on sorat baraye do ta key object ba dadeye yeksan, vaghti moghayese mishan chon adrese motafavet daran fekr mikone motafavetan dar hali ke dadeye yeksan daran
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
