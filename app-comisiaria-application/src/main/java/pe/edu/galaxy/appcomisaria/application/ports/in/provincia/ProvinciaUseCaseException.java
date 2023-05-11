package pe.edu.galaxy.appcomisaria.application.ports.in.provincia;

public class ProvinciaUseCaseException extends Exception {

	private static final long serialVersionUID = -8061702186303990281L;

	public ProvinciaUseCaseException() {
	}

	public ProvinciaUseCaseException(String message) {
		super(message);
	}

	public ProvinciaUseCaseException(Throwable cause) {
		super(cause);
	}

	public ProvinciaUseCaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProvinciaUseCaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
