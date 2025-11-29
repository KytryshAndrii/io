public class KontrolerStudenta implements IKontrolerStudenta {
	private IModel _model;

	public KontrolerStudenta(IModel Model) {
		this._model = Model;
	}

	public void rejestracjaDoGrupy() {
		throw new UnsupportedOperationException("rejestracjaDoGrupy() w KontrolerStudenta niezaimplementowana");
	}

	public void edycjaRejestracjiStudenta() {
		throw new UnsupportedOperationException("edycjaRejestracjiStudenta() w KontrolerStudenta niezaimplementowana");
	}
}