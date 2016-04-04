package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.specification.version");
        System.out.println(version);
        double d = Double.parseDouble(version);
        return d;
    }

    public static void main(String[] args) {
    }
}
