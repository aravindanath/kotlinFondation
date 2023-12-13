fun main() {
    val password = "MySecurePassword123"

    val strength = checkPasswordStrength(password)

    when (strength) {
        PasswordStrength.WEAK -> println("Weak password")
        PasswordStrength.MEDIUM -> println("Medium password")
        PasswordStrength.STRONG -> println("Strong password")
        PasswordStrength.VERY_STRONG -> println("Very strong password")
    }
}

enum class PasswordStrength {
    WEAK, MEDIUM, STRONG, VERY_STRONG
}

fun checkPasswordStrength(password: String): PasswordStrength {
    val minLength = 8
    val hasUppercase = password.any { it.isUpperCase() }
    val hasLowercase = password.any { it.isLowerCase() }
    val hasDigit = password.any { it.isDigit() }
    val hasSpecialChar = password.any { !it.isLetterOrDigit() }

    return when {
        password.length < minLength -> PasswordStrength.WEAK
        !hasUppercase || !hasLowercase -> PasswordStrength.MEDIUM
        !hasDigit -> PasswordStrength.STRONG
        hasSpecialChar -> PasswordStrength.VERY_STRONG
        else -> PasswordStrength.STRONG
    }
}

