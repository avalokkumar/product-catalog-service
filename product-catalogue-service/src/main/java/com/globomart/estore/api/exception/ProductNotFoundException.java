package com.globomart.estore.api.exception;

import java.util.List;

import org.zalando.problem.ThrowableProblem;

public class ProductNotFoundException extends ProductCatalogueBaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6718633500079264854L;

	public ProductNotFoundException() {
		super();
	}

	public ProductNotFoundException(List<ThrowableProblem> problems) {
		super(problems);
	}

	public ProductNotFoundException(String message) {
		super(message);
	}

}
