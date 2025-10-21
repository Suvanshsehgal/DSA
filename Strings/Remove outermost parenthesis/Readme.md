# 🧩 Remove Outermost Parentheses

## 📖 Problem Description

A **valid parentheses string** is defined as one of the following:
- `""` (empty string)  
- `"(" + A + ")"`, where `A` is a valid parentheses string  
- `A + B`, where `A` and `B` are valid parentheses strings  

For example:
```
""
"()"
"(())()"
"(()(()))"
```
are all valid parentheses strings.

A valid parentheses string `s` is **primitive** if it is non-empty and **cannot** be split into two non-empty valid parentheses strings `A + B`.

Given a valid parentheses string `s`, consider its **primitive decomposition**:

```
s = P1 + P2 + ... + Pk
```

where each `Pi` is a primitive valid parentheses string.

Return `s` after **removing the outermost parentheses** of every primitive string in the primitive decomposition of `s`.

---

## 🧠 Examples

### Example 1:
**Input:**  
```
s = "(()())(())"
```
**Output:**  
```
"()()()"
```

---

### Example 2:
**Input:**  
```
s = "(()())(())(()(()))"
```
**Output:**  
```
"()()()()(())"
```

---

### Example 3:
**Input:**  
```
s = "()()"
```
**Output:**  
```
""
```
