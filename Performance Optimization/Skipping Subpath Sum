import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean dfs(ArrayList<ArrayList<Integer>> g, int v, int p, int target, ArrayList<Integer> path) {
        path.add(v);
        if (v == target) {
            return true;
        }
        for (int u : g.get(v)) {
            if (u == p) continue;
            boolean found = dfs(g, u, v, target, path);
            if (found) return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    /* 
     * Kadane's algorith: https://en.wikipedia.org/wiki/Maximum_subarray_problem
     */
    static int kadane(ArrayList<Integer> a) {
        if (a.isEmpty()) return 0;
        int max_ending_here = Math.max(a.get(0), 0);
        int max_so_far = max_ending_here;
        for (int i = 1; i < a.size(); ++i) {
            max_ending_here = Math.max(Math.max(0, a.get(i)), max_ending_here+a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        } 
        return max_so_far;
    }

    static int[] skippingSubpathSum(int n, int[] c,  ArrayList<ArrayList<Integer>> graph, ArrayList<ArrayList<Integer>> queries) {
        int answers[] = new int[queries.size()];
        for (int qid = 0; qid < queries.size(); ++qid) {
            int u = queries.get(qid).get(0);
            int v = queries.get(qid).get(1);
       
            ArrayList<Integer> path = new ArrayList<Integer>();
            dfs(graph, u, -1, v, path);
            ArrayList<Integer> oddPath = new ArrayList<Integer>();
            ArrayList<Integer> evenPath = new ArrayList<Integer>();

            for (int i = 0; i < path.size(); ++i) {
                if ((i+1) % 2 == 0) {
                    evenPath.add(c[path.get(i)]);
                } else {
                    oddPath.add(c[path.get(i)]);
                }
            }
            int s1 = kadane(evenPath);
            int s2 = kadane(oddPath);
            answers[qid] = Math.max(s1, s2);
        }
        return answers;
    }
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; ++i) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n-1; ++i) {
            int u = in.nextInt();
            int v = in.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int q = in.nextInt();
        ArrayList<ArrayList<Integer>> queries = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < q; ++i) {
            int u = in.nextInt();
            int v = in.nextInt();
            queries.add(new ArrayList<Integer>(Arrays.asList(u, v)));         
        }
        int[] answers = skippingSubpathSum(n, c, graph, queries);
        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i] + (i != answers.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
