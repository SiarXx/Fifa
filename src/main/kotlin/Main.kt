fun main(){
    val csv = CVSFileReader()
    val mapper = Mapper()
    val lines = csv.readFileByLine("C:\\Users\\kacperb\\Desktop\\Zeszyt1.csv")
    val players = ArrayList(lines.map { mapper.map(it) })
    println(players.size)

}