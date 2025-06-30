#  Prefix Sum Pattern

> "When you want to know the sum of a range or count subarrays based on sum, this is your best tool."

---

##  1. Real-Time Use Case

Imagine you're a data analyst tracking daily sales for 30 days.

 You get questions like:
- "What's the total sales from Day 5 to Day 20?"
- "How many days in a row had total sales = 100?"

 Will you add values manually each time?

 Brute force is slow  
 You’ll use **Prefix Sum** — a pre-calculation trick to speed up queries.



##  2. Why Use Prefix Sum?

You use **prefix sum** when:
- You need to find **sum of elements from index i to j**
- You want to **optimize subarray-related brute force**
- You are solving problems like:
  - "Sum in range"
  - "Subarray sum = K"
  - "How many subarrays sum to X"

 Brute Force: O(N²)  
Prefix Sum: O(N) or O(1)



##  3. Brute Force Method

## java
int sum = 0;
for (int k = i; k <= j; k++) {
    sum += arr[k];
}


## 4. Optimized
int[] prefix = new int[n];
prefix[0] = arr[0];

for (int i = 1; i < n; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}


## 5. Range Sum Function
public int rangeSum(int[] prefix, int i, int j) {
    if (i == 0) return prefix[j];
    return prefix[j] - prefix[i - 1];
}


## 6. Logic
Instead of recalculating the sum again and again,
 we precompute and store running sums.

This acts like caching answers to reuse later.


## 7. Prefix sum optimization

 Precompute an array of cumulative sums:

Formula:
prefix[i] = prefix[i - 1] + arr[i];


To get sum from index i to j:
sum = prefix[j] - prefix[i - 1];


For 0-based arrays:
sum = prefix[j] - (i > 0 ? prefix[i - 1] : 0);