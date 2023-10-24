package com.example.data_binding.utils;

public class StringUtils {
    public static String getTotalRatings(int totalRatings) {
        return "(" + totalRatings + ")";
    }

    public static String getPrice(double price) {
        return String.format("%.2f$", price);
    }
}
