/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custom;

import java.awt.Font;
import java.io.File;

/**
 *
 * @author Administrator
 */
//test
public class setFont {
    File fontStyle = new File("src/custom/Poppins-Bold.ttf");
    private setFont(){
        try {
            File fontStyle = new File("src/custom/Poppins-Bold.ttf");
            Font font = Font.createFont(Font.TRUETYPE_FONT, fontStyle).deriveFont(24f);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
