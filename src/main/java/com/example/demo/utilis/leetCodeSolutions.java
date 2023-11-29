package com.example.demo.utilis;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class leetCodeSolutions {

    public  String reverseVowels(String s) {
        Integer currentVol=null;
        Set<Character> vols= Stream.of('a','A','e','E','i','I','o','O','u','U')
                .collect(Collectors.toCollection(HashSet::new));

        Stack<Character> order=new Stack<>();

        char[] ss=s.toCharArray();
        for(int i=0;i<ss.length;i++){
            if(vols.contains(ss[i])){
                order.push(ss[i]);
                ss[i]='#';
            }
        }
        for(int i=0;i<ss.length;i++){
            if(ss[i]=='#'){
                ss[i]=order.pop();

            }
        }
        System.out.println(ss);
        return new String(ss);
    }
    public  void moveZeroes(int[] nums) {
        int zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zeros++;
            else if((i - zeros)!=i){

                nums[i - zeros] = nums[i];
                nums[i] = 0;
            }
        }
    }
    public  boolean increasingTriplet(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int n:nums){
            if(n<=min1)min1=n;
            else if(n<min2)min2=n;
            else if(n>min2) return true;
        }

        return false;
    }
    public  int compress(char[] chars) {
        String output="";
        char currentChar=chars[0];
        int counter=0;
        for(int i=0;i<=chars.length-1;i++){
            if (chars[i]!=currentChar ){

                output+= String.valueOf(currentChar);
                if(counter!=1)output+=String.valueOf(counter);

                currentChar=chars[i];
                counter=1;
            }
            else if(chars[i]==currentChar){
                counter++;
            }

        }

        output+= String.valueOf(currentChar);
        if(counter!=1)output+=String.valueOf(counter);

        for(int i=0;i<=output.length()-1;i++){
            chars[i]=output.charAt(i);

        }

        return output.length();
    }
    public  int compress2(char[] chars) {
        int i = 0, res = 0;
        while (i < chars.length) {
            int groupLength = 1;
            while (i + groupLength < chars.length && chars[i + groupLength] == chars[i]) {
                groupLength++;
            }
            chars[res++] = chars[i];
            if (groupLength > 1) {
                for (char c : Integer.toString(groupLength).toCharArray()) {
                    chars[res++] = c;
                }
            }
            i += groupLength;
        }
        return res;
    }
    public  int maxVowels(String s, int k) {
        int vowels=0;
        int max=0;
        for(int i = 0;i<k;i++){
            if(isVowels(s.charAt(i)))vowels++;
            if(max<vowels)max=vowels;
        }
        for(int i = k;i<s.length();i++){
            if(isVowels(s.charAt(i)))vowels++;
            if(isVowels(s.charAt(i-k)))vowels--;
            if(max<vowels)max=vowels;
        }
        return max;
    }
    public  boolean isVowels(char at){
        if(at=='a'||at=='e'||at=='o'||at=='i'||at=='u') return true;
        return false;
    }
    public  double findMaxAverage(int[] nums, int k) {
        double avg=0;
        double maxAvg=0;
        for (int i=0;i<k;i++){
            avg+=nums[i];
        }
        maxAvg=(avg/k);
        for(int i=k;i<nums.length;i++){
            avg-=nums[i-k];
            avg+=nums[i];
            if((avg/k)>maxAvg)maxAvg=(avg/k);
        }
        return maxAvg;
    }
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowers=0;
        for(int i=0;i<flowerbed.length;i++){

            if(flowerbed[i]==0){
                if((i+1==flowerbed.length||flowerbed[i+1]==0)
                        && (i==0||flowerbed[i-1]==0)){
                    flowerbed[i]=1;
                    flowers++;
                }
            }
        }

        if(flowers>=n)return true;
        else
            return false;
    }
    public  int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i!=j){
            if(height[i]>height[j]){
                if(max<(height[j]*(j-i)))max=(height[j]*(j-i));
                j--;
            }else{
                if(max<(height[i]*(j-i)))
                    max=(height[i]*(j-i));
                i++;
            }
        }
        return max;
    }

    public int maxOperations1(int[] nums, int k) {
        int max=0;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(j>i){
            if(nums[i]+nums[j]==k){
                max++;
                j--;
                i++;
            }else if(nums[i]+nums[j]<k){
                i++;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
        }
        return max;
    }
    /*public int maxOperations2(int[] nums, int k) {
        int max=0;
        HashMap<Integer,Integer> values=new HashMap<>();
        for(int num :nums){
            if (values.contains(num)){
                values.remove(num);
                max++;
            }else{
                values.add(k-num);
            }
        }

        return max;
    }*/
    public boolean isSubsequence(String s, String t) {
        int count=0,i=t.length()-1,j=s.length()-1;

        while(i>=0&&j>=0){
            if(s.charAt(j)==t.charAt(i)){
                count++;
                i--;
                j--;
            }else{
                i--;
            }
        }
        return count==s.length();
    }

   /* public int longestOnes(int[] nums, int k) {
        int counter=0;
        int current=0;

        for(int i=0;i<k;i++){
            nums[i]
        }
    }*/

}
