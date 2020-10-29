package java_experiment;

public class BuilderPattern {
    public static void main(String[] args) {
       
        PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
        
        PersonInfo result = personInfoBuilder
                .setName("MISTAKE")
                .setAge(20)
                .setFavoriteAnimal("cat")
                .setFavoriteColor("black")
                .setName("JDM") 
                .setFavoriteNumber(7)
                .build();

        System.out.println(result.getPersonInfo());
    }
}