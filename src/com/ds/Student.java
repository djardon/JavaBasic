package com.ds;

public class Student {
    //********* Properties *********/
    private static final String school = "Neoland";

    String name;
    String email;
    int age;
    float weight;
    double height;

    //********* Enums *********/
    enum ImcType {
        DELGADEZ_SEVERA,
        DELGADEZ_MODERADA,
        DELGADEZ,
        NORMAL,
        SOBREPESO,
        SOBREPESO_MODERADO,
        SOBREPESO_SEVERO
    }


    //********* Constructor *********/
    public Student() { }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }


    //********* Class functions *********/
    public static void printSchool() {
        System.out.println("School " + school);
    }


    //********* Public functions *********/
    public float imc() {
        // '(weight / heightSquare())' operation return a double value
        // with '(float)' cast double to float
        return (float) (weight / heightSquare());
    }

    public String imcDescription() {
        ImcType imcType = calculateImcType();
        return calculateImcDescription(imcType);
    }

    public ImcType calculateImcType() {
        float imc = imc();
        ImcType typeIMC;

        if(imc < 16) {
            typeIMC = ImcType.DELGADEZ_SEVERA;
        } else if(imc < 17) {
            typeIMC = ImcType.DELGADEZ_MODERADA;
        } else if(imc < 19) {
            typeIMC = ImcType.DELGADEZ;
        } else if(imc < 25) {
            typeIMC = ImcType.NORMAL;
        } else if(imc < 30) {
            typeIMC = ImcType.SOBREPESO;
        } else if(imc < 40) {
            typeIMC = ImcType.SOBREPESO_MODERADO;
        } else {
            typeIMC = ImcType.SOBREPESO_SEVERO;
        }

        return typeIMC;
    }

    public boolean isOver18() {
        // We could also return the result of the comparison negation '!(age < 18)'
        return age >= 18;
    }

    public boolean isValidEmail() {
        // Return 'true' when 'email' is not empty or blank
        return !email.isBlank();
    }


    //********* Private functions *********/
    private double heightSquare() {
        return height * height;
    }

    private String calculateImcDescription(ImcType imcType) {
        // Return imc type description according to 'imcType' enum values
        return switch (imcType) {
            case DELGADEZ_SEVERA -> "Infrapeso: Delgadez Severa";
            case DELGADEZ_MODERADA -> "Infrapeso: Delgadez moderada";
            case DELGADEZ -> "Infrapeso: Delgadez aceptable";
            case NORMAL -> "Peso Normal";
            case SOBREPESO -> "Sobrepeso";
            case SOBREPESO_MODERADO -> "Obeso: Tipo I";
            case SOBREPESO_SEVERO -> "Obeso: Tipo II";
        };
    }
}
