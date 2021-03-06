/**
 */
package tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Valid Target Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tosca.ValidTargetType#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see tosca.ToscaPackage#getValidTargetType()
 * @model
 * @generated
 */
public interface ValidTargetType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Ref</em>' attribute.
	 * @see #setTypeRef(QName)
	 * @see tosca.ToscaPackage#getValidTargetType_TypeRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 * @generated
	 */
	QName getTypeRef();

	/**
	 * Sets the value of the '{@link tosca.ValidTargetType#getTypeRef <em>Type Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Ref</em>' attribute.
	 * @see #getTypeRef()
	 * @generated
	 */
	void setTypeRef(QName value);

} // ValidTargetType
