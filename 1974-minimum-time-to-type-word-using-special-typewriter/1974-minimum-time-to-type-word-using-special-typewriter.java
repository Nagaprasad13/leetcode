class Solution {
    public int minTimeToType(String word) {
        int steps=word.length();//this initialization that gives seconds/steps to type the words in the given string
        char prev='a';//this is for pointer moving 
        //think like which side(clockwise/anti-clockwise direction) gives less seconds to move the pointer...
        for(char curr:word.toCharArray()){
            steps+=Math.min(Math.abs(curr-prev),26-Math.abs(prev-curr));
            prev=curr;
        }
        return steps;
    }
}