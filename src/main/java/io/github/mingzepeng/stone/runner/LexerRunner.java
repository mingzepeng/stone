package io.github.mingzepeng.stone.runner;

import io.github.mingzepeng.stone.Lexer;
import io.github.mingzepeng.stone.ParseException;
import io.github.mingzepeng.stone.Token;
import io.github.mingzepeng.stone.gui.CodeDialog;

public class LexerRunner {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Lexer l = new Lexer(new CodeDialog());
		for(Token t;(t = l.read()) != Token.EOF;)
			System.out.println("=>" + t.getText());

	}

}
