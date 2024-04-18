import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
    public static void main(String... args){

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, 500));
        empList.add(new Employee(2, 1000));
        empList.add(new Employee(3, 1500));
        empList.add(new Employee(4, 2000));
        empList.add(new Employee(5, 2500));
        empList.add(new Employee(6, 3000));
        empList.add(new Employee(7, 3500));

        for (Employee emp : empList){
            System.out.println(emp.id + " " + emp.salary);
        }

        List<Double> descSalary = empList.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        Iterator<Double> it = descSalary.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        empList.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);


        Optional<Double> thirdHighest = empList.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(2)
                .findFirst();

        empList.stream()
                .filter(emp -> emp.getSalary() < thirdHighest.get())
                .map(Employee::getSalary)
                .forEach(System.out::println);


        List<Integer> list = Arrays.asList(2,3,4,5,6);
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        int arr[] = {2, 4, 6, 8, 10} ;

        sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        System.out.println("--------------------------");

        int[] numbers = {1, 5, 3, 2, 7, 9};

        int secHighest = Arrays.stream(numbers)
                        .sorted()
                                .skip(1)
                                        .findFirst()
                                                .orElseThrow(() -> new IllegalArgumentException("out of bound"));

        System.out.println(secHighest);




        System.out.println("--------------------------");

        HashMap<Character, Long> map = new HashMap<>();

        map.put('a', 4L);
        map.put('b', 7L);
        map.put('z', 3L);
        map.put('m', 8L);




    }
}
