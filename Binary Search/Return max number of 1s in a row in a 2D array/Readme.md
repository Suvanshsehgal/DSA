# 🧮 Find Row with Maximum Number of 1s

## 🧠 Problem Statement
You are given a **non-empty grid `mat`** with `n` rows and `m` columns consisting only of `0`s and `1`s.  
All the rows in the matrix are **sorted in ascending order** (i.e., all 0s appear before 1s in each row).

Your task is to **find the index of the row** that contains the **maximum number of 1s**.

---

### ⚙️ Input
- A 2D list `mat` of size `n x m`, where:
  - `mat[i][j]` ∈ {0, 1}
  - Each row is sorted in ascending order.

---

### 🎯 Output
- Return the **index** (0-based) of the row that contains the **maximum number of 1s**.

---

### 🧩 Conditions
- If two or more rows have the same number of 1s, return the **one with the smaller index**.
- If there is **no row with at least one 1**, return `-1`.

---

### 🧵 Example

#### Example 1:
```python
Input:
mat = [
  [0, 0, 1, 1],
  [0, 1, 1, 1],
  [0, 0, 0, 0]
]

Output:
1
