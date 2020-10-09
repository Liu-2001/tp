package seedu.address.testutil;

import seedu.address.model.exercise.*;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

import java.util.HashSet;
import java.util.Set;

public class ExerciseBuilder {
    public static final String DEFAULT_NAME = "runing";
    public static final String DEFAULT_DESCRIPTION = "1O mins";
    public static final String DEFAULT_DATE = "10-10-2020";

    private Name name;
    private Description description;
    private Date date;
    private Calories calories;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public ExerciseBuilder() {
        name = new Name(DEFAULT_NAME);
        description = new Description(DEFAULT_DESCRIPTION);
        date = new Date(DEFAULT_DATE);
        calories = null;
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public ExerciseBuilder(Exercise exerciseToCopy) {
        name = exerciseToCopy.getName();
        description = exerciseToCopy.getDescription();
        date = exerciseToCopy.getDate();
        calories = exerciseToCopy.getCalories();
    }

    /**
     * Sets the {@code Name} of the {@code Exercise} that we are building.
     */
    public ExerciseBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Sets the {@code Calories} of the {@code Exercise} that we are building.
     */
    public ExerciseBuilder withCalories(String calories) {
        this.calories = new Calories(calories);
        return this;
    }

    /**
     * Sets the {@code description} of the {@code Exercise} that we are building.
     */
    public ExerciseBuilder withDescription(String description) {
        this.description = new Description(description);
        return this;
    }

    /**
     * Sets the {@code Date} of the {@code Exercise} that we are building.
     */
    public ExerciseBuilder withDate(String date) {
        this.date = new Date(date);
        return this;
    }

    public Exercise build() {
        return new Exercise(name, description, date, calories);
    }
}
