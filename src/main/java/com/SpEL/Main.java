package com.SpEL;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

	public static void main(String[] args) {
		SpelExpressionParser spel = new SpelExpressionParser();
		Expression expression = spel.parseExpression("{22+44}");
		System.out.println(expression.getValue());
	}
}
