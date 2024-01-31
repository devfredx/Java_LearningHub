public class QuestionBank {
    public static Question[] questions = {
            new Question("\n1. What is the correct way to declare a variable in Java?",
                    new String[]{"A. int myVariable;", "B. variable myVariable;", "C. myVariable = int;",
                            "D. declare myVariable as int;", "E. None of the above."},
                    "A"),

            new Question("\n2. What is the result of 3 + 5 * 2?",
                    new String[]{"A. 16", "B. 13", "C. 11", "D. 10", "E. None of the above."},
                    "B"),

            new Question("\n3. Which of the following is NOT a primitive data type in Java?",
                    new String[]{"A. int", "B. double", "C. string", "D. char", "E. boolean"},
                    "C"),

            new Question("\n4. What keyword is used to define a class in Java?",
                    new String[]{"A. class", "B. interface", "C. struct", "D. object", "E. None of the above."},
                    "A"),

            new Question("\n5. What does the 'static' keyword mean in Java?",
                    new String[]{"A. It makes a variable constant.", "B. It allows a method to access instance variables.",
                            "C. It indicates that a method or variable belongs to the class itself, not instances of the class.",
                            "D. It prevents inheritance.", "E. None of the above."},
                    "C"),
            
            new Question("\n6. What is encapsulation in Java?",
                    new String[]{"A) It refers to the ability of an object to inherit attributes and behaviors from another object.",
                            "B) It is the process of combining data and methods into a single unit called an object.",
                            "C) It is the mechanism of hiding the internal implementation details of an object and only exposing the necessary features.",
                            "D) It is a design principle in Java that promotes code reusability and flexibility."},
                    "C"),

            new Question("\n7. What is the purpose of the 'finally' block in a Java try-catch-finally statement?",
                    new String[]{"A) To define a block of code to be executed if an exception is thrown.",
                            "B) To catch and handle exceptions that occur within the try block.",
                            "C) To define a block of code to be executed regardless of whether an exception is thrown or caught.",
                            "D) To rethrow an exception to the calling method."},
                    "C"),

            new Question("\n8. What is the output of the following code snippet?\nint x = 5;\nint y = 2;\nSystem.out.println(x / y);",
                    new String[]{"A) 2",
                            "B) 2.5",
                            "C) 3",
                            "D) 2"},
                    "D"),

            new Question("\n9. Which keyword is used to define a constant in Java?",
                    new String[]{"A) final",
                            "B) static",
                            "C) const",
                            "D) constant"},
                    "A"),

            new Question("\n10. What is the correct way to declare a multi-dimensional array in Java?",
                    new String[]{"A) int[][] arr = new int[3, 3];",
                            "B) int[][] arr = new int[3][3];",
                            "C) int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };",
                            "D) int[][] arr = new int[3];"},
                    "B"),

            new Question("\n11. What is the purpose of the 'break' statement in Java?",
                    new String[]{"A) To terminate a loop or switch statement",
                            "B) To skip the current iteration of a loop",
                            "C) To define a constant value",
                            "D) To call a method"},
                    "A"),

            new Question("\n12. Which of the following Java collections guarantees the insertion order of its elements?",
                    new String[]{"A) HashSet",
                            "B) HashMap",
                            "C) LinkedHashMap",
                            "D) TreeSet"},
                    "C"),

            new Question("\n13. What does the 'super' keyword refer to in Java?",
                    new String[]{"A) Refers to the superclass of the current class",
                            "B) Refers to the subclass of the current class",
                            "C) Refers to the immediate parent class",
                            "D) Refers to the derived class"},
                    "A"),

            new Question("\n14. What is the result of the following code snippet?\nString str1 = 'hello';\nString str2 = 'world';\nSystem.out.println(str1 + str2);",
                    new String[]{"A) helloworld",
                            "B) hello world",
                            "C) hello+world",
                            "D) Compilation Error"},
                    "A"),

            new Question("\n15. Which of the following statements is true about Java interfaces?",
                    new String[]{"A) Interfaces can have method implementations",
                            "B) Classes can implement multiple interfaces with conflicting method signatures",
                            "C) Interfaces can contain instance variables",
                            "D) Interfaces can be instantiated directly"},
                    "A")

    };
}
