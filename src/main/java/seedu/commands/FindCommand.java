package seedu.commands;

import seedu.data.ingredient.Ingredient;
import seedu.parser.Parser;
import seedu.storage.IngredientList;
import seedu.ui.Ui;

import java.util.ArrayList;

public class FindCommand extends Command {

    /**
     * Constructor for Find Command.
     */
    public FindCommand() {
    }

    /**
     * Executes the Find command.
     */
    @Override
    public void execute(Ui ui, Parser parser, IngredientList ingredientList) {
        String searchTerm = parser.parseSearchTermFromFinding(ui.getCurrentUserInput());
        ArrayList<Ingredient> matchingIngredients = ingredientList.findAllMatchingIngredients(searchTerm);
        ui.printListOfMatchingIngredients(matchingIngredients);
    }
}
