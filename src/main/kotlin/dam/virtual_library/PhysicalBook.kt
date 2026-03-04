package dam.virtual_library

class PhysicalBook (private var title: String, private var author: String, private var publicationYear: Int, private var availableCopies: Int, private var weight: Int, private var hasHardcover: Boolean= true):
    Book(title, author, publicationYear, availableCopies){

    override fun toString(): String{
        val basicInfo= super.toString()
        return "$basicInfo \n Weight: $weight g Hard cover: ${if (hasHardcover) "Yes" else "No"}"
    }

    override fun getStorageInfo() {
        println("Physical book: $weight g / Hard cover: ${if (hasHardcover) "Yes" else "No"}")
    }

    fun getWeight (): Int{
        return weight
    }

    fun getHasHardcover(): Boolean{
        return hasHardcover
    }

    fun setWeight(weight: Int) {
        this.weight = weight
    }

    fun setHasHardcover(hasHardcover: Boolean) {
        this.hasHardcover = hasHardcover
    }

}