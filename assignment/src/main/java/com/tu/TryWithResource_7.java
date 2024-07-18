package com.tu;

import java.io.*;

public class TryWithResource_7 {

    public static void main(String[] args) {
        String filePath = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Check if the resource is closed
            if (isClosed(reader)) {
                System.out.println("Resource is closed after execution.");
            } else {
                System.out.println("Resource is NOT closed after execution.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to check if a Closeable resource is closed
    private static boolean isClosed(Closeable resource) {
        if (resource != null) {
            try {
                resource.close();
                return true; // Closed successfully
            } catch (IOException e) {
                return false; // Failed to close
            }
        }
        return true; // Already null, considered closed
    }
}
