package com.example.recetas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private NotasAdapter adapter;
    private ArrayList<Nota> notas;
    private ListView lista_notas;
    private int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notas = new ArrayList<>();
        notas.add(new Nota("Ceviche Peruano", "Ingredientes: Pescado, Cebolla, Maiz, Limón, Perejil, Sal"));
        notas.add(new Nota("Omelette de Champiñones", "Ingredientes: Huevos, Champiñones, Leche, Sal, Especias, Aceite"));
        notas.add(new Nota("Filete de Pollo Relleno", "Ingredientes: Filete de Pollo, Condimentos, Caldo de Pollo, Tocino, Jamon, Carne"));
        notas.add(new Nota("Filete de Pescado Marinado", "Ingredientes: Pesacdo, Limón, Tomates, Chile, Cebolla, Sal, Especias"));
        notas.add(new Nota("Berenjenas Rellenas", "Ingredientes: Berenjenas, Pataste, Papa, Queso, Jamon, Tocino"));
        notas.add(new Nota("Chiles Rellenos", "Ingredientes: Champiñones, Chiles, Quesillo, Condimentos"));
        notas.add(new Nota("Jamon Glaseado", "Ingredientes: Jamon de Pollo, Vino Tinto, Azucar, Sal, Caldo de Pollo, Crema de Leche"));
        notas.add(new Nota("Sandwich de Calabacines", "Ingredientes: Pan Integral, Jamon, Calabacines, Queso Amarillo, Tomates, Cebolla"));
        notas.add(new Nota("Quiché Lorraine", "Ingredientes: Papas, Leche, Huevos, Vegetales"));
        notas.add(new Nota("Pizza Margarita", "Ingredientes: Base para Pizza, Salsa Dulce, Pasta de Tomate, Peperoni, Jamon, Queso, Quesillo, Aceitunas"));
        notas.add(new Nota("Espagueti Cuatro Quesos", "Ingredientes: Pasta, Queso Seco, Queso Cheddar, Queso Mozarella, Queso Parmesano"));
        notas.add(new Nota("Tacos a lo Michoacan", "Ingredientes: Tortilla, Carne Desminuzada, Condimentos, Lechuga, Tomate"));
        notas.add(new Nota("Pescado Huachinango", "Ingredientes: Pescado Seco, Condimentos, Huachinangos, Frutos Secos"));
        notas.add(new Nota("Caldo de Mariscos Rojos", "Ingredientes: Caldo de Pollo, Vino Rojo, Camarones, Caracol, Pescado"));
        notas.add(new Nota("Panqué de Limon", "Ingredientes: Mezcla para Pastel, Limones, Crema de Leche, Azucar, Grenetina"));
        notas.add(new Nota("Pan de Nata", "Ingredientes: Crema de Leche, Lecha Condensada, Nata Liquida, Masa para Pan"));
        notas.add(new Nota("Pie de Limas", "Ingredientes:"));
        notas.add(new Nota("Chessecake New York", "Ingredientes:"));
        notas.add(new Nota("Tartaleta de Frutos Rojos", "Ingredientes:"));
        notas.add(new Nota("Pie de Queso y Mango", "Ingredientes:"));
        notas.add(new Nota("Galletas de Avena y Pasas", "Ingredientes:"));
        notas.add(new Nota("Budin", "Ingredientes:"));
        notas.add(new Nota("Tres Leches", "Ingredientes:"));
        notas.add(new Nota("Sorbete de Fresa", "Ingredientes:"));
        notas.add(new Nota("Granita de Sandia", "Ingredientes:"));
        notas.add(new Nota("Fusión de Limonada Verde", "Ingredientes:"));
        notas.add(new Nota("Horchata", "Ingredientes:"));
        notas.add(new Nota("Tamarindo", "Ingredientes:"));


        adapter = new NotasAdapter();

        lista_notas = (ListView) findViewById(R.id.lista_notas);
        lista_notas.setAdapter(adapter);

        }


    private class NotasAdapter extends ArrayAdapter<Nota>{
         NotasAdapter() {
            super(MainActivity.this,R.layout.item_lista_notas, notas);
        }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View result = convertView;
                if (result == null){
                    LayoutInflater inflater = getLayoutInflater();
                    result = inflater.inflate(R.layout.item_lista_notas, parent, false);
                }
        Nota nota = getItem(position);
        TextView titulo = (TextView) result.findViewById(R.id.titulo);
        titulo.setText(nota.getTitulo());
        TextView resumen = (TextView) result.findViewById(R.id.resumen);
        resumen.setText(nota.getTexto());
        return result;
        }
    }
}
