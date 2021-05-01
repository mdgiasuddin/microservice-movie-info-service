package io.microservice.movieinfoservice.common.exceptionresolve;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDTO {
    private Integer errorCode;
    private String reason;
    private String description;


}
