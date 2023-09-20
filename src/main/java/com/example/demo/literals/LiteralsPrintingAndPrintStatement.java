package com.example.demo.literals;

import com.example.demo.DemoApplication;
import org.springframework.boot.SpringApplication;

public class LiteralsPrintingAndPrintStatement {


    public static void main(String[] args) {
    }
    /**
     *  DESCRIPTION :::
     * Literals in Java:
     * In Java, a literal represents a constant value that can be directly assigned to a variable. Literals can be of various types,
     * including numeric literals, character literals, string literals, boolean literals, and null literals. Here's a breakdown of different types of literals in Java:
     * <p>
     * Numeric Literals: Numeric literals are used to represent numbers. They can be further categorized into:
     * <p>
     * Integer Literals: These are whole numbers without decimal points, such as 42 or -10.
     * Floating-Point Literals: These are numbers with decimal points, like 3.14 or -0.5.
     * Hexadecimal Literals: Represented with a 0x or 0X prefix, like 0xFF (255 in decimal).
     * Binary Literals: Represented with a 0b or 0B prefix, like 0b1010 (10 in decimal).
     * Character Literals: These represent individual characters enclosed in single quotes, such as 'A' or '7'.
     * <p>
     * String Literals: String literals are sequences of characters enclosed in double quotes, like "Hello, World!".
     * <p>
     * Boolean Literals: Java has two boolean literals: true and false, representing the boolean values.
     * <p>
     * Null Literal: The null literal represents a reference with no value assigned.
     * <p>
     *
     *
     * Here's an example of using literals in Java:
     *
     * int age = 25;          // Integer literal
     * double pi = 3.14159;   // Floating-point literal
     * char grade = 'A';      // Character literal
     * String message = "Hello, World!"; // String literal
     * boolean isJavaFun = true; // Boolean literal
     * Object obj = null;     // Null literal
     *
     */


    /**
     * Description : PRINTING IN JAVA
     * Printing in Java:
     * Printing in Java refers to displaying output on the console or some other output device. The primary way to print in Java is using the System.out.println()
     * method from the System class. Here's how it works:
     *
     * System: It's a built-in class in Java that provides access to system-related resources, including the standard output stream.
     * out: This is an instance of the PrintStream class associated with the standard output stream.
     * println(): It's a method of PrintStream used to print a line of text to the standard output.
     *
     * Example of printing in Java:
     *
     * CODE :
     * int number = 42;
     * System.out.println("The value of number is: " + number);
     *
     * OUTPUT :
     *
     * The value of number is: 42
     *
     * You can use System.out.print() to print without a newline character at the end or System.out.printf() for formatted printing.
     *
     */

    /**
     * print Statement in Java:
     * In Java, the print statement does not exist as a standalone construct.
     * <p>
     * Instead, printing is typically achieved using the System.out.println() method or other similar methods provided by various Java libraries.
     * <p>
     * The System.out.println() method is the most commonly used way to print in Java, as it not only prints text but also appends a newline character to move to the next line.
     * This makes it suitable for most printing purposes.
     */

    public static void printStringLiteralsMethod1() {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("Hello world!");

        /**
         * OUTPUT FOR THIS CODE :
         *  Hello Wolrd!
         *  Hello Wolrd!
         *  Hello Wolrd!
         */
    }

    public static void printStringLiteralsMethod2() {
        System.out.println("Hello user:");
        System.out.println("Welcome to Shadow  World!");


        /**
         * OUTPUT FOR THIS CODE :
         *  Hello user:
         *  Welcome to Shadow  World!
         */
    }

    public static void printNumericLiterals() {
        System.out.println(10);
        System.out.println(-200);
        System.out.println(3.14);
        System.out.println(0);


        /**
         * Printing Numeric Literals
         * OUTPUT FOR THIS CODE :
         *  10
         *  -200
         *  3.14
         *  0
         */
    }
    public static void printNumericLiterals2() {
        System.out.println(10.2);
        System.out.println(-200.2);
        System.out.println(3.14);
        System.out.println(0.5);


        /**
         * Printing Numeric Literals
         * OUTPUT FOR THIS CODE :
         *  10.2
         *  -200.2
         *  3.14
         *  0.5
         */
    }

    public static void printCharacterLiterals() {
        System.out.println('a');
        System.out.println('3');
        System.out.println('$');
        System.out.println('R');


        /**
         * Printing Character Literals
         * OUTPUT FOR THIS CODE :
         *  a
         *  3
         *  $
         *  R
         */
    }
    public static void printBooleanLiterals() {

        System.out.println(true);
        System.out.println(false);


        /**
         * Printing Character Literals
         * OUTPUT FOR THIS CODE :
         *  true
         *  false
         */
    }
    public static void printBooleanLiterals2() {

        System.out.println(200==200);
        System.out.println(200!=200);
        System.out.println(200!=300);
        System.out.println(200==300);


        /**
         * Printing Character Literals
         * OUTPUT FOR THIS CODE :
         *  true
         *  false
         *  false
         *  true
         */
    }
    public static void printNumericLiteralsWithArthemetic() {

        System.out.println(100+20);
        System.out.println(100-20);
        System.out.println(6*20);
        System.out.println(100/20);


        /**
         * OUTPUT FOR THIS CODE :
         *  120
         *  80
         *  120
         *  5
         */
    }

    public static void printStatement(){
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        System.out.print("Hello World!");
        /**
         * OUTPUT FOR THIS CODE :
         *  Hello World!Hello World!Hello World!
         */
    }

    public static void printlnStatement(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("end");

        /**
         * OUTPUT FOR THIS CODE :
         *
         *
         *
         *  end
         */
    }

//    public static void prinStatement(){
//        System.out.print();
//        System.out.print();
//        System.out.print();
//        System.out.print("end");
//
//        /**
//         * OUTPUT FOR THIS CODE :
//         *  Compile time error. (error : no suitable method found for print(no arguments))
//         */
//    }


}
