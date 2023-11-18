package io.lambda.unit1;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l) {
        System.out.println(l.getLength("Hello Lambda"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
