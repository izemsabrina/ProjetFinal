package fr.doranco.projetfinal;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import fr.doranco.projetfinal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
  private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolBar);
        initNavigationComponents();

    }

    private void initNavigationComponents() {
        //configuration de connection de navigation avec le navigation view

        NavHostFragment navHostFragment=
                (NavHostFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();

        AppBarConfiguration appBarConfiguration =
        new AppBarConfiguration.Builder(R.id.homeFragment, R.id.paysListFragment)
                .setOpenableLayout(binding.drawerLayout)
                                .build();

        NavigationUI.setupWithNavController (
          binding.navView,
                navController
               // appBarConfiguration
        );
        NavigationUI.setupActionBarWithNavController(
               this,navController,appBarConfiguration
        );
        //Ajouter le toggele pour ouvrir et fermer la navigation
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this,
                binding.drawerLayout,
                binding.toolBar,
                R.string.open_drawer,
                R.string.close_drawer
        );
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }
}