## Sliding Window Pattern

# Use-case:
- Used to find subarrays with max/min sum, length, or conditions.

###  Types:
- Fixed Size Sliding Window
- Variable Size Sliding Window
The **Sliding Window** is a powerful technique used to reduce the time complexity of certain problems involving **arrays** or **strings**.  
It helps eliminate unnecessary nested loops by maintaining a **moving subset (window)** of the data.


## 🔹 Why Use Sliding Window?

- To solve problems involving **subarrays** or **substrings**
- To reduce brute-force time complexity from **O(n²)** to **O(n)**
- To solve optimization problems like **maximum/minimum sum**, **longest/shortest subarray**, etc.

---

##  1. Fixed Size Sliding Window

###  Use-case:
When the size of the window is **fixed and known** (usually `k` is given).  
> E.g., Find max sum of subarray of size `k`.

###  Core Idea:
- Start with the first `k` elements and compute their sum.
- Slide the window forward by:
  - **Adding** the new element coming in,
  - **Removing** the element going out.

###  Time Complexity: O(n)

###  Code: [`FixedSize.java`](./FixedSize.java)

###  Example Problem:
> **Maximum Sum Subarray of Size K**  
> Input: `arr = [2, 1, 5, 1, 3, 2]`, `k = 3`  
> Output: `9` (subarray `[5, 1, 3]`)

---

##  2. Variable Size Sliding Window

###  Use-case:
When the window size is **dynamic**, changing based on a condition.  
> E.g., Find the longest substring with all unique characters.

###  Core Idea:
- Use two pointers `left` and `right` to track window boundaries.
- Expand `right` until the condition breaks (e.g., duplicate found).
- Then **shrink from the left** (`left++`) until the condition is satisfied again.
- Track window size after each valid expansion.

### Time Complexity: O(n)

###  Code: [`VariableSize.java`](./VariableSize.java)

###  Example Problem:
> **Longest Substring Without Repeating Characters**  
> Input: `"abcabcbb"`  
> Output: `3` (substring: `"abc"`)

---

##  Comparison Table

| Feature             | Fixed Size                     | Variable Size                          |
|---------------------|---------------------------------|-----------------------------------------|
| Window Size         | Constant (`k`)                 | Changes based on condition             |
| Use-case            | Max/min sum in `k` size window | Longest/shortest subarray based on rule |
| Sliding Logic       | Add right, remove left         | Expand right, shrink left if invalid   |
| Data Structure      | No special DS required         | Often uses `Set`, `Map`, or `HashMap`  |

---

##  More Problems to Practice

### Fixed Size:
-  Maximum Average Subarray I
-  Max Sum of Subarray of Size K
-  Number of subarrays with sum ≤ K (Fixed size count)

### Variable Size:
-  Longest Substring Without Repeating Characters
-  Longest Subarray with Sum ≤ K
-  Minimum Window Substring
-  Longest Substring with At Most K Distinct Characters

---

> Keep revising and reusing the sliding window template across problems.  
> This pattern is a **favorite in interviews** (FAANG, Flipkart, Microsoft, etc.).


