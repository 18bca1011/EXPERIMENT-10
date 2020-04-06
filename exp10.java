import java.awt.*;  
import java.awt.event.*;  
class exp10
    {  
	public static void main(String[] args) {  
	    Frame f=new Frame("Color Changer"); 
        Button change=new Button("Change Color"); 
        Choice choice=new Choice();  
        choice.setBounds(60,50,150,30); 
        change.setBounds(60,80,150,30);
    
        choice.setBackground(Color.BLUE); 
        change.setBackground(Color.BLUE); 
        
        choice.add("black");  
        choice.add("blue");  
        choice.add("green");  
        choice.add("white");  
        choice.add("green");
        change.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) { 
                int index = choice.getSelectedIndex();
                switch(index){
                    case 0:
                        f.setBackground(Color.BLACK);
                        break;
                    case 1:
                        f.setBackground(Color.BLUE);
                        break;
                    case 2:
                        f.setBackground(Color.GREEN);
                        break;
                    case 3:
                        f.setBackground(Color.WHITE);
                        break;
                    case 4:
                        f.setBackground(Color.GREEN);
                        break; 
                }      
            }  
        });
        
        f.add(choice);
        f.add(change); 
	    f.setSize(270,270);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	     
	   
	    
	}  
}  
