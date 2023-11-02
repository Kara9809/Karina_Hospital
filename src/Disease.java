public class Disease {
    private DiseaseDescription diseaseDescription;
    private int timeToCure;

    public Disease() {
        this.diseaseDescription = DiseaseDescription.getRandomDiseaseDescription();
        this.timeToCure = (int) (Math.random() * (19) * 3); //3-21day
    }

    public DiseaseDescription getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(DiseaseDescription diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

    public int getTimeToCure() {
        return timeToCure;
    }

    public void setTimeToCure(int timeToCure) {
        this.timeToCure = timeToCure;
    }

    @Override
    public String toString() {
        return "Disease Description: " + diseaseDescription +
                " Time to cure: " + timeToCure;
    }
}
