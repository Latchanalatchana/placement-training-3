class Transitive {
    static void closure(int[][] g) {
        int n = g.length;
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    g[i][j] = g[i][j] | (g[i][k] & g[k][j]);
    }
}
