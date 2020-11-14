package csv;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var users = new UserCsvReader().readUserCsv("users.csv");
        // TODO Q2.1
        var newUsers = users.stream()
                .filter(user -> user.getCode().startsWith("m"))
                .map(user -> user.getName().toLowerCase())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println("- Q2.1");
        System.out.println(newUsers);
    }
}
