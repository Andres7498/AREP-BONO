package co.edu.escuelaing.sparkdockerdemolive;

import static spark.Spark.*;

import java.lang.Math;

public class SparkWebServer {

    public static void main(String... args){
        port(getPort());

        get("hello", (req,res) -> "Hello Docker!");

        get("index", (req,res) -> new Page().getPage());

        get("sin", (req,res) -> Math.sin(Double.parseDouble(req.queryParams("value"))));

        get("cos", (req,res) -> Math.cos(Double.parseDouble(req.queryParams("value"))));

        get("palindrome", (req,res) -> {
            String request = req.queryParams("value");
            boolean isPalindrome = false;
            String result = "no es palindromo";
            request = request.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
                    .replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
            String invertida = new StringBuilder(request).reverse().toString();
            if(request.equals(invertida)) {
                isPalindrome = true;
                result = "es palindromo";
            }

            return result;

        });

        get("vector", (req,res) -> {
            float value1 = Float.parseFloat(req.queryParams("value1"));
            float value2 = Float.parseFloat(req.queryParams("value2"));
            return Math.sqrt(Math.pow(value1, 2)+Math.pow(value2, 2));
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}