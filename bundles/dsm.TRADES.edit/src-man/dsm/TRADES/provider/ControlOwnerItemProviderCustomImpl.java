package dsm.TRADES.provider;

import org.eclipse.emf.common.notify.AdapterFactory;

public class ControlOwnerItemProviderCustomImpl extends ControlOwnerItemProvider {

	public ControlOwnerItemProviderCustomImpl(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		return "Controls";
	}

}
