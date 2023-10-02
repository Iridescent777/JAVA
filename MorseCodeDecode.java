import java.io.RandomAccessFile;

public class MorseCodeDecode {

    public char DeCode(String morse){

        char letter ='\u0000';
        if(morse.equals(".-")){
            letter = 'A';
        }
        else if(morse.equals("-...")){
            letter = 'B';
        }
        else if(morse.equals("-.-.")){
            letter = 'C';
        }
        else if(morse.equals("-..")){
            letter = 'D';
        }
        else if(morse.equals(".")){
            letter = 'E';
        }
        else if(morse.equals("..-.")){
            letter = 'F';
        }
        else if(morse.equals("--.")){
            letter = 'G';
        }
        else if(morse.equals("....")){
            letter = 'H';
        }
        else if(morse.equals("..")){
            letter = 'I';
        }
        else if(morse.equals(".---")){
            letter = 'J';
        }
        else if(morse.equals("-.-")){
            letter = 'K';
        }
        else if(morse.equals(".-..")){
            letter = 'L';
        }
        else if(morse.equals("--")){
            letter = 'M';
        }
        else if(morse.equals("-.")){
            letter = 'N';
        }
        else if(morse.equals("---")){
            letter = 'O';
        }
        else if(morse.equals(".--.")){
            letter = 'P';
        }
        else if(morse.equals("--.-")){
            letter = 'Q';
        }
        else if(morse.equals(".-.")){
            letter = 'R';
        }
        else if(morse.equals("...")){
            letter = 'S';
        }
        else if(morse.equals("-")){
            letter = 'T';
        }
        else if(morse.equals("..-")){
            letter = 'U';
        }
        else if(morse.equals("...-")){
            letter = 'V';
        }
        else if(morse.equals(".--")){
            letter = 'W';
        }
        else if(morse.equals("-..-")){
            letter = 'X';
        }
        else if(morse.equals("-.--")){
            letter = 'Y';
        }
        else if(morse.equals("--..")){
            letter = 'Z';
        }
        else if(morse.equals("-----")){
            letter = '0';
        }
        else if(morse.equals(".----")){
            letter = '1';
        }
        else if(morse.equals("..---")){
            letter = '2';
        }
        else if(morse.equals("...--")){
            letter = '3';
        }
        else if(morse.equals("....-")){
            letter = '4';
        }
        else if(morse.equals(".....")){
            letter = '5';
        }
        else if(morse.equals("-....")){
            letter = '6';
        }
        else if(morse.equals("--....")){
            letter = '7';
        }
        else if(morse.equals("---..")){
            letter = '8';
        }
        else if(morse.equals("----.")){
            letter = '9';
        }
        else if(morse.equals(".-...")){
            letter ='&';
        }
        else if(morse.equals(".----.")){
            letter = '\'';
        }
        else if(morse.equals(".--.-.")){
            letter = '@';
        }
        else if(morse.equals("-.--.-")){
            letter ='(';
        }
        else if(morse.equals("-.--.")){
            letter = ')';
        }
        else if(morse.equals("---...")){
            letter =':';
        }
        else if(morse.equals("--..--")){
            letter = ',';
        }
        else if(morse.equals("-...-")){
            letter = '=';
        }
        else if(morse.equals("-.-.--")){
            letter ='!';
        }
        else if(morse.equals(".-.-.-")){
            letter = '.';
        }
        else if(morse.equals("-....-")){
            letter = '-';
        }
        else if(morse.equals(".-.-.")){
            letter = '+';
        }
        else if(morse.equals(".-..-.")){
            letter ='"';
        }
        else if(morse.equals("..--..")){
            letter ='?';
        }
        else if(morse.equals("-..-.")){
            letter = '/';
        }
        return letter;
    }

    public static void main(String[] args)  throws Exception{
        int row = 1;
        String Local_Path = new String("D:/temp/MorseCode.txt");
        RandomAccessFile file = new RandomAccessFile(Local_Path,"r");
        String txt;
        String word = new String();
        String text = new String();
        MorseCodeDecode machine = new MorseCodeDecode();
        while((txt = file.readLine())!=null){
            for(int i =0;i<txt.length();i++)
            {
                if(txt.charAt(i) != ' ') {
                    word += txt.charAt(i);
                }
                else{
                    text += machine.DeCode(word);
                    word = "";
                }

            }
            System.out.println(text);
        }
        file.close();
    }
}
