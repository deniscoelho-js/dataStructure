package strings_uri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Led {

    //3122
    public void led(String num){
        String[] v = num.split("");

        Map<String, Integer> led = new HashMap<>();
        led.put("1", 2);
        led.put("2", 5);
        led.put("3", 5);
        led.put("4", 4);
        led.put("5", 5);
        led.put("6", 6);
        led.put("7", 3);
        led.put("8", 7);
        led.put("9", 6);
        led.put("0", 6);

        // Variável para somar os LEDs necessários
        int totalLeds = 0;

        // Iterando sobre cada caractere da string
        for (char c : num.toCharArray()) {
            totalLeds += led.get(String.valueOf(c)); // Obtendo o número de LEDs
        }

        // Exibindo o resultado
        System.out.println("Quantidade de LEDs necessários: " + totalLeds);

    }

    public static void main(String[] args) {
        Led l = new Led();
        l.led("115380");
        l.led("2819311");
        l.led("23456");
    }

}
