class Solution(object):
    def maxProfit(self, p):
        """
        :type prices: List[int]
        :rtype: int
        """
        small = p[0]
        summ = 0
        for i in p:
            summ = max(summ,i-small)
            small = min(small,i)

        return summ 