package proj1_3311;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JFrame implements ActionListener {
	
	  
	  public final int NUM_OF_SHAPES = 6;
	  public Shape[] shapeArr = new Shape[NUM_OF_SHAPES];
	  public boolean isSorted = false;
	  public boolean isLoaded = false;
	  public JPanel p;
	  public JButton loadBt;
	  public JButton sortBt;
	  public Color c;
	  
	  public MyPanel() {
			p = new JPanel();
			add(p); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setResizable(false);
		    setSize(600, 600);
		    setLocationRelativeTo(null);
		    setTitle("Display Shapes");
		    setVisible(true);
		    
			loadBt = new JButton("Load shapes");
			sortBt = new JButton("Sort shapes");
		    
		    add(p);
		    
			loadBt.addActionListener(this);
			sortBt.addActionListener(this);
		    p.add(loadBt);
		    p.add(sortBt);
		    loadBt.setBounds(150, 20, 150, 30);
		    sortBt.setBounds(300, 20, 150, 30);
		    }
	  
	public static void main(String[] args) {
		new MyPanel();
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loadBt) {
			if(!isSorted) {
				Controller.createShapeArray(NUM_OF_SHAPES, shapeArr);
				//Set new shapes to shapeArr
				
				isLoaded = true;
				repaint();
			}
		}else if(e.getSource()==sortBt) {
			if(!isSorted) {
				isSorted = true;
				SortingTechnique.sortShapes(shapeArr);
				repaint();
			}
		}
	}
	
	
    public void paint(Graphics g){
		if(isLoaded || isSorted) {
			super.paint(g);
			for(Shape s : shapeArr) {
				g.setColor(s.getColor());
				if(!(s instanceof Circle)) {
					g.fillRect(s.getX(), s.getY(), ((Rectangle)s).getWidth(), ((Rectangle)s).getHeight());
				} else {
					g.fillOval(s.getX(), s.getY(), ((Circle)s).getRadius()*2, ((Circle)s).getRadius()*2);
				}
			}
		}
	}
}


