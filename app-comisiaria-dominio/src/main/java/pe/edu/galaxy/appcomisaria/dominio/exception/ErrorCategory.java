package pe.edu.galaxy.appcomisaria.dominio.exception;

import lombok.Getter;

@Getter
public enum ErrorCategory {
  INVALID_REQUEST("invalid-request", 400),
  ARGUMENT_MISMATCH("argument-mismatch", 400),
  UNAUTHORIZED("unauthorized", 401),
  FORBIDDEN("forbidden", 403),
  RESOURCE_NOT_FOUND("resource-not-found", 404),
  CONFLICT("conflict", 409),
  PRECONDITION_FAILED("precondition-failed", 412),
  EXTERNAL_ERROR("external-error", 500),
  HOST_NOT_FOUND("host-not-found", 500),
  UNEXPECTED("unexpected", 500),
  NOT_IMPLEMENTED("not-implemented", 501),
  SERVICE_UNAVAILABLE("service-unavailable", 503),
  EXTERNAL_TIMEOUT("external-timeout", 503);

  private String property;
  private int httpStatus;

  private ErrorCategory(String property, int httpStatus) {
    this.property = property;
    this.httpStatus = httpStatus;
  }
}