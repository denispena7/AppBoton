package es.studium.eventos;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button btnBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
      //  EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
   /*     ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;*/

        // Asociamos el boton de la vista (button) con el boton de JAVA (btnBoton)
        btnBoton = findViewById(R.id.button);

        // Le añadimos el listener correspondiente
        btnBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        Toast.makeText(this, "Me pulsaste", Toast.LENGTH_SHORT).show();
    }
}