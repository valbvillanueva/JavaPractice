import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProblemSolving {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<Record> records = new ArrayList<>();

        initiateEmployees(employees);
        initiateRecords(records);

        Map<String, List<Record>> recordMap = groupRecords(employees, records);
        System.out.println(recordMap);
    }

    private static void initiateEmployees(List<Employee> employeeList) {
        employeeList.add(new Employee(1, "Ross", "Geller"));
        employeeList.add(new Employee(2, "Monica", "Geller"));
        employeeList.add(new Employee(3, "Rachel", "Green"));
        employeeList.add(new Employee(4, "Phoebe", "Buffay"));
        employeeList.add(new Employee(5, "Chandler", "Bing"));
        employeeList.add(new Employee(6, "Joey", "Tribbiani"));
    }

    private static void initiateRecords(List<Record> recordList) {
        recordList.add(new Record(1, 1, 1562232863, "Nulla sodales"));
        recordList.add(new Record(5, 1, 1562223863, "egestas arcu auctor"));
        recordList.add(new Record(2, 1, 1500547284, "laoreet eget"));
        recordList.add(new Record(5, 1, 1297759143, "elementum turpis"));
        recordList.add(new Record(4, 1, 1551412563, "Orci varius natoque penatibus et magnis"));
        recordList.add(new Record(3, 1, 1080857075, "Lorem ipsum"));
        recordList.add(new Record(1, 1, 1408551167, "consectetur adipiscing elit"));
        recordList.add(new Record(1, 1, 1239935189, "Fusce blandit"));
        recordList.add(new Record(4, 1, 1415716370, "Nulla eget purus ut massa"));
        recordList.add(new Record(3, 1, 1237623443, "non lectus laoreet sollicitudin"));
        recordList.add(new Record(3, 1, 1619569292, "Vivamus a semper"));
        recordList.add(new Record(2, 1, 1078742117, "estibulum blandit"));
    }

    private static Map<String, List<Record>> groupRecords(List<Employee> employees, List<Record> records) {
            
        /**
         Implement this method wherein all records are grouped by its employeeId.

         Output:
          Key should be a full name of each employee arranged alphabetically

         Bonus:
          List of records should also be arranged latest first.
         **/
      Map<String, List<Record>> recordMap = new HashMap<>();
      

      
      return recordMap;
    }
}

class Record {
    int employeeId;
    int id;
    int timestamp;
    String description;

    public Record(int employeeId, int id, int timestamp, String description) {
        this.id = id;
        this.timestamp = timestamp;
        this.description = description;
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    @Override
    public String toString() {
        return "Record{" +
                "employeeId=" + employeeId +
                ", id=" + id +
                ", timestamp=" + timestamp +
                ", description='" + description + '\'' +
                '}';
    }
}

class Employee {
    int id;
    String firstName;
    String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }
}