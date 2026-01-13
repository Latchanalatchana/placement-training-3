import numpy as np

n, m = map(int, input().split())
arr = np.array([list(map(int, input().split())) for _ in range(n)])

print(np.transpose(arr))
print(arr.flatten())
