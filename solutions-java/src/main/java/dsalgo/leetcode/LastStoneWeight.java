package dsalgo.leetcode;

public class LastStoneWeight {
  public int lastStoneWeight(int[] stones) {
    if (stones==null) 
      return 0;
    PriorityQueue<Integer> stoneWeights = new PriorityQueue<>(Collections.reverseOrder());
    for (int stone:stones)
      stoneWeights.offer(stone);
    while (stoneWeights.size() > 1) {
      int firstStone = stoneWeights.poll();
      int secondStone = stoneWeights.poll();
      if(firstStone != secondStone) {
        int remainingStone = Math.abs(firstStone - secondStone);
        stoneWeights.offer(remainingStone);
      }
    }
    return stoneWeights.size()==1 ? stoneWeights.poll() : 0;
  }
}