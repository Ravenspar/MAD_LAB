for _ in range(int(input())):
    n = int(input())
    arr = list(map(int, input().split()))

    maxPos = arr.index(max(arr))
    minPos = arr.index(min(arr))

    res = min(max(maxPos, minPos) + 1, (n-1) - min(maxPos, minPos) + 1, (n-1) - maxPos + minPos + 2, (n-1) -minPos + maxPos + 2)
    print(res)

