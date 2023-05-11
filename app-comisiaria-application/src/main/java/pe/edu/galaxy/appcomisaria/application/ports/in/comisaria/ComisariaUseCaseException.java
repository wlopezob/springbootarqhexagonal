package pe.edu.galaxy.appcomisaria.application.ports.in.comisaria;

public class ComisariaUseCaseException extends Exception {

	private static final long serialVersionUID = -8061702186303990281L;

	public ComisariaUseCaseException() {
	}

	public ComisariaUseCaseException(String message) {
		super(message);
	}

	public ComisariaUseCaseException(Throwable cause) {
		super(cause);
	}

	public ComisariaUseCaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public ComisariaUseCaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
