package dsalgo.array;

import java.util.HashMap;
import java.util.Map;

public class LC0525_ContiguousArray {
  public static int findMaxLength(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);
    int maxlen = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 1)
        count = count + 1;
      else
        count = count - 1;
      if (map.containsKey(count))
        maxlen = Math.max(maxlen, i - map.get(count));
      else
        map.put(count, i);
    }
    return maxlen;
  }
}
