// User-defined exception class
class CustomException extends Exception {
public CustomException(String message) {
    super(message);
}
}
public class ExceptionHandlingDemo {
public static void main(String[] args) {
// Predefined exception example
try {
int result = 10 / 0; // This will cause ArithmeticException
} catch (ArithmeticException e) {
System.out.println("Caught predefined exception: " + e);
}
// User-defined exception example
try {
validateAge(15);
} catch (CustomException e) {
System.out.println("Caught user-defined exception: " +
e.getMessage());
}
}
static void validateAge(int age) throws CustomException {
if (age < 18) {
throw new CustomException("Age must be 18 or above.");
} else {
System.out.println("Valid age.");
}
}
}
