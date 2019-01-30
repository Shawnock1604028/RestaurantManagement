
package RestaurantManagement.projectresraurant;


public class Main {
    
    public static boolean loggedIn = false;
    
    public static String username;
    
    public static void main(String[] args) {
        
        Login frame = new Login();
            frame.setTitle("Login");
            frame.setVisible(true);
    }   
}