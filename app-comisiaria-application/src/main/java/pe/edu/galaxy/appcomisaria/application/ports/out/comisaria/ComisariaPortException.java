package pe.edu.galaxy.appcomisaria.application.ports.out.comisaria;

public class ComisariaPortException extends Exception {

	private static final long serialVersionUID = -8061702186303990281L;

	public ComisariaPortException() {
	}

	public ComisariaPortException(String message) {
		super(message);
	}

	public ComisariaPortException(Throwable cause) {
		super(cause);
	}

	public ComisariaPortException(String message, Throwable cause) {
		super(message, cause);
	}

	public ComisariaPortException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
