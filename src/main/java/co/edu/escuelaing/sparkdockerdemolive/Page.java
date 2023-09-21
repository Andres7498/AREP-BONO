package co.edu.escuelaing.sparkdockerdemolive;


public class Page {
    public String getPage(){
        String html = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "<style>\n" +
                "    form {\n" +
                "        margin-bottom: 20px;\n" +
                "    }\n" +
                "\t</style>" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "    <!-- Form para el Seno -->\n" +
                "    <form id=\"sinForm\">\n" +
                "        <label for=\"sinValor\">Calcular Seno:</label>\n" +
                "        <input type=\"text\" id=\"sinValor\" name=\"sinValor\" required>\n" +
                "        <button type=\"button\" onclick=\"calcularSeno()\">Enviar</button>\n" +
                "        <div id=\"resultadoSeno\"></div>\n" +
                "    </form>\n" +
                "\n" +
                "    <!-- Form para el Coseno -->\n" +
                "    <form id=\"cosForm\">\n" +
                "        <label for=\"cosValor\">Calcular Coseno:</label>\n" +
                "        <input type=\"text\" id=\"cosValor\" name=\"cosValor\" required>\n" +
                "        <button type=\"button\" onclick=\"calcularCoseno()\">Enviar</button>\n" +
                "        <div id=\"resultadoCoseno\"></div>\n" +
                "    </form>\n" +
                "\n" +
                "    <!-- Form para Palíndromo -->\n" +
                "    <form id=\"palindromeForm\">\n" +
                "        <label for=\"palindromeValor\">Verificar Palíndromo:</label>\n" +
                "        <input type=\"text\" id=\"palindromeValor\" name=\"palindromeValor\" required>\n" +
                "        <button type=\"button\" onclick=\"verificarPalindromo()\">Enviar</button>\n" +
                "        <div id=\"resultadoPalindromo\"></div>\n" +
                "    </form>\n" +
                "\n" +
                "    <!-- Form para Vector -->\n" +
                "    <form id=\"sqrtForm\">\n" +
                "        <label for=\"sqrtValor1\">Calcular la magnitud de un vector, Primer valor:</label>\n" +
                "        <input type=\"text\" id=\"sqrtValor1\" name=\"sqrtValor1\" required>\n" +
                "        <label for=\"sqrtValor2\">Segundo valor:</label>\n" +
                "        <input type=\"text\" id=\"sqrtValor2\" name=\"sqrtValor2\" required>\n" +
                "        <button type=\"button\" onclick=\"calcularRaizCuadrada()\">Enviar</button>\n" +
                "        <div id=\"resultadoRaizCuadrada\"></div>\n" +
                "    </form>\n" +
                "\n" +
                "    <script>\n" +
                "        function calcularSeno() {\n" +
                "            const valorIngresado = document.getElementById('sinValor').value;\n" +
                "            const resultadoElement = document.getElementById('resultadoSeno');\n" +
                "\n" +
                "            fetch(`/sin?value=${valorIngresado}`)\n" +
                "                .then(response => response.text())\n" +
                "                .then(data => {\n" +
                "                    resultadoElement.textContent = `El seno de ${valorIngresado} es: ${data}`;\n" +
                "                })\n" +
                "                .catch(error => {\n" +
                "                    console.error('Error:', error);\n" +
                "                    resultadoElement.textContent = 'Error al comunicarse con el servidor.';\n" +
                "                });\n" +
                "        }\n" +
                "\n" +
                "        function calcularCoseno() {\n" +
                "            const valorIngresado = document.getElementById('cosValor').value;\n" +
                "            const resultadoElement = document.getElementById('resultadoCoseno');\n" +
                "\n" +
                "            fetch(`/cos?value=${valorIngresado}`)\n" +
                "                .then(response => response.text())\n" +
                "                .then(data => {\n" +
                "                    resultadoElement.textContent = `El coseno de ${valorIngresado} es: ${data}`;\n" +
                "                })\n" +
                "                .catch(error => {\n" +
                "                    console.error('Error:', error);\n" +
                "                    resultadoElement.textContent = 'Error al comunicarse con el servidor.';\n" +
                "                });\n" +
                "        }\n" +
                "\n" +
                "        function verificarPalindromo() {\n" +
                "            const cadenaIngresada = document.getElementById('palindromeValor').value;\n" +
                "            const resultadoElement = document.getElementById('resultadoPalindromo');\n" +
                "\n" +
                "            fetch(`/palindrome?value=${cadenaIngresada}`)\n" +
                "                .then(response => response.text())\n" +
                "                .then(data => {\n" +
                "                    resultadoElement.textContent = `La palabra ${cadenaIngresada} ${data}`;\n" +
                "                })\n" +
                "                .catch(error => {\n" +
                "                    console.error('Error:', error);\n" +
                "                    resultadoElement.textContent = 'Error al comunicarse con el servidor.';\n" +
                "                });\n" +
                "        }\n" +
                "\n" +
                "        function calcularRaizCuadrada() {\n" +
                "            const valor1 = document.getElementById('sqrtValor1').value;\n" +
                "            const valor2 = document.getElementById('sqrtValor2').value;\n" +
                "            const resultadoElement = document.getElementById('resultadoRaizCuadrada');\n" +
                "\n" +
                "            fetch(`/vector?value1=${valor1}&value2=${valor2}`)\n" +
                "                .then(response => response.text())\n" +
                "                .then(data => {\n" +
                "                    resultadoElement.textContent = `La magnitud del vector es: ${data}`;\n" +
                "                })\n" +
                "                .catch(error => {\n" +
                "                    console.error('Error:', error);\n" +
                "                    resultadoElement.textContent = 'Error al comunicarse con el servidor.';\n" +
                "                });\n" +
                "        }\n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>\n";
        return html;
    }
}