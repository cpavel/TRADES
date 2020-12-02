/**
 */
package dsm.TRADES.provider;

import dsm.TRADES.Analysis;
import dsm.TRADES.TRADESFactory;
import dsm.TRADES.TRADESPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link dsm.TRADES.Analysis} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysisItemProvider extends ComponentOwerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NamedElement_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NamedElement_name_feature",
								"_UI_NamedElement_type"),
						TRADESPackage.Literals.NAMED_ELEMENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(TRADESPackage.Literals.DATA_OWNER__DATA);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__THREAT);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__CONTROL);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__THREATALLOCATION);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__THREATMITIGATION);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__AFFECTRELATION);
			childrenFeatures.add(TRADESPackage.Literals.ANALYSIS__SCORESYSTEM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Analysis.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Analysis"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Analysis) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Analysis_type")
				: getString("_UI_Analysis_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Analysis.class)) {
		case TRADESPackage.ANALYSIS__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case TRADESPackage.ANALYSIS__DATA:
		case TRADESPackage.ANALYSIS__THREAT:
		case TRADESPackage.ANALYSIS__CONTROL:
		case TRADESPackage.ANALYSIS__THREATALLOCATION:
		case TRADESPackage.ANALYSIS__THREATMITIGATION:
		case TRADESPackage.ANALYSIS__AFFECTRELATION:
		case TRADESPackage.ANALYSIS__SCORESYSTEM:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.DATA_OWNER__DATA, TRADESFactory.eINSTANCE.createData()));

		newChildDescriptors.add(
				createChildParameter(TRADESPackage.Literals.ANALYSIS__THREAT, TRADESFactory.eINSTANCE.createThreat()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__THREAT,
				TRADESFactory.eINSTANCE.createExternalThreat()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__CONTROL,
				TRADESFactory.eINSTANCE.createControl()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__THREATALLOCATION,
				TRADESFactory.eINSTANCE.createThreatAllocationRelation()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__THREATMITIGATION,
				TRADESFactory.eINSTANCE.createThreatMitigationRelation()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__AFFECTRELATION,
				TRADESFactory.eINSTANCE.createAffectRelation()));

		newChildDescriptors.add(createChildParameter(TRADESPackage.Literals.ANALYSIS__SCORESYSTEM,
				TRADESFactory.eINSTANCE.createScoreSystem()));
	}

}
