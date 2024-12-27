/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmeticstore;

import javax.swing.JOptionPane;

/**
 *
 * @author Kavindu
 */
public class Users {
    public static String usersDetails[][] = null;
    
    public static String userType = "";
    
    public Users() {
        usersDetails = new String[1][4];
        usersDetails[0][0] = "U0001";
        usersDetails[0][1] = "Savindu";
        usersDetails[0][2] = "1234";
        usersDetails[0][3] = "Administrator";
    }
    
    public static void increaseLengthUsers(String userId, String username, String password, String selectedValue) {
        String[][] newUsers = new String[usersDetails.length + 1][4];

        for (int i = 0; i < usersDetails.length; i++) {
            for (int j = 0; j < usersDetails[i].length; j++) {
                newUsers[i][j] = usersDetails[i][j];
            }
        }

        newUsers[usersDetails.length][0] = userId;
        newUsers[usersDetails.length][1] = username;
        newUsers[usersDetails.length][2] = password;
        newUsers[usersDetails.length][3] = selectedValue;

        usersDetails = newUsers;
    }

    
    public static void decreaseUserArrayLength() {
        if (usersDetails.length > 1) {
            String[][] newUsers = new String[usersDetails.length - 1][3];

            for (int i = 0; i < newUsers.length; i++) {
                for (int j = 0; j < newUsers[i].length; j++) {
                    newUsers[i][j] = usersDetails[i][j];
                }
            }

            usersDetails = newUsers;
        } else {
            JOptionPane.showMessageDialog(null, "Cannot Delete this Administrator account!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}