#  Two Pointers Pattern – DSA Explained

## What is Two Pointers?

The Two Pointers technique uses **two indices or pointers** (usually `i` and `j` or `left` and `right`) to iterate through a data structure like an array or string, **often from both ends or at different speeds**.

It is used to **optimize brute-force solutions**, especially for problems involving:
- Sorted arrays
- Searching pairs
- Reversing
- Partitioning
- Palindromes

---

##  When to Use Two Pointers?

Use Two Pointers when:
- You need to **compare elements** from both ends
- The array is **sorted**
- You want to **move inward from both ends**
- You want to **find pairs that satisfy a condition (sum, difference, etc.)**
- You are working with **linked lists** (fast and slow pointer)

---

## Real-Life Analogy

Imagine two people reading a book:
- One starts from the **first page**
- The other starts from the **last page**
They move toward the middle based on certain conditions. That’s how two pointers work.

---

##  Code Template (Two Ends)

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
    int sum = arr[left] + arr[right];

    if (sum == target) {
        // Found answer
        break;
    } else if (sum < target) {
        left++; // move right
    } else {
        right--; // move left
    }
}
