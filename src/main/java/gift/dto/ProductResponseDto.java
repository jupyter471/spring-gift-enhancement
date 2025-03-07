package gift.dto;

import gift.domain.product.Product;

public class ProductResponseDto {
    private final long id;
    private final String name;
    private final int price;
    private final String imgUrl;
    private final String category;

    public ProductResponseDto(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.imgUrl = product.getImgUrl();
        this.category = product.getCategory().getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getCategory() {
        return category;
    }
}
