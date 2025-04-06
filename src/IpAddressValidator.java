import java.util.Scanner;

public class IpAddressValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input IP address
        System.out.print("Enter an IP address: ");
        String ipAddress = scanner.nextLine();

        // Validate the IP address
        if (isValidIpAddress(ipAddress)) {
            System.out.println("Valid IP");
        } else {
            System.out.println("Invalid IP");
        }

        scanner.close();
    }

    // Function to validate the IP address
    public static boolean isValidIpAddress(String ipAddress) {
        // Split the input IP address into segments
        String[] segments = ipAddress.split("\\.");

        // Check if the IP address contains exactly 4 segments
        if (segments.length != 4) {
            return false;
        }

        // Validate each segment
        for (String segment : segments) {
            // Check if the segment is a number and between 0 and 255
            try {
                int value = Integer.parseInt(segment);

                // Check if the segment is a valid integer, not single digit, and not leading with 0
                if (value < 0 || value > 255 || segment.length() != String.valueOf(value).length()) {
                    return false;
                }

            } catch (NumberFormatException e) {
                return false; // If the segment is not a valid integer
            }
        }

        return true;
    }
}
