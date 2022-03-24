package com.aldikitta.a7minuteworkoutapp

object Constants {
    fun defaultExerciseList(): ArrayList<ExerciseModel> {
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJacks = ExerciseModel(
            id = 1,
            name = "Jumping Jacks",
            R.drawable.ic_jumping_jacks,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(jumpingJacks)

        val wallSit = ExerciseModel(
            id = 2,
            name = "Wallsit",
            R.drawable.ic_wall_sit,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(wallSit)

        val pushUp = ExerciseModel(
            id = 3,
            name = "Push Up",
            R.drawable.ic_push_up,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(pushUp)

        val abdominalCrunch = ExerciseModel(
            id = 4,
            name = "Abdominal Crunch",
            R.drawable.ic_abdominal_crunch,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(abdominalCrunch)

        val stepUpOnChair = ExerciseModel(
            id = 5,
            name = "Step-Up onto Chair",
            R.drawable.ic_step_up_onto_chair,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(stepUpOnChair)

        val squat = ExerciseModel(
            id = 6,
            name = "Squat",
            R.drawable.ic_squat,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(squat)

        val tricepDipOnChair = ExerciseModel(
            id = 7,
            name = "Tricep Dip On Chair",
            R.drawable.ic_triceps_dip_on_chair,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(tricepDipOnChair)

        val plank = ExerciseModel(
            id = 8,
            name = "Plank",
            R.drawable.ic_plank,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(plank)

        val highKneesRunningInPlace = ExerciseModel(
            id = 9,
            name = "High Knees Running In Place",
            R.drawable.ic_high_knees_running_in_place,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(highKneesRunningInPlace)

        val lungs = ExerciseModel(
            id = 10,
            name = "Lungs",
            R.drawable.ic_lunge,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(lungs)

        val pushUpAndRotation = ExerciseModel(
            id = 11,
            name = "Push Up and Rotation",
            R.drawable.ic_push_up_and_rotation,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(pushUpAndRotation)

        val sidePlank = ExerciseModel(
            id = 12,
            name = "Side Plank",
            R.drawable.ic_side_plank,
            isCompleted = false,
            isSelected = false
        )
        exerciseList.add(sidePlank)




        return exerciseList
    }

}