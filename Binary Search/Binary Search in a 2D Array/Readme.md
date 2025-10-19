# 🔍 Search a 2D Matrix II

## 🧠 Problem Statement
Write an efficient algorithm that searches for a value `target` in an `m x n` integer matrix `matrix`.

The matrix has the following properties:
1. Integers in each **row** are sorted in **ascending order** from **left to right**.
2. Integers in each **column** are sorted in **ascending order** from **top to bottom**.

Your task is to determine whether the target value exists in the matrix.

---

### ⚙️ Input
- `matrix`: a 2D list of integers with dimensions `m x n`
- `target`: an integer to be searched within the matrix

---

### 🎯 Output
- Return `true` if the target exists in the matrix.
- Return `false` otherwise.

---

### 🧩 Example

#### Example 1:
```python
Input:
matrix = [
  [1, 4, 7, 11, 15],
  [2, 5, 8, 12, 19],
  [3, 6, 9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
target = 5

Output:
true
