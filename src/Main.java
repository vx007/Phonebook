import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Long> phonebook = new HashMap<>();
        Random random = new Random();

        ArrayList<String> list = new ArrayList<>();
        list.add("Иванов АА");
        list.add("Иванов ББ");
        list.add("Иванов ВВ");
        list.add("Иванов ГГ");
        list.add("Иванов ДД");
        list.add("Иванов ЕЕ");
        list.add("Иванов ЖЖ");
        list.add("Иванов ЗЗ");
        list.add("Иванов ИИ");
        list.add("Иванов КК");
        list.add("Иванов ЛЛ");
        list.add("Иванов ММ");
        list.add("Иванов НН");
        list.add("Иванов ОО");
        list.add("Иванов ПП");
        list.add("Иванов РР");
        list.add("Иванов СС");
        list.add("Иванов ТТ");
        list.add("Иванов УУ");
        list.add("Иванов ФФ");

        for (String element: list){
            phonebook.put(element, random.nextLong(70000000000L));
        }

        for (String element: phonebook.keySet()){
            System.out.println(element + ' ' + phonebook.get(element));
        }
    }
}
