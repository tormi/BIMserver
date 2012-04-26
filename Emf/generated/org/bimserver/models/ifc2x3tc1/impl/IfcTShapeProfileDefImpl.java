/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.IfcTShapeProfileDef;
import org.bimserver.models.ifc2x3tc1.LogPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc TShape Profile Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getDepthAsString <em>Depth As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeWidth <em>Flange Width</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeWidthAsString <em>Flange Width As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebThickness <em>Web Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebThicknessAsString <em>Web Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeThickness <em>Flange Thickness</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeThicknessAsString <em>Flange Thickness As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFilletRadius <em>Fillet Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFilletRadiusAsString <em>Fillet Radius As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeEdgeRadius <em>Flange Edge Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeEdgeRadiusAsString <em>Flange Edge Radius As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebEdgeRadius <em>Web Edge Radius</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebEdgeRadiusAsString <em>Web Edge Radius As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebSlope <em>Web Slope</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getWebSlopeAsString <em>Web Slope As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeSlope <em>Flange Slope</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getFlangeSlopeAsString <em>Flange Slope As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getCentreOfGravityInY <em>Centre Of Gravity In Y</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcTShapeProfileDefImpl#getCentreOfGravityInYAsString <em>Centre Of Gravity In YAs String</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcTShapeProfileDefImpl extends IfcParameterizedProfileDefImpl implements IfcTShapeProfileDef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTShapeProfileDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDepth() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__DEPTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepth(double newDepth) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__DEPTH, newDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDepthAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepthAsString(String newDepthAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__DEPTH_AS_STRING, newDepthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlangeWidth() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeWidth(double newFlangeWidth) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH, newFlangeWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeWidthAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeWidthAsString(String newFlangeWidthAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_WIDTH_AS_STRING, newFlangeWidthAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWebThickness() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThickness(double newWebThickness) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS, newWebThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebThicknessAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebThicknessAsString(String newWebThicknessAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_THICKNESS_AS_STRING, newWebThicknessAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlangeThickness() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThickness(double newFlangeThickness) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS, newFlangeThickness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeThicknessAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeThicknessAsString(String newFlangeThicknessAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_THICKNESS_AS_STRING, newFlangeThicknessAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFilletRadius() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadius(double newFilletRadius) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS, newFilletRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadius() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadius() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilletRadiusAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilletRadiusAsString(String newFilletRadiusAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING, newFilletRadiusAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFilletRadiusAsString() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilletRadiusAsString() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FILLET_RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlangeEdgeRadius() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeEdgeRadius(double newFlangeEdgeRadius) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS, newFlangeEdgeRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeEdgeRadius() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeEdgeRadius() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeEdgeRadiusAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeEdgeRadiusAsString(String newFlangeEdgeRadiusAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING, newFlangeEdgeRadiusAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeEdgeRadiusAsString() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeEdgeRadiusAsString() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_EDGE_RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWebEdgeRadius() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebEdgeRadius(double newWebEdgeRadius) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS, newWebEdgeRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebEdgeRadius() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebEdgeRadius() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebEdgeRadiusAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebEdgeRadiusAsString(String newWebEdgeRadiusAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING, newWebEdgeRadiusAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebEdgeRadiusAsString() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebEdgeRadiusAsString() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_EDGE_RADIUS_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWebSlope() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSlope(double newWebSlope) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE, newWebSlope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebSlope() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebSlope() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWebSlopeAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebSlopeAsString(String newWebSlopeAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING, newWebSlopeAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWebSlopeAsString() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWebSlopeAsString() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__WEB_SLOPE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFlangeSlope() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlope(double newFlangeSlope) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE, newFlangeSlope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeSlope() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeSlope() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlangeSlopeAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlangeSlopeAsString(String newFlangeSlopeAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING, newFlangeSlopeAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFlangeSlopeAsString() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlangeSlopeAsString() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__FLANGE_SLOPE_AS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCentreOfGravityInY() {
		return (Double) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInY(double newCentreOfGravityInY) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y, newCentreOfGravityInY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInY() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInY() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_Y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCentreOfGravityInYAsString() {
		return (String) eGet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentreOfGravityInYAsString(String newCentreOfGravityInYAsString) {
		eSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING, newCentreOfGravityInYAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCentreOfGravityInYAsString() {
		eUnset(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCentreOfGravityInYAsString() {
		return eIsSet(LogPackage.Literals.IFC_TSHAPE_PROFILE_DEF__CENTRE_OF_GRAVITY_IN_YAS_STRING);
	}

} //IfcTShapeProfileDefImpl
