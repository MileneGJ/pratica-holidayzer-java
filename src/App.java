import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    static List<Holiday> feriados = new ArrayList<> (Arrays.asList(
            new Holiday("01/01/2023", "Confraternização mundial"),
            new Holiday("21/02/2023","Carnaval"),
            new Holiday("17/04/2023","Páscoa"),
            new Holiday("21/04/2023","Tiradentes"),
            new Holiday("01/05/2023", "Dia do trabalho"),
            new Holiday("08/06/2023","Corpus Christi"),
            new Holiday("07/09/2023","Independência do Brasil"),
            new Holiday("12/10/2023","Nossa Senhora Aparecida"),
            new Holiday("02/11/2023", "Finados"),
            new Holiday("15/11/2023","Proclamação da República"),
            new Holiday("25/12/2023","Natal")
        ));

    static String isHoliday(String date) {
        for(int i=0; i<feriados.size();i++) {
            Holiday feriado = feriados.get(i);
            if(feriado.getDate().equals(date)){
                return "Dia " + date + " é dia de " + feriado.getName();
            }
        }
        return "Dia " + date + " não é feriado";
    }

    static List<String> getHolidays() {
        return feriados.stream().map(Holiday::getDateAndName).collect(Collectors.toList());
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isHoliday("21/02/2023"));
        System.out.println(isHoliday("20/02/2023"));

        System.out.println("Lista de feriados:");
        System.out.println(getHolidays());
    }
}
