import javax.swing.JOptionPane;

public class SixNineteen {
    public static void main(String[] args) {
        
    String input1 = JOptionPane.showInputDialog("What is the first side?");
    String input2 = JOptionPane.showInputDialog("What is the second side?");
    String input3 = JOptionPane.showInputDialog("What is the third side?");
    
    double first = Double.parseDouble(input1);
    double second = Double.parseDouble(input2);
    double third = Double.parseDouble(input3);
            
    if(formula(first, second, third) == true){
        JOptionPane.showMessageDialog(null, "This is a traingle.");
        JOptionPane.showMessageDialog(null, "The area of the triangle is: " + Math.round(Math.sqrt(area(first, second, third))));
    }
    else{
    JOptionPane.showMessageDialog(null,"This is not a traingle.");
    }
    }
public static boolean formula(double a, double b, double c){
    if(a+b >c && b+c >a && a+c >b){
       return true;  
    }
    else{
        return false;
    }
}    
public static double area(double a, double b, double c){
    return ((a + b + c)/2)* ((((a + b + c)/2)-a) * (((a + b + c)/2)-b) * (((a + b + c)/2)-c));
}
}
