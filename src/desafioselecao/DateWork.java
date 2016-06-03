
package desafioselecao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class DateWork {
    
    Calendar dateGet; // Pega horário do sistema
    String date; // Recebe horário formatado
    String greet; // Saudação dependendo do horário
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm"); // Máscara para formato de data
   
    public DateWork()
    {
        this.dateGet = Calendar.getInstance();
        this.date = dateFormat.format(dateGet.getTime());
    }

    public String setDate() // Joga a data para a interface
    {
        String dateOut = "Today is " + this.date;
        return dateOut;
    }

    public String increment() // Incrementa em minutos o valor entrado
    {
        int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value to increment in minutes:\n(E.g. 10 or 20)", "Increment", 3));
        System.out.println(value);
        this.dateGet.add(Calendar.MINUTE, value);
        this.date = this.dateFormat.format(this.dateGet.getTime());
        
        return this.date;
    }
    
    public String decrement() // Decrementa em minutos o valor entrado
    {
        int value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value to decrement in minutes:\n(E.g. 10 or 20)", "Decrement", 3));
        System.out.println(value);
        this.dateGet.add(Calendar.MINUTE, -value);
        this.date = this.dateFormat.format(this.dateGet.getTime());
        
        return this.date;
    }

    public String setGreet() // Define qual será a saudação
    {
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        int hour = Integer.parseInt(hourFormat.format(this.dateGet.getTime()));
        
        if (hour >= 6 && hour <= 12) {this.greet = "Good Morning!";}
        
        else if (hour > 12 && hour <= 18) {this.greet = "Good Afternoon!";}
        
        else {this.greet = "Good Evening!";}
        
        return this.greet;
    }
    
}
