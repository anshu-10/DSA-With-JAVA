// Question 3 : Job Sequencing Problem
// We have an array of jobs where every job has a deadline and associated profit if the job 
// is finished before the deadline. It is also given that every job takes a single unit of time, 
// so the minimum possible deadline for any job is 1. Maximize the total profit if only one job 
// can be scheduled at a time.
// Sample Input 1:
// JobID  Deadline  Profit
// a           4          20
// b           1          10
// c           1          40
// d           1          30
// Sample Output 1: c, a

import java.util.*;

public class Solution3 {

    static class Job {
        char job_id;
        int deadline;
        int profit;

        Job(char job_id, int deadline, int profit) {
            this.job_id = job_id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<Job> arr) {
        int n = arr.size();

        Collections.sort(arr, (a, b) -> (b.profit - a.profit));

        boolean[] slot = new boolean[n];
        char[] result = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(n, arr.get(i).deadline) - 1; j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = arr.get(i).job_id;
                    break;
                }
            }
        }

        for (char c : result) {
            if (c != '\0') {
                System.out.print(c + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Job> arr = new ArrayList<>();
        arr.add(new Job('a', 4, 20));
        arr.add(new Job('b', 1, 10));
        arr.add(new Job('c', 1, 40));
        arr.add(new Job('d', 1, 30));

        System.out.println("Following is maximum profit sequence of jobs:");
        printJobScheduling(arr);
    }
}
