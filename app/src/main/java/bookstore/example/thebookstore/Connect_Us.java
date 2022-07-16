package bookstore.example.thebookstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Connect_Us extends AppCompatActivity {
    TextView textView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_us);
        button = findViewById(R.id.supmet);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                Toast.makeText(Connect_Us.this, "Supmetted", Toast.LENGTH_SHORT).show();
                finish();
                startActivity(intent);

            }

        });






    }


}
