class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        for (int p : piles) {
            r = Math.max(r, p);
        }
        
        int minRate = r;
        while(l <= r) {
            int rate = l + (r - l) / 2;
            long hours = hoursNeeded(piles, rate);

            if(hours <= h) {
                r = rate - 1;
                minRate = Math.min(minRate, rate);
            } else if(hours > h) {
                l = rate + 1;
            }
        }

        return minRate;
    }

    private long hoursNeeded(int[] piles, int k) {
        long res = 0L;

        for(int p : piles) {
            res += (p + k - 1) / k;
        }

        return res;
    }
}
