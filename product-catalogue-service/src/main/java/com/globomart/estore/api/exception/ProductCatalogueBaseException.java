package com.globomart.estore.api.exception;

import java.util.ArrayList;
import java.util.List;

import org.zalando.problem.ThrowableProblem;

public class ProductCatalogueBaseException extends Exception {

	private static final long serialVersionUID = 1L;

	private List<ThrowableProblem> problems = new ArrayList<>();

	public ProductCatalogueBaseException() {
		super();
	}

	public ProductCatalogueBaseException(List<ThrowableProblem> problems) {
		this.problems = problems;
	}

	public ProductCatalogueBaseException(String message) {
		super(message);
	}

	public List<ThrowableProblem> getProblems() {
		return problems;
	}

	public void setProblems(List<ThrowableProblem> problems) {
		this.problems = problems;
	}

}
