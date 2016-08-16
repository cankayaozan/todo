package tr.org.lyk2016.todo;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu {

	public static void printMenu() {
		StringBuilder menu = new StringBuilder(50);

		menu.append("TODOs\n");
		menu.append("=====\n");
		menu.append("\n");

		// TODO use TodoHelper's getIterator method here
		// hint: use a while loop
		Iterator<Todo> todos = TodoHelper.getIterator();
		int index = 1;
		Todo current = null;

		while (todos.hasNext()) {
			current = todos.next();

			menu.append(current.getCheckbox());

			// TODO add checkbox according to 'done' status
			// TODO add index numbers for users to choose

			index++;
			menu.append(index);

			menu.append("(");
			menu.append(") ");
			menu.append(" ");
			menu.append(current.getDescription());
			menu.append("\n");
		}

		menu.append("\n");
		menu.append("MENU\n");
		menu.append("=====\n");
		menu.append("(0) Exit\n");
		menu.append("(1) Add Todo\n");
		menu.append("(2) Mark as done\n");
		menu.append("(3) Remove todo\n");
		menu.append("\n");
		menu.append("Enter your command: ");

		System.out.println(menu.toString());
	}

}
