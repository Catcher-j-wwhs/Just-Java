package com.example.android.justjava;
/**

 IMPORTANT: Make sure you are using the correct package name.
 This example uses the package name:
 package com.example.android.justjava
 If you get an error when copying this code into Android studio, update it to match teh package name found
 in the project's AndroidManifest.xml file.
 **/

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.justjava.R;

import java.text.NumberFormat;



/**

 This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**

     This method is called when the order button is clicked.
     */
    public int quantity = 2;


    public void increment_up_quantity(View view) {
        quantity+= 1;
        display(quantity);


    }
    public void increment_down_quantity(View view) {
        quantity-= 1;
        display(quantity);


    }
    public void submitOrder(View view) {
        String priceMessage = "Price $ " + quantity*5 +"\nThank you!" ;
        displaymessage(priceMessage);
    }

    /**

     This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView)
                findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView)
                findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    private void  displaymessage(String message){
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}
