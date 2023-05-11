package pe.edu.galaxy.appcomisaria.dominio.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class ApiException extends RuntimeException  {
  private String code;
  private String description;
  private String component;
  private int httpStatus;
  private List<ApiException> details;
  private Throwable cause;

  ApiException(String code, String description, String component,
               int httpStatus, List<ApiException> details,
               Throwable cause) {
    super(description, cause);
    this.code = code;
    this.description = description;
    this.component = component;
    this.httpStatus = httpStatus;
    this.details = details;
    this.cause = cause;
  }

  /**
   * Metodo para añadir la exception como detalle.
   *
   * @return ApiException objeto
   */
  public ApiException push() {
    if (details == null) {
      details = new ArrayList<>();
    }
    if (this.cause instanceof ApiException) {
      ((ApiException) this.cause).getDetails().stream().forEach(details::add);
    }
    details.add(ApiException.builder()
      .code(this.code)
      .description(this.description)
      .component(this.component)
      .httpStatus(this.httpStatus)
      .cause(this.cause)
      .build());
    return this.buildCustom();
  }

  /**
   * Crea una nueva instancia de ApiException.
   *
   * @return ApiException objeto
   */
  public ApiException buildCustom() {
    return new ApiException(this.code, this.description, this.component,
      this.httpStatus, this.details, this.cause);
  }
}
