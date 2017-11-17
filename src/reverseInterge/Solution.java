package reverseInterge;

//Given a 32-bit signed integer, reverse digits of an integer.
//https://leetcode.com/problems/reverse-integer/description/
public class Solution {

    public int reverse(int x) {
//            if (x>Math.pow(2,30) || x<-(Math.pow(2,31))) {
//            if (x>Integer.MAX_VALUE || x<Integer.MIN_VALUE) {
        if (x >= 0)
            return rev(x, 0);
        else return rev(-x, 0) * -1;

    }

    public int rev(int x, int y) {
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
            return 0;
        else if (x < 10) {
            if ((y * 10 + x) > Integer.MAX_VALUE || (y * 10 + x) < Integer.MIN_VALUE)
                return 0;
            else
                return y * 10 + x;
        } else return rev(x / 10, y * 10 + x % 10);
    }

}
