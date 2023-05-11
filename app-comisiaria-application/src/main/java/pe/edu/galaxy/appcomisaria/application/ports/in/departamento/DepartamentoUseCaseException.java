package pe.edu.galaxy.appcomisaria.application.ports.in.departamento;

public class DepartamentoUseCaseException extends Exception {

	private static final long serialVersionUID = -8061702186303990281L;

	public DepartamentoUseCaseException() {
	}

	public DepartamentoUseCaseException(String message) {
		super(message);
	}

	public DepartamentoUseCaseException(Throwable cause) {
		super(cause);
	}

	public DepartamentoUseCaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public DepartamentoUseCaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
