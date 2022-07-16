package bookstore.example.thebookstore;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    MyAdapter  adapter;
    String mTitle[] = {
            "Learn German",
             "How To Draw",
            "Short Mystrery Stories",
             "Sleepless Nights",
            "The e_book Collection",
             "Home Deus",
            "Short Stories For Students",
            "HORROR",
             " Classic Horror Stories",
             "The Locked Room"
    };
    String mDescription[] = {
            "Student entreffen Complete Short Story Collection for Beginners.",
            "How to Draw Collection 1-12",
            "A Collection of Short Mystery Stories",
            "Thriller short story collection about Demons, Undead, Paranormal.",
            "A Brief History of Humankind ",
            " A Brief History of Tomorrow.",
            "Presenting Analysis, Context and Criticism on Commonly Studied",
             "25 Classic and Modern Horror Stories",
             "The Classic Horror Stories.",
             " The Locked Room and Other Horror Stories – Penguin Readers"
    };
    int images[] = {
            R.drawable.learngerman,
            R.drawable.howtodraw,
            R.drawable.shortmysterystories,
            R.drawable.theebookcollection,
            R.drawable.sleepingnights,
            R.drawable.homedeus,
            R.drawable.shortstoryforstudents,
            R.drawable.horror,
            R.drawable.classichorrorstories,
            R.drawable.thelockedroom
    };    // so our images and other things are set in array

    // now paste some images in drawable
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        listView = findViewById(R.id.listView);
        // now create an adapter class

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);



        // now set item click on list view
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Uri uri = Uri.parse("https://www.pdfdrive.com/learn-german-with-stories-studententreffen-complete-short-story-collection-for-beginners-collection-of-25-modern-and-classic-short-stories-e184690766.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/learn-german-with-stories-studententreffen-complete-short-story-collection-for-beginners-collection-of-25-modern-and-classic-short-stories-e184690766.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/learn-german-with-stories-studententreffen-complete-short-story-collection-for-beginners-collection-of-25-modern-and-classic-short-stories-e184690766.html")));
                    }

                }
                    if (position == 1) {
                        Uri uri = Uri.parse("https://www.pdfdrive.com/how-to-draw-collection-1-12-e18737686.html");
                        Intent face = new Intent(Intent.ACTION_VIEW, uri);
                        face.setPackage("https://www.pdfdrive.com/how-to-draw-collection-1-12-e18737686.html");
                        try {
                            startActivity(face);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://www.pdfdrive.com/how-to-draw-collection-1-12-e18737686.html")));
                        }

                              }
                if (position == 2) {
                    Uri uri = Uri.parse("https://www.pdfdrive.com/how-to-draw-collection-1-12-e18737686.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/how-to-draw-collection-1-12-e18737686.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/how-to-draw-collection-1-12-e18737686.html")));
                    }

                }
                if (position == 3) {
                    Uri uri = Uri.parse("https://www.pdfdrive.com/horror-stories-51-sleepless-nights-thriller-short-story-collection-about-demons-undead-paranormal-psychopaths-ghosts-aliens-and-mystery-e158458770.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/horror-stories-51-sleepless-nights-thriller-short-story-collection-about-demons-undead-paranormal-psychopaths-ghosts-aliens-and-mystery-e158458770.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/horror-stories-51-sleepless-nights-thriller-short-story-collection-about-demons-undead-paranormal-psychopaths-ghosts-aliens-and-mystery-e158458770.html")));
                    }

                }
                if (position == 4) {
                    Uri uri = Uri.parse("https://www.pdfdrive.com/sapiens-and-homo-deus-the-e-book-collection-a-brief-history-of-humankind-and-a-brief-history-of-tomorrow-e195057423.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/sapiens-and-homo-deus-the-e-book-collection-a-brief-history-of-humankind-and-a-brief-history-of-tomorrow-e195057423.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/sapiens-and-homo-deus-the-e-book-collection-a-brief-history-of-humankind-and-a-brief-history-of-tomorrow-e195057423.html")));
                    }

                }
                if (position == 5) {
                    Uri uri = Uri.parse("https://www.pdfdrive.com/homo-deus-a-brief-history-of-tomorrow-e175561415.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/homo-deus-a-brief-history-of-tomorrow-e175561415.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/homo-deus-a-brief-history-of-tomorrow-e175561415.html")));
                    }

                }
                if (position == 6) {
                    Uri uri = Uri.parse("https://www.pdfdrive.com/short-stories-for-students-presenting-analysis-context-and-criticism-on-commonly-studied-short-stories-short-stories-for-students-vol-12-e161031403.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/short-stories-for-students-presenting-analysis-context-and-criticism-on-commonly-studied-short-stories-short-stories-for-students-vol-12-e161031403.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/short-stories-for-students-presenting-analysis-context-and-criticism-on-commonly-studied-short-stories-short-stories-for-students-vol-12-e161031403.html")));
                    }

                }

                    if (position == 7) {
                        Uri uri = Uri.parse("https://www.pdfdrive.com/the-horror-megapack-25-classic-and-modern-horror-stories-e199858597.html");
                        Intent face = new Intent(Intent.ACTION_VIEW, uri);
                        face.setPackage("https://www.pdfdrive.com/the-horror-megapack-25-classic-and-modern-horror-stories-e199858597.html");
                        try {
                            startActivity(face);
                        } catch (ActivityNotFoundException e) {
                            startActivity(new Intent(Intent.ACTION_VIEW,
                                    Uri.parse("https://www.pdfdrive.com/the-horror-megapack-25-classic-and-modern-horror-stories-e199858597.html")));
                        }

                    }
                if (position == 8) {
                    Uri uri = Uri.parse("https://www.pdfdrive.com/the-classic-horror-stories-h-p-lovecraftpdf-e34444144.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/the-classic-horror-stories-h-p-lovecraftpdf-e34444144.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/the-classic-horror-stories-h-p-lovecraftpdf-e34444144.html")));
                    }

                }
                if (position == 9) {
                    Toast.makeText(MainActivity.this, "Youtube Description", Toast.LENGTH_SHORT).show();
                    Uri uri = Uri.parse("https://www.pdfdrive.com/the-locked-room-and-other-horror-stories-penguin-readers-e50213069.html");
                    Intent face = new Intent(Intent.ACTION_VIEW, uri);
                    face.setPackage("https://www.pdfdrive.com/the-locked-room-and-other-horror-stories-penguin-readers-e50213069.html");
                    try {
                        startActivity(face);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://www.pdfdrive.com/the-locked-room-and-other-horror-stories-penguin-readers-e50213069.html")));
                    }

                }
                }


        });
        // so item click is done now check list view
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.custome, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.custome, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        MenuItem menuItem=menu.findItem(R.id.search);
        SearchView searchView=(SearchView)menuItem.getActionView();
        searchView.setQueryHint("Search");
         searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
             @Override
             public boolean onQueryTextSubmit(String s) {
                 return false;
             }

             @Override
             public boolean onQueryTextChange(String newtext) {
               //  adapter.getFilter().filter(newtext);

                 return false;
             }
         });
        return super.onCreateOptionsMenu(menu);




    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.profile)
        {
            Intent profile = new Intent(MainActivity.this, bookstore.example.thebookstore.profile.class);
            startActivity(profile);
            return false;
        }else if(id==R.id.connectus){
            Intent Connect_Us = new Intent(MainActivity.this, bookstore.example.thebookstore.Connect_Us.class);
            startActivity(Connect_Us);
        }else if(id==R.id.SignOut) {
            Intent Sign_out = new Intent(MainActivity.this, bookstore.example.thebookstore.SplashScreen.class);
            startActivity(Sign_out);
        }
        return super.onOptionsItemSelected(item);
    }
}


