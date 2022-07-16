package bookstore.example.thebookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LogIn extends AppCompatActivity {
    DatabaseHelper db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton login = (MaterialButton) findViewById(R.id.login);
        db = new DatabaseHelper(this);
        Intent intent = getIntent();

//admin
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                if(user.equals("")||pass.equals("")){
                    Toast.makeText(LogIn.this, "Blease enter alla fields ....", Toast.LENGTH_SHORT).show();
                }else{
     boolean checkUser =db.checkUser(user,pass);
     if(checkUser==true){
         Toast.makeText(LogIn.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
         Intent intent = new Intent(LogIn.this, MainActivity.class);
         startActivity(intent);
     }else{
         Toast.makeText(LogIn.this, "LOGIN FAILDE ....", Toast.LENGTH_SHORT).show();

     }
                }


//                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
//
//                    //correct
//                    Toast.makeText(LogIn.this, "LOGIN SUCCESSFULL", Toast.LENGTH_SHORT).show();
//                    Intent intent = new Intent(LogIn.this, MainActivity.class);
//                    startActivity(intent);
//
//                } else
//                    Toast.makeText(LogIn.this, "LOGIN FAILDE ....", Toast.LENGTH_SHORT).show();

            }
        });
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.instagram.com/sanaa.adel.9400/");
                Intent face = new Intent(Intent.ACTION_VIEW, uri);

                face.setPackage("com.instagram.android");

                try {
                    startActivity(face);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/sanaa.adel.9400/")));
                }

            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://github.com/ThanaaAdel");
                Intent face = new Intent(Intent.ACTION_VIEW, uri);

                face.setPackage("https://github.com/ThanaaAdel");

                try {
                    startActivity(face);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://github.com/ThanaaAdel")));
                }

            }
        });

        ImageView imageView3 = (ImageView) findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.facebook.com/sanaa.adel.9400/");
                Intent face = new Intent(Intent.ACTION_VIEW, uri);

                face.setPackage("https://www.facebook.com/sanaa.adel.9400/");

                try {
                    startActivity(face);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.facebook.com/sanaa.adel.9400/")));
                }

            }
        });
        ImageView imageView4 = (ImageView) findViewById(R.id.imageView3);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.linkedin.com/in/thana-adel-463b97223?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BN8pKE32jSNSVCbyJhkgu1A%3D%3D");
                Intent face = new Intent(Intent.ACTION_VIEW, uri);

                face.setPackage("https://www.linkedin.com/in/thana-adel-463b97223?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BN8pKE32jSNSVCbyJhkgu1A%3D%3D");

                try {
                    startActivity(face);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.linkedin.com/in/thana-adel-463b97223?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BN8pKE32jSNSVCbyJhkgu1A%3D%3D")));
                }

            }
        });
    }
}
