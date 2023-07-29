package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    public fun loadAffirmations(): List<Affirmation> {

        val listAffirmations = mutableListOf<Affirmation>()
        listAffirmations.add(Affirmation(R.string.affirmation1, R.drawable.image1))
        listAffirmations.add(Affirmation(R.string.affirmation2, R.drawable.image2))
        listAffirmations.add(Affirmation(R.string.affirmation3, R.drawable.image3))
        listAffirmations.add(Affirmation(R.string.affirmation4, R.drawable.image4))
        listAffirmations.add(Affirmation(R.string.affirmation5, R.drawable.image5))
        listAffirmations.add(Affirmation(R.string.affirmation6, R.drawable.image6))
        listAffirmations.add(Affirmation(R.string.affirmation7, R.drawable.image7))
        listAffirmations.add(Affirmation(R.string.affirmation8, R.drawable.image8))
        listAffirmations.add(Affirmation(R.string.affirmation9, R.drawable.image9))
        listAffirmations.add(Affirmation(R.string.affirmation10, R.drawable.image10))


        return listAffirmations
    }
}