public class CifraDeslocamento {
    
    // Método para encriptar e decriptar
    private static String processText(String text, int k) {
        StringBuilder result = new StringBuilder();
        
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                // Cálculo do novo caractere
                char newChar = (char) (((c - 'a' + k) % 26) + 'a');
                result.append(newChar);
            } else {
                result.append(c); // Manter caracteres não alfabéticos
            }
        }
        
        return result.toString();
    }

    public static String encrypt(String text, int k) {
        return processText(text, k);
    }

    public static String decrypt(String encryptedText, int k) {
        return processText(encryptedText, 26 - k);
    }

    public static void main(String[] args) {
        String text = "abcd";
        int k = 2;
        
        // Encriptar
        String encrypted = encrypt(text, k);
        System.out.println("\nTexto encriptado: " + encrypted);
        
        // Decriptar
        String decrypted = decrypt(encrypted, k);
        System.out.println("Texto decriptado: " + decrypted);
    }
}
