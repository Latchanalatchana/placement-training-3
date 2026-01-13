import numpy as np

n, m = map(int, input().split())

arr = np.array([list(map(int, input().split())) for _ in range(n)])

result = np.sum(arr, axis=1)

print(np.sum(result))
