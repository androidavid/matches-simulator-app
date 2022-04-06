package me.dio.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import me.dio.simulator.databinding.ActivityMainBinding;
import me.dio.simulator.domain.Team;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Teste para mostrar que deu certo o encapsulamento da classe Team
        //Team time = new Team("Teste", 5, "");

        setupMatchesList();
        setupMatchesRefresh();
        setupFloatingActionButton();
    }

    private void setupFloatingActionButton() {
        //TODO Evento de click e simulação
    }

    private void setupMatchesRefresh() {
        //TODO Atualizar as partidas pelo Swipe
    }

    private void setupMatchesList() {
        //TODO Listar partidas consumindo nossa api.
    }
}
