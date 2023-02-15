plugins {
    id("org.jetbrains.kotlin.android")
}
version = 2
dependencies {
    implementation("androidx.core:core-ktx:+")
}

cloudstream {
    description = ""
    authors = listOf( "ImZaw" )

	language = "ar"
	
    status = 1

    tvTypes = listOf( "Anime" )

    iconUrl = "https://www.google.com/s2/favicons?domain=animeiat.tv&sz=%size%"
}