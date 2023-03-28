class Solution:
    def romanToInt(self, s: str) -> int:
        values = {None: 0, "I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        stack = list()

        for c in s:
            if(len(stack) > 0):
                if values.get(c) <= stack[-1]:
                    stack.append(values.get(c))
                else:
                    stack[-1] *= -1
                    stack.append(values.get(c))
            else:
                stack.append(values.get(c))

        return sum(stack)

