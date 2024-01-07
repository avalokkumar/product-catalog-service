package com.globomart.estore.api.handler;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.zalando.problem.spring.web.advice.ProblemHandling;

import com.globomart.estore.api.api.model.CustomResponse;
import com.globomart.estore.api.api.model.ProductResponse;
import com.globomart.estore.api.exception.ProductCatalogueBaseException;
import com.globomart.estore.api.util.ResponseBuilder;

@ControllerAdvice
public class BaseExceptionHandler implements ProblemHandling {

	@Autowired
	private ResponseBuilder<ProductResponse> responseBuilder;

	@ExceptionHandler({ ProductCatalogueBaseException.class })
	public ResponseEntity<CustomResponse<ProductResponse>> handleBaseException(HttpServletRequest request,
			ProductCatalogueBaseException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(responseBuilder.buildResponse(Collections.emptyList(), ex.getProblems()));
	}

	/*
	 * @ExceptionHandler({ Exception.class }) public
	 * ResponseEntity<CustomResponse<ProductResponse>>
	 * handleException(HttpServletRequest request, Exception ex) { ThrowableProblem
	 * problem = Problem.builder().withType(URI.create("api/dev/estore/v1/product"))
	 * .withStatus(INTERNAL_SERVER_ERROR).with("code", "ER36").with("message",
	 * "Internal Server Error") .build(); List<ThrowableProblem> problems =
	 * Collections.singletonList(problem); return
	 * ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
	 * .body(responseBuilder.buildResponse(Collections.emptyList(), problems)); }
	 */
}