package test.vaco.lexs;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleInheritanceTest {
    public static void main(String[] a){

        List<HashMap<String,Object>> employeeList = new ArrayList<>();

        HashMap<String,Object> employee = new HashMap<>();
        //emp 1

        employee.put("empId",1);

        employee.put("employeeName","Rahul");

        employeeList.add(employee);

        //emp 2

        employee = new HashMap<>();

        employee.put("empId",2);

        employee.put("employeeName","Rahul");

        employeeList.add(employee);

        //emp 3

        employee = new HashMap<>();

        employee.put("empId",3);

        employee.put("employeeName","Mahesh");

        employee.put("name","archana");

        employeeList.add(employee);

        //emp 4

        employee = new HashMap<>();

        employee.put("empId",4);

        employee.put("employeeName","Roy");

        employeeList.add(employee);

        //emp 5

        employee = new HashMap<>();

        employee.put("empId",5);

        employee.put("employeeName","Sumit");

        employeeList.add(employee);

        //emp 6

        employee = new HashMap<>();

        employee.put("empId",6);

        employee.put("employeeName","Suman");

        employeeList.add(employee);

        //emp 7

        employee = new HashMap<>();

        employee.put("empId",7);

        employee.put("employeeName","Deepa");

        employeeList.add(employee);

        //emp 8

        employee = new HashMap<>();

        employee.put("empId",8);

        employee.put("employeeName","Inder");

        employeeList.add(employee);

        //emp 9

        employee = new HashMap<>();

        employee.put("empId",9);

        employee.put("employeeName","Shahruk");

        employeeList.add(employee);

        //emp 10

        employee = new HashMap<>();

        employee.put("employeeName","Salman");

        employeeList.add(employee);


        employeeList.remove(0);
        System.out.println(employeeList.size());
        //Map <String,Object> sjsjs=
        employeeList.stream()
                .flatMap(map -> map.entrySet().stream())//forEach(t -> map.remove(t.getKey())))
                    .forEach(entry -> {
                       // map.remove(entry.getKey());
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    System.out.format("%s: %s\n", key, value);
                });

       /* map.entrySet().stream().filter(t -> t.getValue().equals("0")).
                forEach(t -> map.remove(t.getKey()));*/
        Map<String,String > map=new HashMap<>();
        map.put("a","Bhup");
        map.put("b","vbvbv");
        map.put("c","tdt");
        map.put("d","teter");
        map.entrySet().stream().forEach(x->x.getValue());

    }


}
