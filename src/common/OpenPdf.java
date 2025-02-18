/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
/*import java.io.File;
import dob.MedicalUtils;
import javax.swing.JOptionPane;

/**
 *
 * @author satap
 
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File(MedicalUtils.billPath+id+".pdf")).exists()){
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32url.dll,FileProtocolHandler "+MedicalUtils.billPath+""+id+".pdf");
                
            } else{
                JOptionPane.showMessageDialog(null,"File doesn't exist.");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}*/

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import dob.MedicalUtils;

/**
 * A class to handle opening PDF files by their ID.
 */
public class OpenPdf {

    /**
     * Opens a PDF file based on the provided ID.
     *
     * @param id The ID used to locate the PDF file.
     */
    public static void openById(String id) {
        // Construct the file path
        String filePath = MedicalUtils.billPath + id + ".pdf";
        
        // Create the File object
        File file = new File(filePath);

        // Check if the file exists
        if (file.exists()) {
            try {
                // Open the file using the default application
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + filePath);
                // Optional: wait for the process to complete
                p.waitFor();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error executing the command: " + e.getMessage());
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Process interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        } else {
            JOptionPane.showMessageDialog(null, "File doesn't exist.");
        }
    }
}

