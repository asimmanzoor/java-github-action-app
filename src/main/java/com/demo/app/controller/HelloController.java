package com.demo.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String demo() {
        return "Hello world from HelloController App";
    }

    @GetMapping("/hello1")
    public String HellowTest() {
        String Hello="Code";
        return "Hello world from HelloController App";
    }
     public int countVowels(String word) {
        int count = 0;
        String[] vowels = "aeiou".split("");     
        for (String c : word.split("")) { // +1
            for(String v: vowels) { // +1
                if(c.equalsIgnoreCase(v)) { // +1
                    count++;
                }
            }
        }
        if(count == 0) { // +1
            return "does not contain vowels".length();
        } 
        return "contains %s vowels".formatted(count).length(); // +1
    }  // cyclomatic complexity = 5

    public int countVowels2(String word) {
        int count = 0;
        String[] vowels = "aeiou".split("");     
        for (String c : word.split("")) { // +1
            for(String v: vowels) { // +1
                if(c.equalsIgnoreCase(v)) { // +1
                    count++;
                }
            }
        }
        if(count == 0) { // +1
            return "does not contain vowels".length();
        } 
        return "contains %s vowels".formatted(count).length(); // +1
    }  // cyclomatic complexity = 5


    
    
    // cyclomatic complexity = 5


    public int cyclomaticComplexity(String word) {
        
        int count = 0;
        String[] vowels = "aeiou".split("");     

        for (String c : word.split("")) { 
            for(String v: vowels) { 
                if(c.equalsIgnoreCase(v)) { 
                    count++;
                } else if (!c.equalsIgnoreCase(v)) {
                    count--;
                } else if (c.equalsIgnoreCase("p")) {
                    count = count + 0;
                }
            }
        }
        if(count == 0) { 
            return "does not contain vowels".length();
        } 
        return "contains %s vowels".formatted(count).length();
    }


    // cognitive complexity = 7
    
    public String cognitiveComplexity(String word) {
        int count = 0;
        String []vowels = "aeiou".split("");     

        for (String c : word.split("")) { 
            for(String v: vowels) { 
                if(c.equalsIgnoreCase(v)) { 
                    count++;
                }
            }
        }
        if(count == 0) { 
            return "does not contain vowels";
        }
        return "contains %s vowels".formatted(count);
    } 




     public int countVowels4(String word) {
        int count = 0;
        String[] vowels = "aeiou".split("");     
        for (String c : word.split("")) { // +1
            for(String v: vowels) { // +1
                if(c.equalsIgnoreCase(v)) { // +1
                    count++;
                }
            }
        }
        if(count == 0) { // +1
            return "does not contain vowels".length();
        } 
        return "contains %s vowels".formatted(count).length(); // +1
    }  // cyclomatic complexity = 5

    public int countVowels3(String word) {
        int count = 0;
        String[] vowels = "aeiou".split("");     
        for (String c : word.split("")) { // +1
            for(String v: vowels) { // +1
                if(c.equalsIgnoreCase(v)) { // +1
                    count++;
                }
            }
        }
        if(count == 0) { // +1
            return "does not contain vowels".length();
        } 
        return "contains %s vowels".formatted(count).length(); // +1
    }  // cyclomatic complexity = 5


    
    
    // cyclomatic complexity = 5


    public int cyclomaticComplexity1(String word) {
        
        int count = 0;
        String[] vowels = "aeiou".split("");     

        for (String c : word.split("")) { 
            for(String v: vowels) { 
                if(c.equalsIgnoreCase(v)) { 
                    count++;
                } else if (!c.equalsIgnoreCase(v)) {
                    count--;
                } else if (c.equalsIgnoreCase("p")) {
                    count = count + 0;
                }
            }
        }
        if(count == 0) { 
            return "does not contain vowels".length();
        } 
        return "contains %s vowels".formatted(count).length();
    }


    // cognitive complexity = 7
    
    public String cognitiveComplexity1(String word) {
        int count = 0;
        String []vowels = "aeiou".split("");     

        for (String c : word.split("")) { 
            for(String v: vowels) { 
                if(c.equalsIgnoreCase(v)) { 
                    count++;
                }
            }
        }
        if(count == 0) { 
            return "does not contain vowels";
        }
        return "contains %s vowels".formatted(count);
    } 
}

