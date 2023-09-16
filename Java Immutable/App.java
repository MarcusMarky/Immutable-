public class App {
    public static void main(String[] args) {
// Câte obiecte Monedă au fost create ?
// Intrebarea nr 1: Au fost create 3 obiecte.  
        Currency todaysCurrency = new Currency("EUR","MDL",17.50f,"2020-01-01");
        Currency tomorrowsCurrency = todaysCurrency.withDate("2020-01-02").withValue(18.00f);
// Și dacă pentru tomorrowsCurrency ar trebui să modificați și coeficientul în 18.00f - cum ar arăta în cod?
// Intrebarea nr 2. -----^----v

        
        System.out.println(todaysCurrency);
        System.out.println(tomorrowsCurrency);

        }
    }


final class Currency {
    private final String baseCode;
    private final String code;
    private final Float value;
    private final String date;

    public Currency(String baseCode, String code, Float value, String date) {
        this.baseCode = baseCode;
        this.code = code;
        this.value = value;
        this.date = date;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getCode() {
        return code;
    }

    public Float getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public Currency withBaseCode(String newBaseCode) {
        return new Currency(newBaseCode, this.code, this.value, this.date);
    }

    public Currency withCode(String newCode) {
        return new Currency(this.baseCode, newCode, this.value, this.date);
    }

    public Currency withValue(Float newValue) {
        return new Currency(this.baseCode, this.code, newValue, this.date);
    }

    public Currency withDate(String newDate) {
        return new Currency(this.baseCode, this.code, this.value, newDate);
    }

    @Override
    public String toString() {
        return "Currency: " +
                "baseCode: " + baseCode + "" +
                ", code: "   + code  +    "" +
                ", value: "  + value +    "" +
                ", date: "   + date  ;
                
    }
}
