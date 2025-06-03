class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys,int[][] containedBoxes, int[] initialBoxes) {

        int n = status.length;
        boolean[] visited = new boolean[n];
        boolean[] hasKey = new boolean[n];
        boolean[] hasBox = new boolean[n];

        Queue<Integer> queue = new LinkedList<>();

        for (int box : initialBoxes) {
            hasBox[box] = true;
        }

        int totalCandies = 0;
        boolean progress = true;

        while (progress) {
            progress = false;

            for (int i = 0; i < n; i++) {
                if (hasBox[i] && (status[i] == 1 || hasKey[i]) && !visited[i]) {
                    visited[i] = true;
                    totalCandies += candies[i];
                    progress = true;

                    for (int key : keys[i]) {
                        hasKey[key] = true;
                    }

                    for (int newBox : containedBoxes[i]) {
                        hasBox[newBox] = true;
                    }
                }
            }
        }

        return totalCandies;
    }
}