package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_CALORIES;
import static seedu.address.logic.parser.CliSyntax.PREFIX_DATE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_TEMP;

import java.util.stream.Stream;

import seedu.address.logic.commands.AddCommand;
import seedu.address.logic.commands.AddExerciseFromTemplate;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.exercise.Calories;
import seedu.address.model.exercise.Date;
import seedu.address.model.exercise.Description;
import seedu.address.model.exercise.Exercise;
import seedu.address.model.exercise.Name;
import seedu.address.model.exercise.Template;
import seedu.address.model.exercise.TemplateList;

public class AddExerciseFromTemplateParser implements ExerciseParser<AddCommand> {
    public AddCommand parse(String args) throws ParseException {
        ArgumentMultimap argMultimap =
                ArgumentTokenizer.tokenize(args, PREFIX_TEMP, PREFIX_DATE, PREFIX_CALORIES);

        if (!arePrefixesPresent(argMultimap, PREFIX_TEMP, PREFIX_DATE)
            || !argMultimap.getPreamble().isEmpty()) {
            throw new ParseException(String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                    seedu.address.logic.commands.AddExerciseFromTemplate.MESSAGE_USAGE));
        }

        Name templateName = ParserUtil.parseExerciseName(argMultimap.getValue(PREFIX_TEMP).get());

        Template template = TemplateList.getTemp(templateName.toString());

        if (template == null) {
            throw new ParseException("The template does not exist.");
        }

        Name name = ParserUtil.parseExerciseName(template.getName());
        Description description = ParserUtil.parseDescription(template.getDescription());
        Date date = ParserUtil.parseDate(argMultimap.getValue(PREFIX_DATE).get());


        Calories calories = null;

        if (!arePrefixesPresent(argMultimap, PREFIX_CALORIES)) {
            calories = ParserUtil.parseCalories(template.getCalories().toString());
        } else {
            calories = ParserUtil.parseCalories(argMultimap.getValue(PREFIX_CALORIES).get());
        }

        Exercise exercise = new Exercise(name, description, date, calories);

        return new AddCommand(exercise);
    }

    private static boolean arePrefixesPresent(ArgumentMultimap argumentMultimap, Prefix... prefixes) {
        return Stream.of(prefixes).allMatch(prefix -> argumentMultimap.getValue(prefix).isPresent());
    }
}
