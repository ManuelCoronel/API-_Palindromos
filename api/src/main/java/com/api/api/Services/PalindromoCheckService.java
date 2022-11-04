package com.api.api.Services;

import org.springframework.stereotype.Service;

@Service
public class PalindromoCheckService implements IValidatePalindrome {


    @Override
    public String validatePlaindrome(String word) {
    String reverseWord = getReverseWord(word);
    String palindrome = "";
        for(int i=0;i<reverseWord.length();i++){
            for(int j=i+1;j<reverseWord.length();j++){
                if(word.substring(i,j).equals(reverseWord.substring(reverseWord.length()-j,reverseWord.length()-i))){
                    if (word.substring(i,j).length()>palindrome.length()){
                        palindrome=word.substring(i,j);
                    }
                }
            }
        }
        return palindrome;
    }

    @Override
    public String getReverseWord(String word) {
        String newWord="";

        for (int i= newWord.length()-1;i>=0;i--){
            newWord += word.charAt(i);

        }
        return newWord;
    }
}
