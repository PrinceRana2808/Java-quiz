package com.prince.quizapp;

public class QuestionAnswer {
    public static String questions[] = {
            "What is the main purpose of the 'public' keyword in Java?",
            "Which data type is used to store a single character in Java?",
            "What is the result of 7 % 3 in Java?",
            "What is the syntax for declaring a variable in Java?",
            "Which loop is used for iterating a block of code a fixed number of times?",
            "What is the output of 'System.out.println(5 == 5 && 3 > 1)'?",
            "What is the purpose of the 'break' statement in Java?",
            "What is the default value of a boolean variable in Java?",
            "What is the superclass of all classes in Java?",
            "What is the purpose of the 'static' keyword in Java?"
    };

    public static String choices[][] = {
            {"To indicate that a method can be accessed from anywhere", "To declare a class", "To specify the entry point of the program", "To make a variable accessible within a package"},
            {"char", "int", "String", "float"},
            {"1", "2", "0", "3"},
            {"int x = 10;", "variable x = 10;", "x = 10;", "declare x as 10;"},
            {"for loop", "while loop", "do-while loop", "if statement"},
            {"true", "false", "compile error", "runtime error"},
            {"To exit a loop or switch statement", "To skip the current iteration of a loop", "To terminate the program", "To pause the execution of a loop"},
            {"true", "false", "null", "0"},
            {"Object", "System", "Class", "JavaObject"},
            {"To indicate that a variable or method belongs to the class, rather than instances of the class", "To create multiple instances of a class", "To make a variable non-modifiable", "To define a constant"}
    };

    public static String correctAnswers[] = {"To specify the entry point of the program",
            "char", "1", "int x = 10;", "for loop", "true", "To exit a loop or switch statement",
            "false", "Object",
            "To indicate that a variable or method belongs to the class, rather than instances of the class"};

}
