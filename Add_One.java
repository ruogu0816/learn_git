class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        
        for(int i = digits.length-1; i>=0; i--){
            int temp = digits[i]+carry;
            if(temp == 10){
                carry = 1;
                digits[i] = temp%10;
            }
            else{
                carry = 0;
                digits[i] = temp;
            }
            
        }
        if(carry == 1){
            int[] plusOneDigits = new int[digits.length+1];
            plusOneDigits[0] = carry;
            for(int i = 1; i< plusOneDigits.length-1; i++){
                plusOneDigits[i]= digits[i-1];
            }
            return plusOneDigits;
        }
        else{
            return digits;
        }
        
    }
}