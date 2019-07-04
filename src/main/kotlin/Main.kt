fun main(){
    var csv = CVSFileReader()
    var mapper = Mapper()
    mapper.mapLines(csv.readFileByLine("C:\\Users\\kacperb\\Desktop\\Zeszyt1.csv"))

}