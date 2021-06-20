package com.myapp.demo.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Utils {

  public static Set<String> convertCommaSeparatedStringToList(String input) {
    String[] stringArr = Arrays.stream(input.split(",")).map(String::trim).toArray(String[]::new);
    return new HashSet<>(Arrays.asList(stringArr));
  }
}
