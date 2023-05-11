package pe.edu.galaxy.appcomisaria.dominio.exception;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DataApiException {
  private String code;
  private String description;
  private String component;
  private List<DataApiException> details;
  private int httpStatus;
}

