package com.example.woof.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import com.example.woof.R

val InstrumentSerif = FontFamily(
    Font(R.font.instrumentserif_regular)
)

val Montserrat = FontFamily(

    Font(R.font.inter_regular),

)

// Default Material 3 typography values
val baseline = Typography()

// Assign InstrumentSerif as display font family and Montserrat as body font family
val Typography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = InstrumentSerif),
    displayMedium = baseline.displayMedium.copy(fontFamily = InstrumentSerif),
    displaySmall = baseline.displaySmall.copy(fontFamily = InstrumentSerif),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = InstrumentSerif),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = InstrumentSerif),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = InstrumentSerif),
    titleLarge = baseline.titleLarge.copy(fontFamily = InstrumentSerif),
    titleMedium = baseline.titleMedium.copy(fontFamily = InstrumentSerif),
    titleSmall = baseline.titleSmall.copy(fontFamily = InstrumentSerif),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = Montserrat),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = Montserrat),
    bodySmall = baseline.bodySmall.copy(fontFamily = Montserrat),
    labelLarge = baseline.labelLarge.copy(fontFamily = Montserrat),
    labelMedium = baseline.labelMedium.copy(fontFamily = Montserrat),
    labelSmall = baseline.labelSmall.copy(fontFamily = Montserrat),
)