package com.devassistant;

import com.devassistant.ai.OpenRouterClient;
import com.devassistant.codegen.TestGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        OpenRouterClient client = new OpenRouterClient(System.getenv("OPENROUTER_API_KEY"));

        System.out.println("=== DevAssistant AI – Java Debugging Assistant ===");
        System.out.println("Enter Java error log or stack trace:");
        String log = sc.nextLine();

        String prompt = "Analyze this Java error log and suggest the most likely cause and fix:\n" + log;
        String fix = client.askGPT(prompt);
        System.out.println("\n💡 Suggested Fix:\n" + fix);

        System.out.println("\nEnter path to Java source file for JUnit test generation:");
        String path = sc.nextLine();
        TestGenerator.generateJUnitTests(path);

        System.out.println("\n✅ Process completed successfully!");
    }
}
