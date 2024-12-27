package cosmeticstore;

import javax.swing.JOptionPane;

public class Items {
    public static String[][] items;

    public Items() {
        items = new String[0][5];
    }

    public static void increaseLengthItems(String itemId, String itemName, String qty, String price, String categoryName) {      
        String[][] newItems = new String[items.length + 1][5];

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                newItems[i][j] = items[i][j];
            }
        }

        newItems[items.length][0] = itemId;
        newItems[items.length][1] = itemName;
        newItems[items.length][2] = qty;
        newItems[items.length][3] = price;
        newItems[items.length][4] = categoryName;

        items = newItems;
    }

    public static void decreaseItemsArrayLength() {
        if (items.length > 1) {
            String[][] newItems = new String[items.length - 1][5];

            for (int i = 0; i < newItems.length; i++) {
                for (int j = 0; j < newItems[i].length; j++) {
                    newItems[i][j] = items[i][j];
                }
            }

            items = newItems;
        } else {
            JOptionPane.showMessageDialog(null, "Cannot Delete!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
