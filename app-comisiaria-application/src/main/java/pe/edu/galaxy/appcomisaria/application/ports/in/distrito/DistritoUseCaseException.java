package pe.edu.galaxy.appcomisaria.application.ports.in.distrito;

public class DistritoUseCaseException extends Exception {

	private static final long serialVersionUID = -8061702186303990281L;

	public DistritoUseCaseException() {
	}

	public DistritoUseCaseException(String message) {
		super(message);
	}

	public DistritoUseCaseException(Throwable cause) {
		super(cause);
	}

	public DistritoUseCaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public DistritoUseCaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
