package com.jamiltondamasceno.projetolistatarefas.database

import com.ibrahim.applistatarefas.model.Tarefa

interface ITarefaDAO {
    fun salvar( tarefa: Tarefa): Boolean
    fun atualizar( tarefa: Tarefa ): Boolean
    fun deletar( id: Int ): Boolean
    fun listar(): List<Tarefa>
}