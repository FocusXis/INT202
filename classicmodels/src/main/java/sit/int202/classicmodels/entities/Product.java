package sit.int202.classicmodels.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@NamedQueries({
        @NamedQuery(name = "PRODUCT.FIND_ALL", query = "SELECT p FROM Product p"),
        @NamedQuery(name = "PRODUCT.COUNT", query = "SELECT count(p) as count FROM Product p")
})
@Table(name = "products", indexes = {@Index(name = "productLine", columnList = "productLine")})
@Getter
@Setter
@Entity
public class Product {
    @Id
    @Column(name = "productCode", nullable = false, length = 15)
    private String id;
    private String productName;
    private String productLine;
    private String productScale;
    private String productVendor;
    @Column(columnDefinition = "text")
    private String productDescription;
    private Integer quantityInStock;
    private Double buyPrice;
    private Double msrp;
}
