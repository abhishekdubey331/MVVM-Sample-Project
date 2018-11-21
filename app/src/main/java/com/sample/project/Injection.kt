package com.sample.project

import android.content.Context
import com.sample.project.db.ShoppingListDao
import com.sample.project.db.ShoppingListDatabase
import com.sample.project.ui.ViewModelFactory

object Injection {

        fun provideUserDataSource(context: Context): ShoppingListDao {
            val database = ShoppingListDatabase.getInstance(context)
            return database.shoppingListDao()
        }

        fun provideViewModelFactory(context: Context): ViewModelFactory {
            val dataSource = provideUserDataSource(context)
            return ViewModelFactory(dataSource)
        }
}