package org.dimigo.exception;

public class AgeCheckException extends Exception {

	AgeCheckException(){}
	AgeCheckException(Movie movie){
		method(movie);
	}
	
	private void method(Movie movie){
		System.out.println(movie.getTitle()+ "은/는 " + movie.getLimitAge() + 
				"세 이상 관람가입니다.");
	}
	
}
