package gift.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

public class OptionRequestDto {
    @Length(min = 1, max = 50, message = "상품의 이름은 공백을 포함하여 최대 50자까지 입력할 수 있습니다.")
    @Pattern(
            regexp = "^[a-zA-Z0-9가-힣()\\[\\]+\\-&/_]*$",
            message = "이름에는 ( ), [ ], +, -, &, /, _ 외의 특수문자는 입력할 수 없습니다!"
    )
    @NotBlank(message = "상품의 이름은 필수항목입니다.")
    private final String name;


    @Min(1)
    @Max(99_999_999)
    @NotBlank(message = "수량은 필수항목입니다.")
    private final Integer quantity;

    @NotBlank(message = "상품 정보는 필수항목입니다.")
    private final Long productId;

    public OptionRequestDto(String name, Integer quantity, Long productId) {
        this.name = name;
        this.quantity = quantity;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Long getProductId() {
        return productId;
    }
}

