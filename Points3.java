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
public class Points3 {
    
    public  int x;
    public int y;
    public int z;
    public int ax;
    public int by;
    public int cz;
    
    public Points3 add1;
    public Points3 add2;
    public Points3 add3;
    public Points3 add4;
    
    public Points3()
    {
       
    }
    
    public void setPoints(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
//    public String getPoints()
//    {
//        return "" + this.x + "" + this.y + "" + this.z;       //Was screwing around with things
//    }
    public void zeroOut()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    public void manhattanOrigin(Points3 add1, Points3 add2)
    {
        int origin;
        this.ax = add2.x - add1.x;
        this.by = add2.y - add1.y;
        this.cz = add2.z - add1.z;
        
        origin = this.ax + this.by + this.cz;
        int newOrigin = Math.abs(origin);
        System.out.println("The distance between that point and the origin is: " + newOrigin + " units");
        
    }
    
    public void manhattanGoal(Points3 add3, Points3 add4)
    {
        
        int goal;
        add4.x = 100;
        add4.y = 100;
        add4.z = 100;
        
        this.ax = add4.x - add3.x;
        this.by = add4.y - add3.y;
        this.cz = add4.z + add3.z;
        
        goal = this.ax + this.by + this.cz;
        System.out.println("The distance between this point and the goal is: " + goal + " units.");
    }
   
   
    
    public String toString()
    {
        return "(" + this.x + ", " + this.y + ", " + this.z + ")"; 
    }
    
}
