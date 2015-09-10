/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cord;

/**
 *
 * @author XealRetro
 */
public class Points {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Points3 cord1 = new Points3();
        Points3 aCord = new Points3();
        Points3 bCord = new Points3();
        Points3 cCord = new Points3();
        Points3 dummy = new Points3();
        
        aCord.setPoints(5, 6, 7);
        bCord.setPoints(0, 0, 0);
       
        System.out.println(aCord);
        System.out.println(bCord);
        
        aCord.zeroOut();
        bCord.zeroOut();
        
        System.out.println(aCord);
        System.out.println(bCord);   
        
        aCord.setPoints(5, 6, 7);
        bCord.setPoints(0, 0, 0);
        
        cCord.manhattanOrigin(aCord, bCord);
        cCord.manhattanGoal(aCord, dummy);
        
       

    }
}
