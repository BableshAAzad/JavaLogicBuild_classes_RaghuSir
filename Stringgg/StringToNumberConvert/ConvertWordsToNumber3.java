package Stringgg.StringToNumberConvert;

import java.util.Arrays;
import java.util.List;

public class ConvertWordsToNumber3 {
    public static void main(String[] args) {
         boolean isValidInput = true;
    long result = 0;
    long finalResult = 0;
    List<String> allowedStrings = Arrays.asList
    (
    "zero","one","two","three","four","five","six","seven",
    "eight","nine","ten","eleven","twelve","thirteen","fourteen",
    "fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
    "thirty","forty","fifty","sixty","seventy","eighty","ninety",
    "hundred","lakhs","lakh","thousand","crore","crores","and",
    "million","billion","trillion"
    );

    String input="one hundred";
    // ! String input = String.join(" ", args);
    if(input != null && input.length()> 0)
    {
        input = input.replaceAll("-", " ");
        input = input.toLowerCase().replaceAll(" and", " ");
        String[] splittedParts = input.trim().split("\\s+");

        for(String str : splittedParts)
        {
            if(!allowedStrings.contains(str))
            {
                isValidInput = false;
                System.out.println("Invalid word found : "+str);
                break;
            }
        }
        if(isValidInput)
        {
            for(String str : splittedParts)
            {
                String compare=str.toLowerCase();
                switch(compare){
                case "and":break;
                case "zero":result += 0;
                            break;
                case "one":result += 1;
                           break;
                
                case "two":result += 2;
                           break;
                case "three":result += 3;
                           break;
                case "four":result += 4;
                           break; 
                case "five":result += 5;
                           break;  
                case "six":result += 6;
                           break;
                case "seven":result += 7;
                           break;
                case "eight":result += 8;
                           break;
                case "nine":result += 9;
                           break;
                case "ten":result += 10;
                           break;
                case "eleven":result += 11;
                           break;
                case "twelve":result += 12;
                           break;
                case "thirteen":result += 13;
                           break;
                case "fourteen":result += 14;
                           break;
                case "fifteen":result += 15;
                           break;
                case "sixteen":result += 16;
                           break;
                case "seventeen":result += 17;
                           break;
                case "eighteen":result += 18;
                           break;
                case "nineteen":result += 19;
                           break;
                case "twenty":result += 20;
                           break;
                case "thirty":result += 30;
                           break;
                case "forty":result += 40;
                           break;
                case "fifty":result += 50;
                           break;
                case "sixty":result += 60;
                           break;
                case "seventy":result += 70;
                           break;
                case "eighty":result += 80;
                           break;
                case "ninety":result += 90;
                           break;
                case "hundred":result *= 100;
                           break;
                case "thousand":result *= 1000;
                           finalResult += result;
                           result=0;
                           break;
                case "lakh":result *= 100000;
                           finalResult += result;
                           result=0;
                           break;
                case "lakhs":result *= 100000;
                           finalResult += result;
                           result=0;
                           break;
                case "crore":result *= 10000000;
                           finalResult += result;
                           result=0;
                           break;   
                case "crores":result *= 10000000;
                           finalResult += result;
                           result=0;
                           break;
                case "million":result *= 1000000;
                           finalResult += result;
                           result=0;
                           break;
                case "billion":result *= 1000000000;
                           finalResult += result;
                           result=0;
                           break;
                case "trillion":result *= 1000000000000L;
                           finalResult += result;
                           result=0;
                           break;
                }
            }

            finalResult += result;
            result=0;
            System.out.println(finalResult);
        }
    }
    }
}
