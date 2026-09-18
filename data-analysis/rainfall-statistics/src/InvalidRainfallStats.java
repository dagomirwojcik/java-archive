
// Custom exception class for invalid (negative) rainfall values
class InvalidRainfallException extends Exception {
    public InvalidRainfallException(String message) {
        super(message); // Call superclass constructor with message
    }
}