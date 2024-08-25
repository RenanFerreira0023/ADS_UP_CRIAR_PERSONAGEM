package org.appsskilldeveloper.personagem.Racas

class RacaMeioOrc : Raca {
    val NOME_RACA = "Meio-orc"

    override fun descobrir_bonus_por_raca(nomeAtributo: String): Int {
        if (nomeAtributo.equals("forca", ignoreCase = true))
            return +2
        else
            if (nomeAtributo.equals("constituicao", ignoreCase = true))
                return +1
            else
                return 0
    }

    override fun nome_raca(): String {
        return this.NOME_RACA
    }
}