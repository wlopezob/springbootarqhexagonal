package pe.edu.galaxy.appcomisaria.application.ports.out.departamento;

public class DepartamentoPortException extends Exception {

	private static final long serialVersionUID = -8061702186303990281L;

	public DepartamentoPortException() {
	}

	public DepartamentoPortException(String message) {
		super(message);
	}

	public DepartamentoPortException(Throwable cause) {
		super(cause);
	}

	public DepartamentoPortException(String message, Throwable cause) {
		super(message, cause);
	}

	public DepartamentoPortException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
