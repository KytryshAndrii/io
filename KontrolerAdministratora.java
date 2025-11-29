public class KontrolerAdministratora implements IKontrolerAdministratora {
	private IModel _model;

	public KontrolerAdministratora(IModel model) {
		this._model = model;
	}

	public void zarzadzanieGrupeZajeciowa() {
		throw new UnsupportedOperationException(" zarzadzanieGrupeZajeciowa() w KontrolerStudenta niezaimplementowana");
	}

	public void rejestracjaDoGrupy() {
		throw new UnsupportedOperationException(" rejestracjaDoGrupy() w KontrolerStudenta niezaimplementowana");
	}

	public void edycjaRejestracjiStudenta() {
		throw new UnsupportedOperationException("edycjaRejestracjiStudenta() w KontrolerStudenta niezaimplementowana");
	}

}