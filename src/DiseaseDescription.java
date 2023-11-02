public enum DiseaseDescription {
    TUBERCULOSIS,
    PNEUMONIA,
    COVID19,
    FRACTURE,
    CARDIO;
public static DiseaseDescription getRandomDiseaseDescription(){
    DiseaseDescription random = values()[(int)(Math.random()* values().length)];
    return random;
}

        }
