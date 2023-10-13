import unittest

from parameterized import parameterized
from typing import List

from src.main.array.LC_0001_two_sum import TwoSum

class TestTwoSum(unittest.TestCase):
  def setUp(self) -> None:
     self.object = TwoSum()

  @parameterized.expand([
     ([2,7,11,15], 9, [0,1]),
     ([3,2,4], 6, [1,2]),
     ([3,3], 6, [0,1])
  ])
  def tests_two_sum(self, nums: List[int], target: int, expected: List[int]):
     self.assertListEqual(expected, self.object.twoSum(nums, target))

if __name__ == '__main__':
    unittest.main()
