package id.ac.poliban.mi.sultan.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btSpanyol = findViewById(R.id.btSpanyol);
        Button btJerman = findViewById(R.id.btJerman);
        Button btItalia = findViewById(R.id.btItalia);
        Button btInggris = findViewById(R.id.btInggris);

        btSpanyol.setOnClickListener(v -> {

            Toast.makeText(this, "Real Madrid Juaranya", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Real Madrid Kalah Melawan Barcelona", Toast.LENGTH_SHORT).show();
        });

        btJerman.setOnClickListener(v -> Toast.makeText(this, "Munchen Raksasa Jerman!", Toast.LENGTH_SHORT).show());
        btItalia.setOnClickListener(v -> Toast.makeText(this, "Juventus Big Italia", Toast.LENGTH_SHORT).show());
        btInggris.setOnClickListener(v -> Toast.makeText(this, "Tottenham idolaku", Toast.LENGTH_SHORT).show());
    }
}
