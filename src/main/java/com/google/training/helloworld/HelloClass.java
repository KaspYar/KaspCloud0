package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass() {
    }

    public HelloClass(String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass(String name, String period) {
        this.message =  period + " " + name;
    }

    public HelloClass(String csv, boolean b) {
        String [] values = csv.split(",");
        int sum = 0;
        for (String value : values) {
            sum+=Integer.parseInt(value);
        }
        message = String.valueOf(sum);

    }

    public String getMessage() {
        return message;
    }
}
