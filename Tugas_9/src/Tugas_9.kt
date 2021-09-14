class Outer {
    class data_mahasiswa {
        val pembukaan = "Berikut ini adalah data Mahasiswa yang mengikuti Program MBKM :"
        val nama_mahasiswa = "Nama : Ricky Andi Kurniawan"
        val semester_mahasiswa = "Semester : 5"
        fun Jurusan_Mahasiswa() = "Jurusan : Sistem Informasi"
        fun program_MBKM_Mahasiswa() = "Mitra MBKM yang di ikuti Mahasiswa : GITS.ID"
    }
}

fun main(args: Array<String>) {
    println(Outer.data_mahasiswa().pembukaan)
    println()
    println(Outer.data_mahasiswa().nama_mahasiswa)
    println(Outer.data_mahasiswa().semester_mahasiswa)
    val data_mahasiswa = Outer.data_mahasiswa()
    println(data_mahasiswa.Jurusan_Mahasiswa())
    println(Outer.data_mahasiswa().program_MBKM_Mahasiswa())
}