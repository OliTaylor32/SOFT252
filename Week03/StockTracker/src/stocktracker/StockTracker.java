/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

/**
 *
 * @author otaylor4
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PhysicalStockItem objPhysicalItem = 
                new PhysicalStockItem("snuff: A Diskworld book by terry Pratchett", 100);
        
        ServiceStockItem objVirtualItem = 
                new ServiceStockItem("Wintersmith: A Diskworld eBook by Terry Pratchett");
        
        String strMessage = objPhysicalItem.getName()
                + ",Is in stock = " + objPhysicalItem.isInStock()
                + ", quantity in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objPhysicalItem.getName()
                + ",Is in stock = " + objVirtualItem.isInStock()
                + ", quantity in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
        
        
    }
    
}
