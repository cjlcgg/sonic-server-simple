package com.sonic.simple.models.dto;

import com.sonic.simple.models.base.TypeConverter;
import com.sonic.simple.models.domain.StepsElements;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author JayWenStar
 * @since 2021-12-17
 */
@ApiModel(value = "StepsElementsDTO 对象", description = "")
@Data
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StepsElementsDTO implements Serializable, TypeConverter<StepsElementsDTO, StepsElements> {

    private Integer stepsId;

    private Integer elementsId;
}
