public enum Season {
    WINTER(-10), SPRING(5), SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    }, AUTUMN(10);

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
