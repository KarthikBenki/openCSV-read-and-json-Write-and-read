package com.libraries;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JSON_WriterFromCSV {


    public void jsonWriter() throws IOException, CsvValidationException {
        System.out.println("Inside json writer");
        OpenCSVReader openCSVReader = new OpenCSVReader();
        List<Employee> employeeList = openCSVReader.csvReader();
        Gson gson = new Gson();
        String jsonString = gson.toJson(employeeList);
        FileWriter fileWriter = new FileWriter("D:\\IdeaProjects\\CSV to JSON\\src\\main\\resources\\Employee.json");
        fileWriter.write(jsonString);
        fileWriter.close();
    }
}
