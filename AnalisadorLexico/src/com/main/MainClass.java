package com.main;

import com.exception.IsiLexicalException;
import com.exception.IsiSyntaxException;
import com.lexico.*;
import com.parser.IsiParser;

public class MainClass {
	public static void main(String[] args) {
		try {
			IsiScanner sc = new IsiScanner("input.isi");
			IsiParser  pa = new IsiParser(sc);
			
			pa.E();
			
			System.out.println("Compilation Successful!");
		} catch (IsiLexicalException ex) {
			System.out.println("Lexical Error "+ex.getMessage());
		}
		catch (IsiSyntaxException ex) {
			System.out.println("Syntax Error "+ex.getMessage());
		}
		catch (Exception ex) {
			System.out.println("Generic Error!!");
			System.out.println(ex.getClass().getName());
		}
	}
}
