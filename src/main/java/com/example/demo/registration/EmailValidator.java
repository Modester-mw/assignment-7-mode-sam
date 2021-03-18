// Authors: Samwel Maisiba and Modester Mwangi
// GitHub Handles: Sammyiel and Modester-mw

package com.example.demo.registration;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return true;
    }
}
