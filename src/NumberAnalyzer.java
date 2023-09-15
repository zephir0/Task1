import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberAnalyzer {
    public static void main(String[] args) {
        NumberAnalyzer numberAnalyzer = new NumberAnalyzer();
        numberAnalyzer.execute();
    }

    public void execute() {
        List<Integer> numbersList = readInput();

        if (numbersList.isEmpty()) {
            System.out.println("No valid integers provided. Exiting.");
        } else {
            List<Integer> distinctNumbers = getDistinctAndSorted(numbersList);

            printDistinctNumbers(distinctNumbers);
            printMeasurementInfo(numbersList, distinctNumbers);
        }
    }

    private List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by spaces:");

        String[] inputStrings = scanner.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();

        for (String input : inputStrings) {
            try {
                numbers.add(Integer.parseInt(input));
            } catch (NumberFormatException e) {
                System.out.println(input + " is not a valid integer.");
            }
        }
        scanner.close();
        return numbers;
    }

    private List<Integer> getDistinctAndSorted(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    private void printDistinctNumbers(List<Integer> distinctNumbers) {
        distinctNumbers.forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    private void printMeasurementInfo(List<Integer> numbers,
                                      List<Integer> distinctNumbers) {
        System.out.println("count: " + numbers.size());
        System.out.println("distinct: " + distinctNumbers.size());
        numbers.stream().min(Integer::compareTo).ifPresent(min -> System.out.println("min: " + min));
        numbers.stream().max(Integer::compareTo).ifPresent(max -> System.out.println("max: " + max));
    }
}
