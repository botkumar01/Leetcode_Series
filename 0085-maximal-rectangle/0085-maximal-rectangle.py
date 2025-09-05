class Solution(object):
    def maximalRectangle(self, m):
        """
        :type matrix: List[List[str]]
        :rtype: int
        """
        def PSE(temp):
            s= {}
            st = []
            ps = []
            for i in temp:
                count = 0
                while st and st[-1] >= i:
                    count += s[st[-1]] + 1
                    st.pop()
                st.append(i)
                s[i] = count
                ps.append(count)
            return ps
        def NSE(temp):
            s = {}
            maxi =0
            st = []
            ans = PSE(temp)
            # print(ans)
            point = len(temp)-1
            for i in temp[::-1]:
                count = 0
                while st and st[-1] >= i:
                    count += s[st[-1]]+1
                    st.pop()
                st.append(i)
                s[i] = count
                maxi = max(maxi,(ans[point]+count+1)*temp[point])
                point -=1
            return maxi
        anns = 0
        temp = [0] * len(m[0])
        for i in range(len(m)):
            point = 0
            for j in range(len(m[0])):
                if m[i][j] =="0":
                    temp[point] = 0
                else:
                    temp[point] += 1
                point += 1
            # print(temp)
            anns = max(anns,NSE(temp))
        return anns