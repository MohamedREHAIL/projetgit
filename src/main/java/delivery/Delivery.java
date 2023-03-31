package delivery;

public class Delivery {


        private double distance;
        private double poid;

        public Delivery(double distance, double poid) {
            this.distance = distance;
            this.poid = poid;
        }

        public double calculateCost() {
            double cout = 10.0;

            if (distance > 50.0) {
                cout += 0.5 * (distance - 50.0);
            }

            if (poid >= 10.0 && poid < 25.0) {
                cout+= 2.0;
            } else if (poid >= 25.0) {
                cout += 5.0;
            }

            return cout;
        }


}
