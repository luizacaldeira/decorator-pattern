import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.*;

class PlanoTest {

    @Test
    void deveRetornarValorPlano() {
        Plano plano = new PlanoFibra(100.0f);
        assertEquals(100.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComSegurancaDigital() {
        Plano plano = new SegurancaDigital(new PlanoFibra(100.0f));
        assertEquals(115.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComTelefoneFixo() {
        Plano plano = new TelefoneFixo(new PlanoFibra(100.0f));
        assertEquals(110.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComBackupNuvem() {
        Plano plano = new BackupNuvem(new PlanoFibra(100.0f));
        assertEquals(105.0f, plano.getValor());
    }

    @Test
    void deveRetornarValorPlanoComSegurancaMaisTelefone() {
        Plano plano = new SegurancaDigital(new TelefoneFixo(new PlanoFibra(100.0f)));
        assertEquals(126.5f, plano.getValor(), 0.01f);
    }

    @Test
    void deveRetornarDescricaoPlano() {
        Plano plano = new PlanoFibra();
        assertEquals("Fibra", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComSegurancaDigital() {
        Plano plano = new SegurancaDigital(new PlanoFibra());
        assertEquals("Fibra/Segurança Digital", plano.getDescricao());
    }

    @Test
    void deveRetornarDescricaoPlanoComTelefoneMaisBackup() {
        Plano plano = new TelefoneFixo(new BackupNuvem(new PlanoFibra()));
        assertEquals("Fibra/Backup em Nuvem/Telefone Fixo", plano.getDescricao());
    }

}