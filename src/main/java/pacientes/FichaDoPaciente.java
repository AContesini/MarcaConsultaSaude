package pacientes;

import medicos.Medico;

import java.time.LocalDate;
    public class FichaDoPaciente {
        private Long idFicha;
        private String motivoConsulta;
        private String sintomas;
        private String observacoes;
        private LocalDate dataAtendimento;
        private Medico medicoResponsavel;
        private Pacientes paciente; // ligação de volta ao paciente


        private FichaDoPaciente(){

        }

        public Long getIdFicha() {
            return idFicha;
        }

        public void setIdFicha(Long idFicha) {
            this.idFicha = idFicha;
        }

        public String getMotivoConsulta() {
            return motivoConsulta;
        }

        public void setMotivoConsulta(String motivoConsulta) {
            this.motivoConsulta = motivoConsulta;
        }

        public String getSintomas() {
            return sintomas;
        }

        public void setSintomas(String sintomas) {
            this.sintomas = sintomas;
        }

        public String getObservacoes() {
            return observacoes;
        }

        public void setObservacoes(String observacoes) {
            this.observacoes = observacoes;
        }

        public LocalDate getDataAtendimento() {
            return dataAtendimento;
        }

        public void setDataAtendimento(LocalDate dataAtendimento) {
            this.dataAtendimento = dataAtendimento;
        }

        public Medico getMedicoResponsavel() {
            return medicoResponsavel;
        }

        public void setMedicoResponsavel(Medico medicoResponsavel) {
            this.medicoResponsavel = medicoResponsavel;
        }

        public Pacientes getPaciente() {
            return paciente;
        }

        public void setPaciente(Pacientes paciente) {
            this.paciente = paciente;
        }

        @Override
        public String toString() {
            return "FichaDoPaciente:" +
                    "idFicha=" + idFicha +
                    ", motivoConsulta='" + motivoConsulta + '\'' +
                    ", sintomas='" + sintomas + '\'' +
                    ", observacoes='" + observacoes + '\'' +
                    ", dataAtendimento=" + dataAtendimento +
                    ", medicoResponsavel=" + medicoResponsavel +
                    ", paciente=" + paciente;
        }
    }


