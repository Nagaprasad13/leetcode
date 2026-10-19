class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char num:stones.toCharArray()){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Character> set=new HashSet<>();
        for(char num:jewels.toCharArray()){
            set.add(num);
        }
        int number=0;
        for (char num:set){
            if(!map.containsKey(num)){
                continue;
            }
            number+=map.get(num);
        }
        return number;
    }
}