class Solution {
    fun repeatedCharacter(s: String): Char {
        val seen = mutableSetOf<Char>()
        
        for (char in s) {
            if (char in seen) {
                return char
            }
            seen.add(char)
        }
        
        throw IllegalArgumentException("No letter appears twice")
    }
}

fun main() {
    val solution = Solution()

    val s1 = "abccbaacz"
    val output1 = solution.repeatedCharacter(s1)
    println("Input: \"$s1\"")
    println("Output: \"$output1\"") 

    val s2 = "abcdd"
    val output2 = solution.repeatedCharacter(s2)
    println("Input: \"$s2\"")
    println("Output: \"$output2\"") 
}
