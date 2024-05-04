package seminar_3;


import java.util.ArrayList;
import java.util.List;

public class Task_2 {
    public static void main(String[] args) {
        List<String> planets = List.of("Меркурий", "Сатурн", "Меркурий", "Марс", "Земля", "Марс");
        System.out.println(planets2for(planets));
    }
    public static void Planets(){
        List<String> planets = List.of("Меркурий", "Сатурн", "Меркурий", "Марс", "Земля", "Марс");
        List<String> uniquePlanets = new ArrayList<>();
        List<Integer> counter = new ArrayList<>();
        for(int i = 0; i < planets.size(); i++) {
           String planet = planets.get(i);
           int position = uniquePlanets.indexOf(planet);
           if(position >= 0){
               counter.set(position, counter.get(position) + 1);
           }
           else {
               uniquePlanets.add(planet);
               counter.add(1);
           }
        }
        printPlanetCount(uniquePlanets, counter);
    }
    private static void printPlanetCount(List<String> planets, List<Integer> counts){
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }
    public static String planets2for(List<String> planets){
        StringBuilder bilder = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            if(!result.contains(planets.get(i))){
                result.add(planets.get(i));
                int counter = 0;
                for(int j = 0; j < planets.size(); j++){
                    if(planets.get(j).equals(planets.get(i))){
                        counter++;
                    }
                }
                bilder.append(planets.get(i)).append("  :  ").append(counter).append(", ");
            }
        }
        return bilder.toString();
    }
}
