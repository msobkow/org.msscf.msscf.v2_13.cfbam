// Description: Java 11 Object interface for CFBam PopTopDep.

/*
 *	org.msscf.msscf.CFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFBam 2.13 Business Application Model
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.msscf.msscf.v2_13.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfsec.CFSec.*;
import org.msscf.msscf.v2_13.cfint.CFInt.*;
import org.msscf.msscf.v2_13.cfsec.CFSecObj.*;
import org.msscf.msscf.v2_13.cfint.CFIntObj.*;
import org.msscf.msscf.v2_13.cfbam.CFBam.*;

public interface ICFBamPopTopDepObj
	extends ICFBamPopDepObj
{
	/**
	 *	Get the current edition of this PopTopDep instance as a ICFBamPopTopDepEditObj.
	 *
	 *	@return	The ICFBamPopTopDepEditObj edition of this instance.
	 */
	ICFBamPopTopDepEditObj getEditAsPopTopDep();

	/**
	 *	Get the ICFBamPopTopDepTableObj table cache which manages this instance.
	 *
	 *	@return	ICFBamPopTopDepTableObj table cache which manages this instance.
	 */
	ICFBamPopTopDepTableObj getPopTopDepTable();

	/**
	 *	Get the CFBamPopTopDepBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFBamPopTopDepBuff instance which currently backs this object.
	 */
	CFBamPopTopDepBuff getPopTopDepBuff();

	/**
	 *	Get the required long attribute ContRelationTenantId.
	 *
	 *	@return	The required long attribute ContRelationTenantId.
	 */
	long getRequiredContRelationTenantId();

	/**
	 *	Get the required long attribute ContRelationId.
	 *
	 *	@return	The required long attribute ContRelationId.
	 */
	long getRequiredContRelationId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required ICFBamRelationObj instance referenced by the ContRelation key.
	 *
	 *	@return	The required ICFBamRelationObj instance referenced by the ContRelation key.
	 */
	ICFBamRelationObj getRequiredContainerContRelation();

	/**
	 *	Get the required ICFBamRelationObj instance referenced by the ContRelation key.
	 *
	 *	@return	The required ICFBamRelationObj instance referenced by the ContRelation key.
	 */
	ICFBamRelationObj getRequiredContainerContRelation( boolean forceRead );

	/**
	 *	Get the array of optional ICFBamPopSubDep1Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep1Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep1Obj> getOptionalComponentsPopDep();

	/**
	 *	Get the array of optional ICFBamPopSubDep1Obj array of instances referenced by the PopDep key.
	 *
	 *	@return	The optional ICFBamPopSubDep1Obj[] array of instances referenced by the PopDep key.
	 */
	List<ICFBamPopSubDep1Obj> getOptionalComponentsPopDep( boolean forceRead );

}
