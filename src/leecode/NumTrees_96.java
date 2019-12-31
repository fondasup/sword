package leecode;

public class NumTrees_96 {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }  //fixme 要用动态规划的迭代 而不能用递归，因为有很多重复的子问题， 递归方式超级慢

}
