public class decode {
    static String text = "";
    public static String decoder(String code) {
        
        BSTNode node = morsecode.rootnode;
        int length = code.length();

        for (int i = 0; i < length; i++) {
            char morse_char = code.charAt(i);

            if (morse_char == '•') {
                node = node.getLeft();
            }
            else if (morse_char == '-') {
                node = node.getRight();
            }
            else if (morse_char == '_') {
                text = text + node.getInfo();
                node = morsecode.rootnode;
            }
            else if (morse_char==' '){
                text = text + " ";
            }
            else if (morse_char == '#') {
                text = text + node.getInfo();
                break;
            }
        }

        return text;
    }
}

