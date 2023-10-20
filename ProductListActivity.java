package com.example.projecto_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProductListActivity extends AppCompatActivity {
    private ListView listViewProducts;
    private DatabaseReference productsRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);





    }
    public void changeToActivity2(View view) {
        // Aquí puedes cambiar a Activity2 sin necesidad de usar la vista.
        Intent intent = new Intent(this, CheckoutActivity.class);
        startActivity(intent);
    }

}
