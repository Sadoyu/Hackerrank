#!/bin/python3

import sys

def acidNaming(s):
    # Complete this function
    if s.startswith("hydro") and s.endswith("ic"):
        return "non-metal acid"
    elif s.endswith("ic"):
        return "polyatomic acid"
    else:
        return "not an acid"

if __name__ == "__main__":
    n = int(input().strip())
    for a0 in range(n):
        acid_name = input().strip()
        result = acidNaming(acid_name)
        print(result)
