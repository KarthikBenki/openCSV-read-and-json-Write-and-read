package com.libraries;

import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class LibrariesMain {
    public static void main(String[] args) throws CsvValidationException, IOException {
        OpenCSVReader openCSVReader = new OpenCSVReader();
        List<Employee> employeeList = openCSVReader.csvReader();
        openCSVReader.printEmployeeList(employeeList);
        JSON_WriterFromCSV jsonWriterFromCSV = new JSON_WriterFromCSV();
        jsonWriterFromCSV.jsonWriter();
        JSONReader_Gson jsonReader_gson = new JSONReader_Gson();
        jsonReader_gson.jsonReader();

    }
}
