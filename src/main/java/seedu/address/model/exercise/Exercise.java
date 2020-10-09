package seedu.address.model.exercise;

import java.util.Objects;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

public class Exercise {
    // identity field
    private final Name name;
    private final Date date;

    // data field
    private final Calories calories;

    public Exercise(Name name, Date date, Calories calories) {
        requireAllNonNull(name, date);
        this.name = name;
        this.date = date;
        this.calories = calories;
    }

    public Name getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Calories getCalories() {
        return calories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, calories);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Name: ")
                .append(getName())
                .append(" Date: ")
                .append(getDate())
                .append(" Date: ")
                .append(getCalories())
                .append(" Calories: ");
        return builder.toString();
    }
}
