package com.example.morse.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseDecoded {
  private final Map<String, String> dict = new HashMap<String, String>() {{
    put("a", ".-");
    put("b", "-...");
    put("c", "-.-.");
    put("d", "-..");
    put("e", ".");
    put("f", "..-.");
    put("g", "--.");
    put("h", "....");
    put("i", "..");
    put("j", ".---");
    put("k", "-.-");
    put("l", ".-..");
    put("m", "--");
    put("n", "-.");
    put("o", "---");
    put("p", ".--.");
    put("q", "--.-");
    put("r", ".-.");
    put("s", "...");
    put("t", "-");
    put("u", "..-");
    put("v", "...-");
    put("w", ".--");
    put("x", "-..-");
    put("y", "-.--");
    put("z", "--..");
    put("1", ".----");
    put("2", "..---");
    put("3", "...--");
    put("4", "....-");
    put("5", ".....");
    put("6", "-....");
    put("7", "--...");
    put("8", "---..");
    put("9", "----.");
    put("0", "-----");
    put(".", ".-.-.-");
    put(",", "--..--");
    put("?", "..--..");
    put("'", ".----.");
    put("!", "-.-.--");
    put("/", "-..-.");
    put("(", "-.--.");
    put(")", "-.--.-");
    put("&", ".-...");
    put(":", "---...");
    put(";", "-.-.-.");
    put("=", "-...-");
    put("+", ".-.-.");
    put("-", "-....-");
    put("_", "..--.-");
    put("\"",
        ".-..-.");
    put("$", "...-..-");
    put("@", ".--.-.");
  }};

  @GetMapping("/decode")
  public String decode(@RequestParam(value = "text", defaultValue = "") String text) {
    StringBuilder decoded = new StringBuilder();
    String[] words = text.split(" ");
    for (String word : words) {
      String[] letters = word.split("-");
      for (String letter : letters) {
        decoded.append(dict.get(letter));
      }
      decoded.append(" ");
    }
    return decoded.toString();
  }
}
