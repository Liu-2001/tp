package seedu.address.logic.commands.exceptions;

/**
 * Represents an error which occurs during execution of a command.
 */
public class CommandException extends Exception {
    private static final String MESSAGE_INTEGER_OVERFLOW =
            "That's too much calories burnt within the day. Calo is meant for human. Not superhuman like you"
                    + "Ensure your calories on that day is within human limits";
    public CommandException(String message) {
        super(MESSAGE_INTEGER_OVERFLOW);
    }

    /**
     * Constructs a new {@code CommandException} with the specified detail {@code message} and {@code cause}.
     */
    public CommandException(String message, Throwable cause) {
        super(message, cause);
    }
}
