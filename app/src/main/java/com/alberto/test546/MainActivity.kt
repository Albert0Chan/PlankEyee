package com.alberto.test546

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alberto.test546.screens.CheckSites
import com.alberto.test546.screens.FormLogin
import com.alberto.test546.screens.NaoVerificado
import com.alberto.test546.screens.Verificado


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "FormLogin"
            ){
                composable("FormLogin"){
                    FormLogin(navController = navController)
                }
                composable("CheckSites"){
                    CheckSites(navController = navController)
                }
                composable("Verificado"){
                    Verificado(navController = navController)
                }
                composable("NaoVerificado"){
                    NaoVerificado(navController = navController)
                }
            }
        }
    }
}
