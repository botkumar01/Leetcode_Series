class Solution(object):
    def largestRectangleArea(self, h):
        """
        :type heights: List[int]
        :rtype: int
        """
        def PSE(h):
            ps = []
            st = []
            s={}
            for i in h:
                count = 0
                while st and st[-1] >= i:
                    count += s[st[-1]] + 1
                    st.pop()
                ps.append(count)
                st.append(i)
                s[i] = count
            return ps
        def NSE(h):
            p = PSE(h)
            maxi = 0
            st = []
            s = {}
            point = len(h)-1
            for i in h[::-1]:
                count = 0
                while st and st[-1] >= i:
                    count += 1
                    count += s[st[-1]]
                    st.pop()
                maxi = max(maxi, (count+p[point]+1)*i)
                st.append(i)
                s[i] = count
                point-=1
            return maxi
        
        return NSE(h)