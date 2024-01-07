package com.globomart.estore.api.api.model;

import java.util.ArrayList;
import java.util.List;

import org.zalando.problem.ThrowableProblem;

public class CustomResponse<T> {

	private List<T> payload;
	private List<ThrowableProblem> problems;
	private String timeStamp;

	public CustomResponse() {
		problems = new ArrayList<>();
	}

	public CustomResponse(List<T> payload, List<ThrowableProblem> problems, String timeStamp) {
		super();
		this.payload = payload;
		this.problems = problems;
		this.timeStamp = timeStamp;
	}

	public List<T> getPayload() {
		return payload;
	}

	public CustomResponse<T> setPayload(List<T> payload) {
		this.payload = payload;
		return this;
	}

	public List<ThrowableProblem> getProblems() {
		return problems;
	}

	public CustomResponse<T> setProblems(List<ThrowableProblem> problems) {
		this.problems = problems;
		return this;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public CustomResponse<T> setTimeStamp(String timeStamp) {
		System.out.println("CustomResponse.setTimeStamp()****timeStamp***" + timeStamp);
		this.timeStamp = timeStamp;
		return this;
	}

}
