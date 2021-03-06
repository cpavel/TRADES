/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.Control#getMitigates <em>Mitigates</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getImplementedBy <em>Implemented By</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getID <em>ID</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getDescription <em>Description</em>}</li>
 *   <li>{@link dsm.TRADES.Control#getMitigationrRelations <em>Mitigationr Relations</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mitigates</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Threat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigates</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_Mitigates()
	 * @model
	 * @generated
	 */
	EList<Threat> getMitigates();

	/**
	 * Returns the value of the '<em><b>Implemented By</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.Component}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.Component#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implemented By</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_ImplementedBy()
	 * @see dsm.TRADES.Component#getImplements
	 * @model opposite="implements"
	 * @generated
	 */
	EList<Component> getImplementedBy();

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see dsm.TRADES.TRADESPackage#getControl_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Control#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see dsm.TRADES.TRADESPackage#getControl_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link dsm.TRADES.Control#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Mitigationr Relations</b></em>' containment reference list.
	 * The list contents are of type {@link dsm.TRADES.ThreatMitigationRelation}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.ThreatMitigationRelation#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mitigationr Relations</em>' containment reference list.
	 * @see dsm.TRADES.TRADESPackage#getControl_MitigationrRelations()
	 * @see dsm.TRADES.ThreatMitigationRelation#getControl
	 * @model opposite="control" containment="true"
	 * @generated
	 */
	EList<ThreatMitigationRelation> getMitigationrRelations();

} // Control
