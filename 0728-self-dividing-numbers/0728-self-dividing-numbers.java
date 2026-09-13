class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res=new ArrayList<>();

           for (int i = left; i <= right; i++) {
            int current = i;

            while (current > 0) {
                int digit = current % 10;

                if (digit == 0 || i % digit != 0) {
                    break;
                }

                current /= 10;
            }

            if (current == 0) {
                res.add(i);
            }
        }

        return res;
    }
}