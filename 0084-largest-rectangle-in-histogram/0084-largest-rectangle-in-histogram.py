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
            ns = [0]*(len(h))
            st = []
            s = {}
            point = len(h)-1
            for i in h[::-1]:
                count = 0
                while st and st[-1] >= i:
                    count += 1
                    count += s[st[-1]]
                    st.pop()
                ns[point] = count
                st.append(i)
                s[i] = count
                point-=1
            return ns
        p = PSE(h)
        n = NSE(h)
        maxi = 0
        for i in range(len(n)):
            maxi = max(maxi, (p[i]+n[i]+1)*h[i] )
        return maxi