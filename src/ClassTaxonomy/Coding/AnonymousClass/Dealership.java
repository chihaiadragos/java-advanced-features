package ClassTaxonomy.Coding.AnonymousClass;

import java.time.LocalDate;

public class Dealership {
    private class BrandOffer implements Offer {
        private CarType carType;

        @Override
        public int getDiscount(Car car) {
            switch (car.getType()) {
                case MERCEDES:
                    return 5;
                case FIAT:
                    return 10;
                case SKODA:
                    return 15;
                default:
                    return 0;
                }
                /*
            >>>Ceva identatie facuta de intelj<<<

            return switch (car.getType()) {
                case MERCEDES -> 5;
                case FIAT -> 10;
                case SKODA -> 15;
            };
                 */
            }
        }
    private class DealerOffer implements Offer {

        @Override
        public int getDiscount(Car car) {
            int currentYear = LocalDate.now().getYear();
            if (car.getType().equals(CarType.MERCEDES)){
                return 300 * (currentYear - car.getYear());
            } else if (car.getType().equals(CarType.FIAT)) {
                return 100 * (currentYear - car.getYear());
            }
            return 150 * (currentYear - car.getYear());
        }
    }
    double getFinalPrice(Car car) {
        BrandOffer brandOffer = new BrandOffer();
        int brandOfferDiscount = brandOffer.getDiscount(car);
        double carBrandDiscount = brandOfferDiscount / 100. * car.getPrice();
        System.out.println("A fost aplicata oferta de Brand: " + carBrandDiscount);
//        car.setPrice(car.getPrice() * (1 - brandOffer.getDiscount(car) / 100.)); <- . asta stie sa imparta ca double si sa nu mai faca cast (double)

        DealerOffer dealerOffer = new DealerOffer();
        int dealerOfferDiscount = dealerOffer.getDiscount(car);
        car.setPrice(car.getPrice() - carBrandDiscount - dealerOfferDiscount);
        System.out.println("A fost aplicata oferta de Dealer: " + (double) dealerOfferDiscount);

        return car.getPrice();
    }

    void negotiate(Car car, Offer offer) {
        int clientDiscount = offer.getDiscount(car);
        car.setPrice(car.getPrice() * (1 - clientDiscount / 100.));
        System.out.println("Clientul a negociat un discount de: " + clientDiscount + "%");
        System.out.println("Pretul dupa oferta negociata de client: " + car.getPrice());
    }
}

