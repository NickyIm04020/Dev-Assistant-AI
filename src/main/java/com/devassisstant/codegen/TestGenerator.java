package com.devassistant.codegen;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.MethodDeclaration;

import java.io.File;
import java.util.List;

public class TestGenerator {
    public static void generateJUnitTests(String sourceFile) throws Exception {
        CompilationUnit cu = JavaParser.parse(new File(sourceFile));
        List<MethodDeclaration> methods = cu.findAll(MethodDeclaration.class);

        System.out.println("🧩 Detected " + methods.size() + " methods. Generating JUnit test stubs:\n");

        for (MethodDeclaration m : methods) {
            String testName = "test" + Character.toUpperCase(m.getNameAsString().charAt(0)) + m.getNameAsString().substring(1);
            System.out.println("@Test\nvoid " + testName + "() {\n    // TODO: Implement test for " + m.getNameAsString() + "\n}\n");
        }
    }
}
