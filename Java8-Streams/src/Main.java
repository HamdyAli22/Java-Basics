import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
        List<String> names = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);
        List<Student> students = Arrays.asList(
                new Student("Ali", "IT", 85),
                new Student("Mona", "CS", 92),
                new Student("Ahmed", "IT", 60),
                new Student("Sara", "CS", 70),
                new Student("Omar", "IS", 45),
                new Student("Laila", "IS", 78)
        );
        List<Employee> employees = Arrays.asList(
                new Employee("Ali", 30, "HR", 5000),
                new Employee("Mona", 25, "IT", 7000),
                new Employee("Ahmed", 30, "HR", 5500),
                new Employee("Sara", 27, "IT", 7200),
                new Employee("Omar", 40, "Finance", 8000),
                new Employee("Laila", 35, "Finance", 8200)
        );
        List<List<String>> nestedWords = Arrays.asList(
                Arrays.asList("Java", "Stream"),
                Arrays.asList("API", "Lambda"),
                Arrays.asList("FlatMap", "Map")
        );
        //Basic Stream Operations
        System.out.println("Basic Stream Operations:");
        //Filter even numbers from a list of integers.
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        //Find names starting with a specific letter from a list of strings.
        List<String> namesStartingWithA = names.stream()
                .filter(name->name != null && name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Names starting with " + namesStartingWithA);

        //Convert all strings to uppercase using stream.
        List<String> uppercasedNames = names.stream()
                .filter(name -> name != null && !name.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercased names: " + uppercasedNames);

        //Sort a list of integers in descending order using streams.
        List<Integer> sortedNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("sortedNames " + sortedNumbers);

        //Remove duplicate elements from a list using distinct().
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueNumbers);

        System.out.println("--------------------------------------------------------------------------");
        //Intermediate Stream Tasks
        System.out.println("Intermediate Stream Tasks:");

        //Count the number of strings longer than 5 characters.
        long count = names.stream()
                .filter(name -> name != null && name.length() > 5)
                .count();
        System.out.println("Number of names longer than 5 characters: " + count);

      //Find the first element in a stream that matches a given condition.
      String firstNameStartWithS = names.stream()
              .filter(name -> name != null && name.toLowerCase().startsWith("s"))
              .findFirst().orElse("No name found");
        System.out.println("First name starting with 's': " + firstNameStartWithS);


        //Check if any number is divisible by 5 in a list.
        boolean anyDivisibleBy5 = numbers.stream()
                .anyMatch(n -> n % 5 == 0);
        System.out.println("Any number divisible by 5? " + anyDivisibleBy5);

        //Collect elements into a Set instead of a List.
        Set<Integer> numberSet = new HashSet<>(numbers);
        System.out.println("Numbers as Set: " + numberSet);

        List<Integer> skippedList = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("List after skipping first 3 elements: " + skippedList);

        System.out.println("--------------------------------------------------------------------------");
        //Numeric Streams & Reductions
        System.out.println("Numeric Streams & Reductions:");

        //Calculate the sum of a list of integers using reduce.
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum of numbers: " + sum);

        //Find the maximum and minimum value in a list.
        Integer max = numbers.stream().max(Integer::compareTo).orElse(0);
        System.out.println("Max value: " + max);

        Integer min = numbers.stream().min(Integer::compareTo).orElse(0);
        System.out.println("Min value: " + min);

        //Calculate the average of a list of doubles.
        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Average: " + average);

        //Multiply all integers in a list together using reduce.
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Product of all numbers: " + product);

        long countPositive = numbers.stream()
                .filter(n -> n > 0)
                .count();
        System.out.println("Count of positive numbers: " + countPositive);

        System.out.println("--------------------------------------------------------------------------");
        //Collectors & Grouping
        System.out.println("Collectors & Grouping:");

        //Group a list of students by their department.
        Map<String, List<Student>> studentsByDept = students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment));

        studentsByDept.forEach((dept, studentList) -> {
            System.out.println("Department: " + dept);
            studentList.forEach(s -> System.out.println(" - " + s.getName() + " (" + s.getGrade() + ")"));
        });

          //Partition a list of numbers into even and odd using partitioningBy.
            Map<Boolean, Set<Integer>> partitioned = numbers.stream()
                    .collect(Collectors.partitioningBy(
                            n -> n % 2 == 0,
                            Collectors.toSet()
                    ));

            //Create a comma-separated string from a list of strings.
            String result = names.stream()
                    .filter(name -> name != null && !name.isEmpty()) // تجاهل null و empty
                    .collect(Collectors.joining(", "));

            System.out.println("Comma-separated names: " + result);

            //Group employees by age and count how many per age.
            Map<Integer, Long> countByAge = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));

            countByAge.forEach((age, count2) ->
                    System.out.println("Age " + age + ": " + count2 + " employee(s)")
            );

            //Find the average salary per department in a list of employees.
            Map<String, Double> averageSalaryByDept = employees.stream()
                    .collect(Collectors.groupingBy(
                            Employee::getDepartment,
                            Collectors.averagingDouble(Employee::getSalary)
                    ));

            averageSalaryByDept.forEach((dept2, avgSalary) ->
                    System.out.println("Department: " + dept2 + ", Average Salary: " + avgSalary)
            );

        System.out.println("--------------------------------------------------------------------------");
        //Optional, Map, FlatMap
        System.out.println("Optional, Map, FlatMap:");

        //Flatten a list of lists into a single list.
        List<String> flatList = nestedWords.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println("Flattened list: " + flatList);

     //Extract all unique characters from a list of words.
        List<Character> uniqueChars = nestedWords.stream()
                .flatMap(List::stream)
                .filter(Objects::nonNull)
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique characters: " + uniqueChars);

      //Filter a list of Optionals and collect non-empty values.
        List<Optional<String>> optionalNames = Arrays.asList(
                Optional.of("Ali"),
                Optional.empty(),
                Optional.of("Mona"),
                Optional.empty(),
                Optional.of("Sara")
        );
        List<String> nonEmptyNames = optionalNames.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        System.out.println("Non-empty words: " + nonEmptyNames);

        //Map a list of strings to their lengths.
        Map<String, Integer> nameLengthMap = names.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(
                        name -> name,
                        String::length
                ));

        nameLengthMap.forEach((name, length) ->
                System.out.println("Name: " + name + ", Length: " + length));

        //Return a list of uppercased words that start with “A”.
        List<String> result2 = names.stream()
                .filter(Objects::nonNull)
                .map(String::toUpperCase)
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Words starting with A (uppercase): " + result2);

        System.out.println("--------------------------------------------------------------------------");
        //Advanced Operations
        System.out.println("Advanced Operations");

        //Sort a list of employees by salary then by name.
        List<Employee> sortedEmployees = employees.stream()
                .sorted(
                        Comparator.comparing(Employee::getSalary)
                                .thenComparing(Employee::getName)
                )
                .collect(Collectors.toList());


        //Find the second highest number in a list.
        sortedEmployees.forEach(e ->
                System.out.println(e.getName() + " - Salary: " + e.getSalary()));

        Integer secondMax = numbers.stream()
                .filter(Objects::nonNull)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElse(0);
        System.out.println("Second highest number: " + secondMax);

       //Find duplicate elements in a list of integers.
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println("Unique duplicates: " + duplicates);

        //
        List<String> nonEmptyNames2 = names.stream()
                .filter(name -> name != null && !name.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Cleaned names: " + nonEmptyNames2);

        //Partition students into pass/fail groups based on grade.
        Map<Boolean, List<Student>> partitionedStudents = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getGrade() >= 60));

        List<Student> passed = partitionedStudents.get(true);
        List<Student> failed = partitionedStudents.get(false);

        System.out.println("Passed Students:");
        passed.forEach(s -> System.out.println(s.getName() + " - " + s.getGrade()));

        System.out.println("Failed Students:");
        failed.forEach(s -> System.out.println(s.getName() + " - " + s.getGrade()));


    }
}