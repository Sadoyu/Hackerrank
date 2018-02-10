import sys
from typing import List, Tuple

def revisedRussianRoulette(arr: List[int]) -> Tuple[int, int]:
    maxi = sum(arr)
    mini = maxi
    i = 0

    while i + 1 < len(arr):
        if arr[i] == 1 and arr[i+1] == 1:
            mini -= 1
            i += 1
        i += 1

    return mini, maxi

if __name__ == '__main__':
    line = sys.stdin.readlines()[1].strip().split()
    print(*revisedRussianRoulette([int(x) for x in line]))
