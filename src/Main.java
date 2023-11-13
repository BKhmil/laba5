import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {

        // ------------- ВАЛІДАЦІЯ НОМЕРУ
        String phoneNumber = "(+380)50-333-33-33";
        String regex = "\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }

        // ------------- ЗАМІНА ПРОБІЛІВ
        String text = "Я хочу    бути     програмістом";
        String reworkedText = text.replaceAll("\\s+", " ");
        System.out.println(reworkedText);

        // ------------- ВИДАЛЕННЯ HTML-ТЕГІВ
        String htmlText = "<div><p>Символи круглих дужок <code>'('</code> та <code>')'</code>. <br />Ці символи дозволяють отримати з рядка додаткову інформацію. <br/>Зазвичай, якщо парсер регулярних виразів шукає в тексті інформацію за заданим виразом і знаходить її - він просто повертає знайдений рядок.</p><p align=\"right\">А ось тут <a href=\"google.com\">посилання</a>, щоб життя медом не здавалося.</p></div>";
        String reworkedHtmlText = htmlText.replaceAll("<.*?>", "");
        System.out.println(reworkedHtmlText);
    }
}