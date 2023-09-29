public class Bremsweg {
    public double getAnhalteweg(double velocity) {
        return getBremsweg(velocity) + getReaktionsweg(velocity);
    }

    public double getReaktionsweg(double velocity) {
        return 3 * velocity / 10;
    }

    public double getBremsweg(double velocity) {
        return (velocity / 10) * (velocity / 10);
    }

    public static void main(String[] args) {
        Bremsweg bremswegObj = new Bremsweg();
        double velocity = 50.0;

        double anhalteweg = bremswegObj.getAnhalteweg(velocity);
        System.out.println("Anhalteweg: " + anhalteweg);

        double bremsweg = bremswegObj.getBremsweg(velocity);
        System.out.println("bremsweg: " + bremsweg);

        double reaktionsweg = bremswegObj.getReaktionsweg(velocity);
        System.out.println("reaktionsweg: " + reaktionsweg);

    }
}
