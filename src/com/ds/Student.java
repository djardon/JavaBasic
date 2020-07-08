package com.ds;

public class Student {
    //********* Vars *********/
    private static final String school = "Neoland";

    // Default all vars accessibility are 'Public'
    String name;
    String email;
    int age;
    float weight;
    double height;

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
        float studentIMC = imc();
        return calculateImcDescription(studentIMC);
    }

    public ImcType imcType() {
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

    private String calculateImcDescription(float imc) {
        // menor 16.0 -> "Infrapeso: Delgadez Severa"
        // mayor igual 16.0 y menor de 17 -> "Infrapeso: Delgadez moderada"
        // mayor igual 17 y menor 19 -> "Infrapeso: Delgadez aceptable"
        // mayor igual 19 y menor 25 -> "Peso Normal"
        // mayor igual 25 y menor 30 -> "Sobrepeso"
        // mayor igual 30 y menor igual 40 -> "Obeso: Tipo I"
        // mayor 40 -> "Obeso: Tipo II"
        String description = "";

        if(imc < 16) {
            description = "Infrapeso: Delgadez Severa";
        } else if(imc < 17) {
            description = "Infrapeso: Delgadez moderada";
        } else if(imc < 19) {
            description = "Infrapeso: Delgadez aceptable";
        } else if(imc < 25) {
            description = "Peso Normal";
        } else if(imc < 30) {
            description = "Sobrepeso";
        } else if(imc < 40) {
            description = "Obeso: Tipo I";
        } else {
            description = "Obeso: Tipo II";
        }

        return description;
    }
}
