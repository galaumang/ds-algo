import unittest

from src.main.array.LC_0001_two_sum import TwoSum

class TestTwoSum(unittest.TestCase):
  def setUp(self) -> None:
     self.object = TwoSum()
  
  def test_two_sum(self):
    nums = [2,7,11,15]
    target = 9
    result = self.object.twoSum(nums, target)
    self.assertListEqual(result, [0,1])

if __name__ == '__main__':
    unittest.main()
