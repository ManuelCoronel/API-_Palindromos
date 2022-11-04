package com.api.api.Contracts;

import java.io.Serializable;

public class Palindrome  implements Serializable {
    private String palindrome;

    public Palindrome(String palindrome) {
        this.palindrome = palindrome;
    }

    public Palindrome(){}
    public String getPalindrome() {
        return palindrome;
    }

    public void setPalindrome(String palindrome) {
        this.palindrome = palindrome;
    }
}
