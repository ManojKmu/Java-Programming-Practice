package hackerRankproblems;
import java.util.*;
public class JavaDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner in = new Scanner(System.in);
		        Deque<Integer> deque = new ArrayDeque<>();
		        Map<Integer, Integer> freqMap = new HashMap<>();

		        int n = in.nextInt(); // total numbers
		        int m = in.nextInt(); // subarray size

		        int maxUnique = 0;

		        for (int i = 0; i < n; i++) {
		            int num = in.nextInt();

		            // Add new number to deque and map
		            deque.addLast(num);
		            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

		            // If window size exceeds m, remove oldest
		            if (deque.size() > m) {
		                int removed = deque.removeFirst();
		                freqMap.put(removed, freqMap.get(removed) - 1);
		                if (freqMap.get(removed) == 0) {
		                    freqMap.remove(removed);
		                }
		            }

		            // When window is exactly size m, check unique count
		            if (deque.size() == m) {
		                maxUnique = Math.max(maxUnique, freqMap.size());
		            }
		        }

		        System.out.println(maxUnique);
		        in.close();
		    }
		}

/*
📝 Short Problem Statement
You are given:

An array of n integers.

A window size m.

You must find the maximum number of unique integers among all contiguous subarrays of size m.
*/
/*
Sample Input

6 3
5 3 5 2 3 2
*/
/*
Sample Output

3
*/
/*
Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

 s1=(5,3,5)- Has  unique numbers.

 s2=(3,5,2)- Has  unique numbers.

 s3=(5,2,3)- Has  unique numbers.

 s4=(2,3,2)- Has  unique numbers.

In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is .
*/