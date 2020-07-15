package com.ds.classes;

public class Person {
    public String name;
    public int age;
    public Gender gender;
    public float weight;
    public double height;

    //********* Enums *********/
    public enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

    public enum ImcType {
        DELGADEZ_SEVERA,
        DELGADEZ_MODERADA,
        DELGADEZ,
        NORMAL,
        SOBREPESO,
        SOBREPESO_MODERADO,
        SOBREPESO_SEVERO
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
