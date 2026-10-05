class Solution(object):
    def findWords(self, words):
        l1="qwertyiopu"
        l2="asdfghjkl"
        l3="zxcvbnm"
        res=[]
        for word in words:
            indicator=True
            for chr in word:
                if chr.lower() not in l1:
                    indicator=False
                    break
            if indicator:
                res.append(word)
            indicator=True
            for chr in word:
                if chr.lower() not in l2:
                    indicator=False
                    break
            if indicator:
                res.append(word)
            indicator=True
            for chr in word:
                if chr.lower() not in l3:
                    indicator=False
                    break
            if indicator:
                res.append(word)
            
        return res

        """
        :type words: List[str]
        :rtype: List[str]
        """
        