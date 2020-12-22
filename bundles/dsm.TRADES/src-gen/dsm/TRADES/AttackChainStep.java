/**
 */
package dsm.TRADES;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attack Chain Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelation <em>Threat Allocation Relation</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getDifficulty <em>Difficulty</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getNext <em>Next</em>}</li>
 *   <li>{@link dsm.TRADES.AttackChainStep#getPrevious <em>Previous</em>}</li>
 * </ul>
 *
 * @see dsm.TRADES.TRADESPackage#getAttackChainStep()
 * @model
 * @generated
 */
public interface AttackChainStep extends EObject {
	/**
	 * Returns the value of the '<em><b>Step Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Num</em>' attribute.
	 * @see #setStepNum(String)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_StepNum()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	String getStepNum();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getStepNum <em>Step Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Num</em>' attribute.
	 * @see #getStepNum()
	 * @generated
	 */
	void setStepNum(String value);

	/**
	 * Returns the value of the '<em><b>Threat Allocation Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threat Allocation Relation</em>' reference.
	 * @see #setThreatAllocationRelation(ThreatAllocationRelation)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_ThreatAllocationRelation()
	 * @model
	 * @generated
	 */
	ThreatAllocationRelation getThreatAllocationRelation();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getThreatAllocationRelation <em>Threat Allocation Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threat Allocation Relation</em>' reference.
	 * @see #getThreatAllocationRelation()
	 * @generated
	 */
	void setThreatAllocationRelation(ThreatAllocationRelation value);

	/**
	 * Returns the value of the '<em><b>Difficulty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * optional difficulty of implementing step, overriding ThreatAllocationRelation difficulty rating
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Difficulty</em>' attribute.
	 * @see #setDifficulty(int)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_Difficulty()
	 * @model
	 * @generated
	 */
	int getDifficulty();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getDifficulty <em>Difficulty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Difficulty</em>' attribute.
	 * @see #getDifficulty()
	 * @generated
	 */
	void setDifficulty(int value);

	/**
	 * Returns the value of the '<em><b>Impact Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impact Description</em>' attribute.
	 * @see #setImpactDescription(String)
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_ImpactDescription()
	 * @model
	 * @generated
	 */
	String getImpactDescription();

	/**
	 * Sets the value of the '{@link dsm.TRADES.AttackChainStep#getImpactDescription <em>Impact Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impact Description</em>' attribute.
	 * @see #getImpactDescription()
	 * @generated
	 */
	void setImpactDescription(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChainStep}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.AttackChainStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_Next()
	 * @see dsm.TRADES.AttackChainStep#getPrevious
	 * @model opposite="previous"
	 * @generated
	 */
	EList<AttackChainStep> getNext();

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference list.
	 * The list contents are of type {@link dsm.TRADES.AttackChainStep}.
	 * It is bidirectional and its opposite is '{@link dsm.TRADES.AttackChainStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference list.
	 * @see dsm.TRADES.TRADESPackage#getAttackChainStep_Previous()
	 * @see dsm.TRADES.AttackChainStep#getNext
	 * @model opposite="next"
	 * @generated
	 */
	EList<AttackChainStep> getPrevious();

} // AttackChainStep
