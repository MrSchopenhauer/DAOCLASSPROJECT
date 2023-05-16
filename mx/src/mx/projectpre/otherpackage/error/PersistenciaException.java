package mx.projectpre.otherpackage.error;

public class PersistenciaException extends RuntimeException {

	public PersistenciaException() {
		super();
	}

	public PersistenciaException(String message) {
		super(message);
		
	}

	public PersistenciaException(Throwable cause) {
		super(cause);
	}

	public PersistenciaException(String message, Throwable cause) {
		super(message, cause);
		}

	public PersistenciaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
