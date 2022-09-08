package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char character) {
        if(character >= 65 && character <= 90 || character >= 97 && character <= 122){
            System.out.println("English");
        }else System.out.println("Non English");
    }
}
