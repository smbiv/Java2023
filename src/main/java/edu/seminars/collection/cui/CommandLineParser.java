package edu.seminars.collection.cui;

import edu.seminars.collection.tracker.CommandHandler;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class CommandLineParser {

    private static final String ADD_TASK = "addTask";
    private static final String GET_HISTORY = "getHistory";
    private static final String GET_TASK = "getTask";
    private static final String EXIT_CMD = "exit";

    private final Scanner scanner = new Scanner(System.in);
    private final CommandHandler commandHandler = new CommandHandler();

    static final Pattern ARG_PAT = Pattern.compile("\"[^\"]+\"|\\S+");

    public void run() {
        String input = null;
        while (!EXIT_CMD.equals(input)) {
            input = scanner.nextLine();
            String[] args = ARG_PAT.matcher(input)
                    .results()
                    .map(MatchResult::group)
                    .toArray(String[]::new);
            String command = extractCommand(args);

            String result = switch (command) {
                case ADD_TASK -> commandHandler.addTask(args);
                case GET_TASK -> commandHandler.getTask(args);
                case GET_HISTORY -> commandHandler.getHistory();
                default -> "Not implemented yet";
            };

            System.out.println(result);
        }
    }

    private String extractCommand(String[] args) {
        if (args.length > 0) {
            return args[0];
        }
        return null;
    }

}
