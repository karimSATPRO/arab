plugins {
    id("org.jetbrains.kotlin.android")
}
version = 1
dependencies {
    implementation("androidx.core:core-ktx:+")
}

cloudstream {
    description = "This pack contains Anime4up and Witanime"
    authors = listOf( "ImZaw" )

	language = "ar"
	
    status = 1

    tvTypes = listOf( "Anime", "AnimeMovie", "Others" )

    iconUrl = "https://www.google.com/s2/favicons?domain=anime4up.tv&sz=%size%"
}