package br.com.hyperdev.apiclients.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String Message) {
		super(Message);
	}
}
