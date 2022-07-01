class MaximumEvenSplit {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> result = new LinkedList<Long>();
        if ( finalSum % 2 == 1 )
            return result;
        Long currSum = 0l;
        Long currNum = 2l;
        while ( currSum < finalSum ) {
            currSum += currNum;
            result.add(currNum);
            currNum += 2;
        }
        if ( currSum == finalSum )
            return result;
        else
            result.remove(result.indexOf(currSum-finalSum));
        return result;
    }
}
