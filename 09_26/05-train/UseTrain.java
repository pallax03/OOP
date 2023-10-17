class UseTrain {
    public static void main(String[] args) {
        Train intercity = new Train();

        intercity.build(50, 20, 30);
        
        intercity.reserveFirstClassSeats(18);
        intercity.reserveSecondClassSeats(26);
        
        System.out.printf("\ntot occupancy ratio: %.1f%%\n", intercity.getTotOccupancyRatio());
        System.out.printf("First Class occupancy ratio: %.1f%%\n", intercity.getFirstClassOccupancyRatio());
        System.out.printf("Second Class occupancy ratio: %.1f%%\n", intercity.getSecondClassOccupancyRatio());
        
        intercity.deleteAllReservations();
        System.out.println("\nprenotazioni cancellate!\n");

        intercity.reserveFirstClassSeats(2);
        intercity.reserveSecondClassSeats(29);

        System.out.printf("\ntot occupancy ratio: %.1f%%\n", intercity.getTotOccupancyRatio());
        System.out.printf("First Class occupancy ratio: %.1f%%\n", intercity.getFirstClassOccupancyRatio());
        System.out.printf("Second Class occupancy ratio: %.1f%%\n", intercity.getSecondClassOccupancyRatio());
    }
}
