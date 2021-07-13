class Main {
    companion object{
        @JvmStatic fun main(vararg  args:String){
            var empty= emptyArray<String>()
            empty= arrayOf("perro ","caballo ","misama ","facha ")
            for(s in empty){
                print(s)
            }
            for(i in  5..9){
                print(i)
            }
            repeat(10){i->
                print("estupido")

            }

        }
    }
}