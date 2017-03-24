package com.example.root.pruebas;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.PopupMenu;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        /**
         * interactuar con menu abajo
         **/
        /*BottomNavigationView btnv=(BottomNavigationView) findViewById(R.id.navegacion);
        btnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.mperfil:
                            Toast.makeText(menu.this,"Navigation perfil",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.mconfig:
                            Toast.makeText(menu.this,"Navigation Configuracion",Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.mcerrar:
                            finish();
                            break;
                    }
                    return true;
            }
        });*/


        /**
         *menu flotante
         */
        /*final Button btnmf=(Button)findViewById(R.id.btnmf);
        registerForContextMenu(btnmf);
        btnmf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContextMenu(btnmf);
            }
        });*/


        /**
         * Menu PopupMenu
         */
        /*final Button btnmp=(Button)findViewById(R.id.btnPopup);
        btnmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu mpop=new PopupMenu(menu.this,btnmp);
                mpop.getMenuInflater().inflate(R.menu.mis_menus,mpop.getMenu());

                mpop.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.mperfil:
                                Toast.makeText(menu.this,"MPopup Perfil",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.mconfig:
                                Toast.makeText(menu.this,"MPopup Configuracion",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.mcerrar:
                                finish();
                                return true;
                            default:
                                return true;
                        }
                    }
                });
                mpop.show();
            }
        });*/


    }


    /**
     * menu flotante
     * @param menu
     * @param v
     * @param menuInfo
     */
    /*@Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        //menu.setHeaderTitle("Opciones");
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.mis_menus,menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        AdapterView.AdapterContextMenuInfo info=(AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        switch (item.getItemId()){
            case R.id.mperfil:
                Toast.makeText(this,"MF Perfil",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mconfig:
                Toast.makeText(this,"MF Configuracion",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mcerrar:
                finish();
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }*/


    /**
     * menu arriba - derecha
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mis_menus, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.mperfil:
                Toast.makeText(this,"perfil",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mconfig:
                Toast.makeText(this,"Configuracion",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mcerrar:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
