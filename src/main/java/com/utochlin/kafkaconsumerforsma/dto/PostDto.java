package com.utochlin.kafkaconsumerforsma.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDto implements Serializable {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @NotNull(message = "Description must be not null.")
    @Length(max = 255,
            message = "Description length must be smaller than 255 symbols.")
    private String description;

    @NotNull(message = "Message must be not null.")
    @Length(max = 255, message = "Message length must be smaller than 255 symbols.")
    private String message;

    @Length(max = 512,
            message = "ImageLink length must be smaller than 512 symbols.")
    private String imageLink;

    @Length(max = 255,
            message = "ImageName length must be smaller than 255 symbols.")
    private String imageName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime createdAt;

    @Length(max = 255, message = "authorName length must be smaller than 255 symbols.")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String authorName;

}
