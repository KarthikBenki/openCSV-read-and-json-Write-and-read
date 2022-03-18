package com.libraries;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

public class JSONReader_Gson {

    public void jsonReader() throws FileNotFoundException {
        System.out.println("Inside json reader");
        Gson gson = new Gson();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\IdeaProjects\\CSV to JSON\\src\\main\\resources\\Employee.json"));
        List<Employee> employeeList = gson.fromJson(bufferedReader,List.class);
        Iterator<Employee> iterator = employeeList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
