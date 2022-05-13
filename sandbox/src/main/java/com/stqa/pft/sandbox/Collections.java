package com.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
  public static void main(String[] args) {
    String[] length = {"Java", "C#", "Python", "PHP"};

    List<String> languages = Arrays.asList("Java", "C#");


    for (String l : length) {
      System.out.println("I would like to learn " + l);
    }

    for (String l : languages) {
      System.out.println("I would like to learn " + l);
    }
  }
}