package com.myapp.demo.utils;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

@Test
public class UtilsTest {

  @Test
  public void testConvertCommaSeparatedStringToList() {
    Set<String> output = Utils.convertCommaSeparatedStringToList("abc,cde,efg,h");
    List<String> expectedOutput = Arrays.asList("abc", "cde", "efg", "h");
    assertEquals(output.size(), expectedOutput.size());
    for (int i = 0; i < output.size(); i++) {
      assertTrue(output.contains(expectedOutput.get(i)));
    }
  }

  @Test
  public void testConvertCommaSeparatedStringToListWithSpaces() {
    Set<String> output = Utils.convertCommaSeparatedStringToList(" abc, cde, efg, h ");
    List<String> expectedOutput = Arrays.asList("abc", "cde", "efg", "h");
    assertEquals(output.size(), expectedOutput.size());
    for (int i = 0; i < output.size(); i++) {
      assertTrue(output.contains(expectedOutput.get(i)));
    }
  }

  @Test
  public void testConvertCommaSeparatedStringToListWithDuplicates() {
    Set<String> output = Utils.convertCommaSeparatedStringToList(" abc, abc, efg, efg ");
    List<String> expectedOutput = Arrays.asList("abc", "efg");
    assertEquals(output.size(), expectedOutput.size());
    for (int i = 0; i < output.size(); i++) {
      assertTrue(output.contains(expectedOutput.get(i)));
    }
  }
}
