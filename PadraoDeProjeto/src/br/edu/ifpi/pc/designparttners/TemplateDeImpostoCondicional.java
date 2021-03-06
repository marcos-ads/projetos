package br.edu.ifpi.pc.designparttners;

public abstract class TemplateDeImpostoCondicional extends Imposto {
	public TemplateDeImpostoCondicional() {
		super();
	}
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	public double calcula (Orcamento orcamento){
		if (deveUsarMaximaTaxacao(orcamento)){
			return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		}
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao(Orcamento orcamento);
	public abstract double minimaTaxacao(Orcamento orcamento);
}
