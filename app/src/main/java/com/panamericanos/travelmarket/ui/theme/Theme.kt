package com.panamericanos.travelmarket.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = Primary,
    onPrimary = OnPrimaryLight,
    primaryContainer = Primary.copy(alpha = 0.1f),
    onPrimaryContainer = Primary,

    secondary = Secondary,
    onSecondary = OnSecondaryLight,
    secondaryContainer = Secondary.copy(alpha = 0.1f),
    onSecondaryContainer = Secondary,

    tertiary = Info,
    onTertiary = OnSecondaryLight,

    background = BackgroundLight,
    onBackground = OnBackgroundLight,

    surface = SurfaceLight,
    onSurface = OnSurfaceLight,
    surfaceVariant = BackgroundLight,
    onSurfaceVariant = OnSurfaceLight.copy(alpha = 0.6f),

    error = Error,
    onError = OnSecondaryLight
)

private val DarkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = OnPrimaryDark,
    primaryContainer = Primary.copy(alpha = 0.2f),
    onPrimaryContainer = Primary,

    secondary = Secondary,
    onSecondary = OnSecondaryDark,
    secondaryContainer = Secondary.copy(alpha = 0.2f),
    onSecondaryContainer = Secondary,

    tertiary = Info,
    onTertiary = OnSecondaryDark,

    background = BackgroundDark,
    onBackground = OnBackgroundDark,

    surface = SurfaceDark,
    onSurface = OnSurfaceDark,
    surfaceVariant = SurfaceDark.copy(alpha = 0.8f),
    onSurfaceVariant = OnSurfaceDark.copy(alpha = 0.6f),

    error = Error,
    onError = OnSecondaryDark
)

@Composable
fun TravelMarketTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}