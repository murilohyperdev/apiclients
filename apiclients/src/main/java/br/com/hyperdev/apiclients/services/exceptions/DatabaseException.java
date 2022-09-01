package br.com.hyperdev.apiclients.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DatabaseException(String Message) {
		super(Message);
	}
}
