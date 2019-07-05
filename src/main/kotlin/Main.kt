fun main(){
    var csv = CVSFileReader()
    var mapper = Mapper()
    val map = mapper.mapLines(csv.readFileByLine("C:\\Users\\kacperb\\Desktop\\Zeszyt1.csv"))
    println(map.size)

}