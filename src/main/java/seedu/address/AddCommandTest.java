package seedu.address;

import seedu.address.model.ExerciseBook;
import seedu.address.model.exercise.Calories;
import seedu.address.model.exercise.Date;
import seedu.address.model.exercise.Description;
import seedu.address.model.exercise.Exercise;
import seedu.address.model.exercise.Name;

/**
 * Runs the application.
 */
public class AddCommandTest {

    public static void main(String[] args) {
        try {
            ExerciseBook exerciseBook = new ExerciseBook();

            exerciseBook.addExercise(new Exercise(new Name("Hello"), new Description("Test 1"),
                    new Date("10-10-2020"), new Calories("100")));

            exerciseBook.addExercise(new Exercise(new Name("Hello1"), new Description("Test 2"),
                    new Date("10-10-2020"), new Calories("100")));

            exerciseBook.addExercise(new Exercise(new Name("Hello2"), new Description("Test 3"),
                    new Date("10-10-2030"), new Calories("100")));

            exerciseBook.addExercise(new Exercise(new Name("Hello3"), new Description("Test 4"),
                    new Date("10-10-2040"), new Calories("100")));

            exerciseBook.addExercise(new Exercise(new Name("Hello4"), new Description("Test 5"),
                    new Date("10-10-2050"), new Calories("100")));

            System.out.println(exerciseBook.toString());
        } catch (Exception err) {
            System.out.println("Exceptions");
        }
    }
}

