package com.epam.rd.java.basic.practice6.part6;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Part6Test {

    private static final String FILE_NAME = "part6.txt";

    @Test
    public void shouldCorrectlyReadFromFile() {

        final String expectedString = "jaguar chimpanzee bison whale " +
                "marmot bison lemur panther camel lizard wolf bear " +
                "gecko " +
                "mongoose leopard sable sable dingo whale jaguar " +
                "rat lemur lemur gorilla zebra tortoise " +
                "asp lion tapir tortoise gorilla cheetah bison marten " +
                "marmot cheetah camel " +
                "snake marmot " +
                "zebra asp cheetah lizard gecko gorilla asp lion tortoise " +
                "kangaroo whale penguin yak cheetah mouse panther ";

        final String actualString = Part6.readFromFile(FILE_NAME);

        Assert.assertEquals(expectedString, actualString);

    }

    @Test
    public void shouldReturnTrue_WhenInputCorrectData() {

        final String input = "--input part6.txt -t frequency";
        final String[] inputForMethod = input.split("\\s");

        boolean expectedTrue = Part6.checkInput(inputForMethod);

        Assert.assertTrue(expectedTrue);

    }

    @Test
    public void shouldReturnFalse_WhenInputIncorrectData() {

        final String input1 = "-input part6.txt ----t frequency";
        final String input2 = "length";
        final String input3 = "";
        final String input4 = "--input part.txt -t";

        final String[] inputForMethod1 = input1.split("\\s");
        final String[] inputForMethod2 = input2.split("\\s");
        final String[] inputForMethod3 = input3.split("\\s");
        final String[] inputForMethod4 = input4.split("\\s");

        boolean expectedFalse1 = Part6.checkInput(inputForMethod1);
        boolean expectedFalse2 = Part6.checkInput(inputForMethod2);
        boolean expectedFalse3 = Part6.checkInput(inputForMethod3);
        boolean expectedFalse4 = Part6.checkInput(inputForMethod4);

        Assert.assertFalse(expectedFalse1);
        Assert.assertFalse(expectedFalse2);
        Assert.assertFalse(expectedFalse3);
        Assert.assertFalse(expectedFalse4);

    }

    @Test
    public void allMethodsShouldCorrectlyExecute() {

        final String[] input = new String[] {"-i", "part6.txt", "-t", "frequency"};

        Assert.assertTrue(Part6.checkInput(input));

        Assert.assertNotNull(Part6.doTask("frequency", input));

        Assert.assertNotNull(Part6.readFromFile("part6.txt"));


    }

}