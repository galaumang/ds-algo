package dsalgo.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class LC0525ContiguousArrayTest {
  private static Stream<Arguments> testCases() {
    return Stream.of(
        Arguments.of(new int[] { 0, 1 }, 2),
        Arguments.of(new int[] { 0, 1, 0 }, 2));
  }

  @DisplayName("findMaxLengthTest")
  @ParameterizedTest(name = "{index} > {arguments}")
  @MethodSource("testCases")
  void findMaxLengthTest(int[] nums, int expected) {
    assertEquals(expected, LC0525ContiguousArray.findMaxLength(nums));
  }
}
