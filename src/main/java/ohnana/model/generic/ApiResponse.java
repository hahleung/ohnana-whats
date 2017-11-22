package ohnana.model.generic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
@Data
@Builder
public class ApiResponse<T> {
    private ApiData data;

    public static <T> ApiResponse<T> createApiResponse(T classType) {
        return ApiResponse.<T>builder()
                .data(ApiData.createData(classType))
                .build();
    }
}