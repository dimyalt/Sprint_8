import java.util.Objects;

public class Account {

    private final String name;
    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() {
        int stringLenght = name.length();
        if (stringLenght > 3 & stringLenght < 19) {
            checkStringSpaces();
            return true;
        } else {
            System.out.println("Размер строки должен быть от 3 до 19 символов");
        }
        return false;
    }
    public boolean checkStringSpaces() {
        boolean checkStart = name.startsWith(" ");
        boolean checkEnd = name.endsWith(" ");
        if (!checkStart & !checkEnd) {
            checkStringSpace();
        } else {
            System.out.println("В начале и конце строки не должно быть пробелов");
        }
        return false;
    }
    public boolean checkStringSpace(){
        int flag = 0;
        String[] arr = name.split("");
        for (String i: arr) {
            if (Objects.equals(i, " ")){
                flag++;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            System.out.println("Должен быть 1 пробел в середине");
        }
        return false;
    }


}