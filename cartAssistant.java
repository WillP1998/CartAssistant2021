package supremeGUI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class cartAssistant {

	public static void main(String[] args) {
		JPanel panel = new JPanel();
		panel.setBackground(Color.lightGray);		
		panel.setBounds(0, 0, 500, 300);
		
		JFrame frame = new JFrame("Cart Assistant 2021");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.setResizable(false);
		
		
		panel.setLayout(new FlowLayout (FlowLayout.LEADING));
		
		JLabel productUrl = new JLabel("Product Url: ");
		productUrl.setBounds(10, 20, 80, 25);
		panel.add(productUrl);
		
		JTextField prodUrl = new JTextField();
		prodUrl.setBounds(90, 20, 300, 25);
		panel.add(prodUrl);
		
		JLabel userName = new JLabel("Name: ");
		userName.setBounds(30, 50, 80, 25);
		panel.add(userName);
		
		JTextField name = new JTextField();
		name.setBounds(80, 50, 150, 25);
		panel.add(name);
		
		JLabel email = new JLabel("Email: ");
		email.setBounds(30, 80, 300, 25);
		panel.add(email);
		
		JTextField emailAddress = new JTextField();
		emailAddress.setBounds(80, 80, 300, 25);
		panel.add(emailAddress);
		
		JLabel telephone = new JLabel("Phone Number: ");
		telephone.setBounds(240, 50, 110, 25);
		panel.add(telephone);
		
		JTextField phone = new JTextField();
		phone.setBounds(340, 50, 130, 25);
		panel.add(phone);
		
		JLabel streetAddress = new JLabel("Street Address: ");
		streetAddress.setBounds(10, 110, 120, 25);
		panel.add(streetAddress);
		
		JTextField shippingAddress = new JTextField();
		shippingAddress.setBounds(130, 110, 180, 25);
		panel.add(shippingAddress);
		
		JLabel zipCode = new JLabel("Zip Code: ");
		zipCode.setBounds(20, 140, 80 ,25);
		panel.add(zipCode);
		
		JTextField zip = new JTextField();
		zip.setBounds(130, 140, 80, 25);
		panel.add(zip);
		
		JLabel city = new JLabel("City: ");
		city.setBounds(20, 170, 80, 25);
		panel.add(city);
		
		JTextField orderCity = new JTextField();
		orderCity.setBounds(50, 170, 80, 25);
		panel.add(orderCity);
		
			
		frame.setVisible(true);
		frame.add(panel);
		
}
}