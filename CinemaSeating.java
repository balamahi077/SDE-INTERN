public class CinemaSeating {
    public static void main(String[] args) {

        
        // Step 1: Define the given inputs
        int totalAudience = 125;
        int seatsPerRow = 12;

        // Step 2: Use division (/) to find the quotient
        int completeRows = totalAudience / seatsPerRow;

        // Step 3: Use modulo (%) to find the remainder
        int peopleInLastRow = totalAudience % seatsPerRow;

        // Step 4: Print the results
        System.out.println("Total Audience = " + totalAudience);
        System.out.println("Seats Per Row = " + seatsPerRow);
        System.out.println("Complete Rows = " + completeRows);
        System.out.println("People in Last Row = " + peopleInLastRow);
    }
}