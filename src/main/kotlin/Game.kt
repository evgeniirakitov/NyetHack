fun main() {

    val name = "Madrigal"
    var healthPoints = 100
    healthPoints -= 15
    val isBlessed = true
    val isImmortal = false

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    val levelStupefaction: Int = castFireball()
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    printPlayerStatus("NONE", isBlessed, "Madrigal", healthStatus, levelStupefaction)

    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Keepers of the Mines"
        "ord" -> "Free People of the Rolling Hills"
        "human" -> "Free People of the Rolling Hills"
        else -> "Free People of the Rolling Hills"
    }
}

private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String,
    levelStupefaction: Int
) {
    println(
        "(Aura: $auraColor)\n" +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})\n" +
                "(LevelStupefaction: ${setStupefaction(levelStupefaction)})"
    )
    println("$name $healthStatus")
}

private fun setStupefaction(levelStupefaction: Int) = when(levelStupefaction) {
    in 1..10 -> "Tipsy"
    in 11..20 -> "Sloshed"
    in 21..30 -> "Soused"
    in 31..40 -> "Stewed"
    else -> "t0aSt3d"
}

private fun auraColor(
    isBlessed: Boolean,
    healthPoints: Int,
    isImmortal: Boolean
) = if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) = when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

private fun castFireball(numFireballs: Int = 2) = when(numFireballs) {
        1 -> {
            println("A glass of Fireball springs into existence. (x$numFireballs)")
            10
        }
        2 -> {
            println("A glass of Fireball springs into existence. (x$numFireballs)")
            20

        }
        3 -> {
            println("A glass of Fireball springs into existence. (x$numFireballs)")
            30

        }
        4 -> {
            println("A glass of Fireball springs into existence. (x$numFireballs)")
            40

        }
        5 -> {
            println("A glass of Fireball springs into existence. (x$numFireballs)")
            50

        }
        else -> {
            println("I'm not drink elixir")
            0
        }
    }
