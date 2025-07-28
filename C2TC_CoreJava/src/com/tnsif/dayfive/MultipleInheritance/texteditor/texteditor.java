package com.tnsif.dayfive.MultipleInheritance.texteditor;

public class texteditor {


	public static void main(String[] args) {
		Word word = new Word();

		word.write("Hello, ");
		word.formatText(true);
		word.write("World!");
		word.displayContent();b 

		word.spellCheck();

		System.out.println("Is text in Wordpad bold? " + word.isBold());
		System.out.println("Disabling spell check in Word.");
		word.enableSpellCheck(false);
		word.spellCheck();
	}
}

