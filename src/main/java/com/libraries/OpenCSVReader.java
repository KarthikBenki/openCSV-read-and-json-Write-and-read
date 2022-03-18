package com.libraries;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenCSVReader {
    private static final String CSV_FILE_PATH = "D:\\IdeaProjects\\CSV to JSON\\src\\main\\resources\\Employee.csv";

    public List<Employee> csvReader() throws IOException, CsvValidationException {
        System.out.println("Inside CSV reader");
        CSVReader csvReader = new CSVReader(new FileReader(CSV_FILE_PATH));
        List<Employee> employeeList = new ArrayList<>();
        String[] record = null;
        while ((record = csvReader.readNext()) != null) {
            Employee employee = new Employee();
            employee.setName(record[0]);
            employee.setEmail(record[1]);
            employee.setPhoneNumber(record[2]);
            employee.setCountry(record[3]);
            employeeList.add(employee);
        }
        return employeeList;
    }

    public void printEmployeeList(List<Employee> employeeList) {
        //printing employee list
        for (int i = 0; i < employeeList.size(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}
