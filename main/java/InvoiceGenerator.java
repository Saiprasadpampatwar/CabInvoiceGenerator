public class InvoiceGenerator {
    private static final double COST_PER_KM = 10;
    private static final double COST_PER_MIN = 1;
    private static final double MINIMUMFARE = 5;

    public double calculateTotalFare(double distance, double time) {
        double fare = (distance*COST_PER_KM+time*COST_PER_MIN);
        if(fare>MINIMUMFARE){
            return fare;
        }
        return MINIMUMFARE;
    }

    public double calculateTotalFare(Ride[] rides) {
        double fare=0.0;
        for(Ride ride: rides){
            fare += this.calculateTotalFare(ride.distance,ride.time);
        }
        return fare;
    }
}
