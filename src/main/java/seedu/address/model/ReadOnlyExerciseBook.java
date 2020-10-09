package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.exercise.Exercise;

/**
 * Unmodifiable view of an exercise book
 */
public interface ReadOnlyExerciseBook {

    ObservableList<Exercise> getExerciseList();

}