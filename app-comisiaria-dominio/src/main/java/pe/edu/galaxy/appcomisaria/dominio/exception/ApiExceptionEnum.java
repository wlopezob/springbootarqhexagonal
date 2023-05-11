package pe.edu.galaxy.appcomisaria.dominio.exception;

public enum ApiExceptionEnum {
  ERR001("ERR001", "Error al obtener el listado de departamentos en el webclient",
    ErrorCategory.UNEXPECTED),
  ERR002("ERR002", "Error al obtener el listado de provincias en el webclient",
    ErrorCategory.UNEXPECTED),
  ERR003("ERR003", "Error al obtener el listado de distritos en el webclient",
    ErrorCategory.UNEXPECTED),
  ERR004("ERR004", "Error al obtener el listado de comisarias en el webclient",
    ErrorCategory.UNEXPECTED);

  ApiExceptionEnum(String code, String description, ErrorCategory errorCategory) {
    this.code = code;
    this.description = description;
    this.errorCategory = errorCategory;
  }

  private String code;
  private String description;
  private ErrorCategory errorCategory;
  private String component = "ux-botfriend-v1";

  /**
   * Construye el ApiException personalizado.
   *
   * @param error Throwable con el error para su propagacion
   * @return ApiException
   */
  public ApiException buildException(Throwable error) {
    ApiException apiException = new ApiException();
    apiException.setCode(code);
    apiException.setDescription(description);
    apiException.setComponent(component);
    apiException.setHttpStatus((int) errorCategory.getHttpStatus());
    apiException.setCause(error);
    return apiException.push();
  }

  /**
   * Construye el ApiException personalizado.
   *
   * @return ApiException
   */
  public ApiException buildException() {
    ApiException apiException = new ApiException();
    apiException.setCode(code);
    apiException.setDescription(description);
    apiException.setComponent(component);
    apiException.setHttpStatus((int) errorCategory.getHttpStatus());
    return apiException.push();
  }
}
