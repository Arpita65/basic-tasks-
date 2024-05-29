# basic-tasks-
Basic tasks
Task class:

The Task class represents a single task with two attributes: title and dueDate.
The class has a constructor that takes title and dueDate as parameters and initializes the corresponding fields.
The class provides getter methods for title and dueDate.
TaskListApp class:

The TaskListApp class is the main application class that manages a list of tasks.
The class has two instance variables: taskList (an ArrayList of Task objects) and scanner (a Scanner object for reading user input).
The class has a constructor that initializes the taskList and scanner objects.
The run() method is the main entry point of the application. It runs an infinite loop that displays a menu to the user and processes their input.
Menu options:

The menu has four options:
Add Task: Allows the user to add a new task to the list.
Remove Task: Allows the user to remove a task from the list by title.
List Tasks: Displays the list of all tasks.
Quit: Exits the application.
Method descriptions:

addTask(): Prompts the user to enter a task title and due date, creates a new Task object, and adds it to the taskList.
removeTask(): Prompts the user to enter a task title, searches for the task in the taskList, and removes it if found.
listTasks(): Iterates over the taskList and prints each task's title and due date.
Main method:

The main() method creates an instance of the TaskListApp class and calls its run() method to start the application.
Overall, this code provides a basic implementation of a task list app that allows users to manage their tasks. However, it lacks features like data persistence, error handling, and more advanced functionality.
