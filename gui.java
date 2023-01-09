package lifelevel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class gui implements ActionListener , WindowListener
{
	JFrame f2 = new JFrame("Nuova Missione");
	JPanel p2 = new JPanel();
	JTextField s = new JTextField();
	JTextField t = new JTextField();
	JTextField u = new JTextField();
	JTextField v = new JTextField();
	JLabel w = new JLabel("Nome");
	JLabel y= new JLabel("Descrizione");
	JLabel z = new JLabel("Exp");
	JLabel aa = new JLabel("data");
	JButton ab = new JButton("Salva");
	JButton ac= new JButton("Annulla");
	JFrame f = new JFrame("Life Level");
	JPanel p = new JPanel();
	JLabel a= new JLabel("Missioni completate");
	JLabel b= new JLabel("exp");
	JLabel c= new JLabel("0");
	JLabel d = new JLabel("0");
	JLabel h = new JLabel("Elenco Missioni");
	JButton g = new JButton("Apri");
	JFrame f1 = new JFrame("Elenco missioni");
	JButton i = new JButton("indietro");
	JLabel j = new JLabel("Nome");
	JLabel k = new JLabel("Descrizione");
	JLabel l = new JLabel("Exp");
	JButton n = new JButton("Completa");
	JLabel o = new JLabel("data");
	JLabel q = new JLabel();
	JLabel r = new JLabel();
	JPanel p1 = new JPanel();
	JMenuBar menuBar= new JMenuBar();
	JMenu menu = new JMenu("Gestione");
	JMenuItem menuItem = new JMenuItem("Aggiungi Missione");
	public void missione(String name, String description, String x)
	{
		String Nome, descrizione, esp;
		Date d = new Date();
		DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
		String data = formatoData.format(d);
		Nome= name;
		descrizione = description;
		esp= x;
		JLabel ad = new JLabel(Nome);
		JLabel ae = new JLabel(descrizione);
		JLabel af = new JLabel(esp);
		JLabel ag = new JLabel(data);
		p1.add(ad);
		p1.add(ae);
		p1.add(af);
		p1.add(ag);
	}
	public void completata()
	{
		int esperienza=0, sommatore=0;
		String val;
		boolean completamento= false;
		if(completamento==true)
		{
			val= c.getText();
			sommatore= Integer.valueOf(val);
			esperienza= esperienza + sommatore;
			val= String.valueOf(esperienza);
			c.setText(val);
		}
	}
	public gui()
	{
		menuBar.add(menu);
		menu.add(menuItem);
		menuItem.addActionListener(this);
		f2.setSize(400,500);
		f1.setSize(400, 500);
		f.setSize(400, 500);
		f.setVisible(true);
		f.add(p);
		p.setLayout(new GridLayout(3,2));
		p.add(a);
		p.add(d);
		p.add(b);
		p.add(c);
		p.add(h);
		p.add(g);
		g.addActionListener(this);
		i.addActionListener(this);
		f1.add(p1);
		p1.setLayout(new GridLayout());
		p1.add(j);
		p1.add(k);
		p1.add(l);
		p1.add(o);
		p1.add(q);
		p1.add(n);
		p1.add(i);
		p1.add(r);
		f1.setJMenuBar(menuBar);
		p2.setLayout(new GridLayout(5,2));
		p2.add(w);
		p2.add(s);
		p2.add(y);
		p2.add(t);
		p2.add(z);
		p2.add(u);
		p2.add(aa);
		p2.add(v);
		p2.add(ab);
		p2.add(ac);
		f2.add(p2);
		ab.addActionListener(this);
		ac.addActionListener(this);
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==g)
		{
			f.setVisible(false);
			f1.setVisible(true);
		}
		if(e.getSource()==i)
		{
			f1.setVisible(false);
			f.setVisible(true);
		}
		if(e.getSource()==menuItem)
		{
			f1.setVisible(false);
			f2.setVisible(true);
		}
		if(e.getSource()==ac)
		{
			f2.setVisible(false);
			f1.setVisible(true);
		}
		if(e.getSource()==ab)
		{
			String ah, ai, aj;
			ah= s.getText();
			ai= t.getText();
			aj= u.getText();
			missione(ah, ai, aj);
			f2.setVisible(false);
			f1.setVisible(true);
		}
	}
}