Here is the solution to the [Two Sum](https://leetcode.com/problems/two-sum/description/) problem.

Here's how it works:

1. The first thing I do is to check the size of the array: since the problem states "*You may assume that each input
   would have exactly one solution*", if I have only two elements they are definitely going to add up to the target. If
   that wasn't the case, we would have had to check they did actually add up to the target. Otherwise, I would have
   probably thrown an exception stating that no elements where found, same goes for any other input where there are no
   two elements that sum up to the target.
2. If the array has more than two elements, it initialises an empty mutableMap, which we'll need to add all the elements
   we meet in the array.
3. This solution doesn't check if after the current number there is the needed number (calculated by doing target -
   current number), instead it checks if it is before by checking if it was added to the mutable map already.
4. If it is not in the map, it adds the current number and its index to the map and goes to the next number in the
   array.
5. If the loop finishes without finding a solution, it returns an empty array, indicating that no such pair was found.
   However, it is there simply because the function requires us to return something, but in the case of our problem we
   are sure it will never get to that line of code.

This solution allows us to iterate over the array only once in worst case scenario. Which means we have:

- *Time Complexity*: The time complexity of this solution is O(n), where n is the number of elements in the input array
  nums. This is because the solution iterates through the array once (in the worst case scenario the whole array), and
  the operations inside the loop (such as checking the map and adding elements to it) are constant time operations.
- *Space Complexity*: The space complexity of this solution is also O(n), where n is the number of elements in the input
  array nums. This is because the solution uses a mutable map to store the elements seen so far, and in the worst case
  scenario, it may store all n elements of the array.