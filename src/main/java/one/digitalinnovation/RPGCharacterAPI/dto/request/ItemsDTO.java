package one.digitalinnovation.RPGCharacterAPI.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.RPGCharacterAPI.enums.ItemsType;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemsDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private ItemsType itemsType;

    private Float price;

    @NotEmpty
    @Size(max = 250)
    private String description;
}

