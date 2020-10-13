package seedu.address.logic.parser;

import seedu.address.logic.commands.CommandForExercise;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Represents a Parser that is able to parse user input into a {@code Command} of type {@code T}.
 * T should extends Command.
 */
public interface ExerciseParser<T extends CommandForExercise> {

    /**
     * Parses {@code userInput} into a command and returns it.
     *
     * @throws ParseException if {@code userInput} does not conform the expected format
     */
    T parse(String userInput) throws ParseException;
}
