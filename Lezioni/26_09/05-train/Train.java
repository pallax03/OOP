class Train {
    int nTotSeats;                // (Numero dei posti totali del treno)
    int nFirstClassSeats;         // (Numero dei posti in prima classe)
    int nSecondClassSeats;        // (Numero dei posti in seconda classe)
    int nFirstClassReservedSeats; // (Numero dei posti in prima classe già prenotati)
    int nSecondClassReservedSeats;// (Numero dei posti in seconda classe già prenotati)

    void build(int nTotSeats, int nFirstClassSeats, int nSecondClassSeats) {
        this.nTotSeats = nTotSeats;
        this.nFirstClassSeats = nFirstClassSeats;
        this.nSecondClassSeats = nSecondClassSeats;
        deleteAllReservations();
    }   

    void reserveFirstClassSeats(int nPrenotazioni) {
        if(this.nFirstClassReservedSeats+nPrenotazioni<=this.nFirstClassSeats)
        {
            System.out.println("prenotazione avvenuta con successo in prima classe!");
            this.nFirstClassReservedSeats+=nPrenotazioni;
        }
        else
            System.out.println("prenotazione NON possibile!");
    }

    void reserveSecondClassSeats(int nPrenotazioni) {
        if(this.nSecondClassReservedSeats+nPrenotazioni<=this.nSecondClassSeats)
        {
            System.out.println("prenotazione avvenuta con successo in seconda classe!");
            this.nSecondClassReservedSeats+=nPrenotazioni;
        }
        else
            System.out.println("prenotazione NON possibile!");
    }

    double getTotOccupancyRatio() {
        return (double)((this.nFirstClassReservedSeats + this.nSecondClassReservedSeats) * 100)/(double)this.nTotSeats;
    }

    double getFirstClassOccupancyRatio() {
        return (double)(this.nFirstClassReservedSeats * 100)/(double)this.nFirstClassSeats;
    }

    double getSecondClassOccupancyRatio() {
        return (double)(this.nSecondClassReservedSeats * 100)/(double)this.nSecondClassSeats;
    }

    void deleteAllReservations() {
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }
}
